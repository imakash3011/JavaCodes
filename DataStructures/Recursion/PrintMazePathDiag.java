package Program_15.Recursion;

public class PrintMazePathDiag {
    public static void main(String[] args) {
        //er and ec will decide the destination where we have to go
//        printMazePathDia(0,0,2,2,"");

        //0,0 will tell the starting point of maze while 2,2 will tell end point
        System.out.println(countMazePathDia(0,0,2,2));

    }

    public static void printMazePathDia(int cr,int cc,int er,int ec,String ans){
        if (cr==er && cc==ec){
            System.out.println(ans);
            return;
        }

        if (cr>er||cc>ec){
            return;
        }

        //cr:current row,current column,end row,end column
        //horizontal moves
        printMazePathDia(cr,cc+1,er,ec,ans+"H");
        //vertical moves
        printMazePathDia(cr+1,cc,er,ec,ans+"V");
        //diagonal moves means row and column both will increase
        printMazePathDia(cr+1,cc+1,er,ec,ans+"D");
    }


    public static int countMazePathDia(int cr,int cc,int er,int ec){
        if (cr==er && cc==ec){
        //if hit the +ve base-case return 1
            return 1;
        }

        if (cr>er||cc>ec){
            //if hit the -ve base-case return 0
            return 0;
        }

        //cr:current row,current column,end row,end column
        //horizontal moves and ch:count horizontal
        int ch=countMazePathDia(cr,cc+1,er,ec);
        //vertical moves
        int cv=countMazePathDia(cr+1,cc,er,ec);
        //diagonal moves means row and column both will increase
        int cd=countMazePathDia(cr+1,cc+1,er,ec);

        return ch+cv+cd;
    }
}
