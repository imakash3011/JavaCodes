package Second_program;

import java.util.Scanner;

public class Pt3 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        for (int row = 1;  row<n;row++) {

            for (int col=n-row-1;col>=1;col--) {
                System.out.print("  ");
            }
            for(int k=n-1;k>n-row-1;k--){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
