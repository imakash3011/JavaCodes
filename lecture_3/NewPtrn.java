package First_Program;

import java.util.Scanner;

public class NewPtrn {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int row=0;
        int v_mir=0;
        while(v_mir<2*n-1){
            int col=0;
            while (col<=row){
                System.out.print("* ");
                col=col+1;
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
