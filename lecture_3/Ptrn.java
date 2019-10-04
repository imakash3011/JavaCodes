package First_Program;

class Ptrn{
    public static void main(String[]  args){
        int row=0;
        int v_mir=0;
        int n=4;
        while(v_mir<2*n-1){
            int col=0;
            while(col<=row){
                System.out.print("* ");
                col=col+1;
            }
            System.out.println();
            //col=col+1;
            if(v_mir<n-1){
                row=row+1;
            } else{
                row=row-1;
            }
            v_mir=v_mir+1;
      }
    }
}
