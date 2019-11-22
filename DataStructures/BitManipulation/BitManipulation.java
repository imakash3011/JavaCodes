package Program_14.BitManipulation;

public class BitManipulation {

    public static void main(String[] args) {
        //here we are given 6 i.e n and we know its 5 i.e ith bit is 0 or 1
        System.out.println(extractBit(22,5));
        //here if 4 bit if 21 is 0 than change it to 1 and vice versa
        //and print the answer that will come after changing bit
        System.out.println(setBit(21,4));

        System.out.println(resetBit(21,4));

        //it will tell the first position we get the 1 in binary represent of n or here 6
        System.out.println(rightMostSetBit(6));

        System.out.println(addOne(5));

        System.out.println(magicNo(5));

        System.out.println(pascalSum(5));

        System.out.println(powerOfTwo(16));
    }
    public static int extractBit(int n,int i){
        //counting from 1 thats why i-1
        //to left shift to extactly do masking with the element with which we want to do bitmanipulation
//        for (int j = 1; j <=i-1; j++) {
//            i=(i<<1);
//        }
        int mask=1;
        mask=1<<(i-1);
        n=n & mask;
        return (n==0 ? 0 : 1);
//        System.out.println(n);
    }

    public static int setBit(int n,int i){
        int mask=1;
        mask=1<<(i-1);
        n=n | mask;
        return n;
    }

    public static int resetBit(int n,int i){
        int mask=1;
        mask= ~(1<<(i-1));
        n=n & mask;
        return n;
    }

    public static int rightMostSetBit(int n){
        //position
        int pos=1;
        int mask=1;
        while ((n & mask)==0){
            pos++;
            mask=mask<<1;
        }
        return pos;
    }


    public static int addOne(int n){
        int mask=1;
        while ((n& mask)!=0){
            n=n ^ mask;
            mask=(mask<<1);
        }
        n=n^mask;
        return n;
    }

    public static int magicNo(int i){
        int ans=0;
        int pow=1;
        while (i != 0){
            pow=pow*5;
            //to check whether LSB is contributing or not
            if ((i&1)!=0){
                ans=ans+pow;
            }
            i=(i>>1);

        }
        return ans;
    }

    public static int pascalSum(int n){
        int res=(1<<n);
        return res-1;
    }

    public static boolean powerOfTwo(int n){

        if (n!=0){
            if ((n & (n-1))==0){
                return true;
            }
        }
        return false;
//        return ((n&(n-1))==0);

//        int res=n & (n-1);
//        return (res ==0 ? true :false);
        //handle the  case for 0 externally
    }
}
