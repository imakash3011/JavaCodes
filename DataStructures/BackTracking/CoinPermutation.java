package Program_14.BackTracking;

public class CoinPermutation {
    static int count=0;
    public static void main(String[] args) {
        CoinChangePermutation(new int[]{2,3,5,6},10,"");

    }




    public static void CoinChangePermutation(int[] denom,int amount,String ans){

        if (amount==0){
            count++;
            System.out.println(count + ". "+ ans);
            return;
        }

        //we can also apply the following condition which will check the -ve base-case
//        if (amount==0){
//            return;
//        }

        for (int i = 0; i <denom.length ; i++) {
            //if the denomination is greater than the amount that we want to use then discard them

            //ans+denom will show denomination used currently
            // amount-denom[i] : it will remaining coin to complete the coin change
            //it will track the coin that are ahead of the given coin
            if (amount>=denom[i]) {
                CoinChangePermutation(denom, amount - denom[i], ans + denom[i]);
            }
        }
    }
}
