package Second_program;

import java.util.Scanner;

public class Pt4 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        for (int row = 1; row < n; row++) {

            for (int k = 1; k <=row - 1; k++) {
                System.out.print("  ");
            }
            for (int col = 1; col <n-row+1; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
