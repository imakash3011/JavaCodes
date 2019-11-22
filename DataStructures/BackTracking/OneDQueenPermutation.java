package Program_14.BackTracking;

public class OneDQueenPermutation {
    static int count=0;
    public static void main(String[] args) {
//        QueenPermutation(new boolean[4],0,2,"");
        //pass lastboxused =-1 ,otherwise the for loop  inside the function will run from lastboxused+1 i.e 1 and zero will get discarded
        QueenCombination(new boolean[4],0,2,"",-1);

    }
    //qpsf:queen placed so far   and tq:total queen
    public static void QueenPermutation(boolean[] boxes,int qpsf,int tq,String ans){
       if (qpsf==tq){
           count++;
           System.out.println(count + ". "+  ans);
            return;
       }


        for (int i = 0; i < boxes.length; i++) {
            //one box can have only one queen
         if (boxes[i]==false){
                //it shows that one  queen has taken the seat in box
                boxes[i]=true;
                //qpsf+1 represent that one has already taken seat now do work for second queen
                //tq will remain same
                //in ans add the all answer by recursively tracking them
                //ans + "q" + qpsf + "b" + i + " "  :in this qpsf & i will give integer value which
                //will concatenate further with q and b to give their number
                QueenPermutation(boxes,qpsf+1,tq,ans + "q" + qpsf + "b" + i + " ");

                //now after performing above program ..undo all changes means apply backtracking program
                boxes[i]=false;

            }

        }
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
}
