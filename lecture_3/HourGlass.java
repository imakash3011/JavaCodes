package First_Program;

public class HourGlass {
        public static void main(String[] args){
            int row=5;
            int n=5;
            int v_mir= 0;
            while(v_mir<2*n-1){
                int col=5;
                int h_mir=0;
                while(h_mir<2*n-1){    // Problem 3 first change :- (h_mir<=2*n)
                    if(col<=row){           // problem 2 :- try it by using condition (col< n-row)
                        System.out.print(col+" ");
                    } else{
                        System.out.print("  "); //note maintain two space here
                    }
                    if(h_mir<n-1){   // Problem 3 second change.. :- (h_mir<n)
                        col=col+1;
                    } else{
                        col=col-1;
                    }
                    h_mir=h_mir+1;
                }
                System.out.println();
                if(v_mir<n-1){
                    row=row+1;
                }else{
                    row=row-1;
                }
                v_mir=v_mir+1;
            }
        }
    }
