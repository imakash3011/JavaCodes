package Second_program;

import java.util.Scanner;

public class Pt2 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        for (int row = 0;  row<n;row++) {

            for (int col=n-row;col>0;col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
