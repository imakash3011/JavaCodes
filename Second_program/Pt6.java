package Second_program;

import java.util.Scanner;

public class Pt6 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int nst=1;
        int space =2*n-3;

        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            for (int c_space = 1; c_space <(2*n-3) ; c_space=c_space-2) {
                System.out.print("  ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
            nst=nst+1;
            space=space+1;
        }
    }
}
