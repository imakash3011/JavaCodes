package Fourth_program;

public class RecFact {
    public static void main(String[] args) {
        RecFact(5);
        System.out.println();

        Pwr(2,5);
        System.out.println();

        int[] arr={3,8,6,1,9,7};
        System.out.println(isSorted(arr,0));
        System.out.println();

        int[] myarr={6,8,1,1,8,3,4};
        System.out.println(firstIndex(myarr,0,8));
    }
    public static int RecFact(int n) {  //factorial of a number  using recursion
        if (n == 0) {
            return 1;
        }
        int Rf=RecFact(n-1);
        int res=n* Rf;
        System.out.println(res);
        return res;
    }

    public static int Pwr(int x,int n){   //Power of a number using recursion
        if(n==0){
            return 1;
        }
        int Rp=Pwr(x,n-1);
        int result=x*Rp;
        System.out.println(result);
        return result;
    }

    public static boolean isSorted(int[] arr,int si){ //to check whether the array is sorted or not
        if(si==arr.length){
            return true;
        }
        if(arr[si]>arr[si+1]){
            return false;
        }else{
            boolean restAns=isSorted(arr, si+1);
            return restAns;
        }
    }
    public static int firstIndex(int[] myarr,int si,int data){   //element index....not working properly
        if(myarr[si]==data){
            return -1;
        }
        if(myarr[si]==data){
            return si;
        }else{
            int restAns=firstIndex(myarr,si+1,data);
            return restAns;
        }
    }
}
