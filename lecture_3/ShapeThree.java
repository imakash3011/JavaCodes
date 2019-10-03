package First_Program;

class ShapeThree{
    public static void main(String[] args){
        int row=0;
        int n=5;
        int v_mir= 0;
        while(v_mir<=2*n){
            int col=0;
            int h_mir=0;
            while(h_mir<=2*n){    // Problem 3 first change :- (h_mir<=2*n)
                if(col<n-row){           // problem 2 :- try it by using condition (col< n-row)
                    System.out.print("* ");
                } else{
                    System.out.print("  "); //note maintain two space here
                }
                if(h_mir<n){   // Problem 3 second change.. :- (h_mir<n)
                    col=col+1;
                } else{
                    col=col-1;
                }
                h_mir=h_mir+1;
            }
            System.out.println();
            if(v_mir<n){
                row=row+1;
            }else{
                row=row-1;
            }
            v_mir=v_mir+1;
        }
    }
}



