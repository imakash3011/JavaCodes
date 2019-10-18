package Fourth_program;

public class RecPattern {
    public static void main(String[] args) {
        recPtrn(5,1,1);
    }

    public static void recPtrn(int n, int row, int col) {
        if(row>n){
            return;
        }
        if (col > row) {
            System.out.println();
            recPtrn(n,row+1,1);
            return;
        }
        System.out.print("*" + "\t");
        recPtrn(n,row,col+1);
    }
}
