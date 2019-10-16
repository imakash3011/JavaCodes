package Second_program;

import java.util.Scanner;

public class Pt1 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int col=0;
        int row=0;
        for (row = 0;  row<n;row++) {
            for (col=0;col<n ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
