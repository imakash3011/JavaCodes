package Program_14.BackTracking;

public class OneDQueenCombination {
    static int count=0;
    public static void main(String[] args) {
        //pass lastboxused =-1 ,otherwise the for loop  inside the function will run from lastboxused+1 i.e 1 and zero will get discarded
//        QueenCombination(new boolean[4],0,2,"",-1);

        CoinChangeCombination(new int[] {2,3,5,6},10,"",0);
       CoinChangePermutation(new int[]{2,3,5,6},10,"");

    }
    //qpsf:queen placed so far   and tq:total queen
    //here we are tracking the last box which is used
    public static void QueenCombination(boolean[] boxes,int qpsf,int tq,String ans,int lastBoxUsed){
        if (qpsf==tq){
            count++;
            System.out.println(count + ". "+  ans);
            return;
        }


        //donot take the box used already start count from one box ahead
        for (int i = lastBoxUsed+1; i < boxes.length; i++) {
            //one box can have only one queen
            if (boxes[i]==false){
                //it shows that one  queen has taken the seat in box
                boxes[i]=true;
                //qpsf+1 represent that one has already taken seat now do work for second queen
                //tq will remain same
                //in ans add the all answer by recursively tracking them
                //ans + "q" + qpsf + "b" + i + " "  :in this qpsf & i will give integer value which
                //will concatenate further with q and b to give their number
                QueenCombination(boxes,qpsf+1,tq,ans + "q" + qpsf + "b" + i + " ",i);

                //now after performing above program ..undo all changes means apply backtracking program
                boxes[i]=false;

            }

        }
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
