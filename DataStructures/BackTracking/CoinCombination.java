package Program_14.BackTracking;

public class CoinCombination {

    static int count=0;
    public static void main(String[] args) {

        CoinChangeCombination(new int[] {2,3,5,6},10,"",0);


    }


    public static void CoinChangeCombination(int[] denom,int amount,String ans,int lastDenomIdx){

        if (amount==0){
            System.out.println(ans);
            return;
        }


        for (int i = lastDenomIdx; i <denom.length ; i++) {
            //if the denomination is greater than the amount that we want to use then discard them

            //ans+denom will show denomination used currently
            // amount-denom[i] : it will remaining coin to complete the coin change
            //it will track the coin that are ahead of the given coin
            if (amount>=denom[i]) {
                CoinChangeCombination(denom, amount - denom[i], ans + denom[i], i);
            }
        }
    }
}
