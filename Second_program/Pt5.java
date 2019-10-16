package Second_program;

import java.util.Scanner;

public class Pt5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int row = 1;
        for (int v_row = 1; v_row <= 2 * n - 1; v_row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

            if (v_row < n - 1) {
                row = row + 1;
            } else {
                row = row - 1;
            }
            v_row = v_row + 1;
        }
    }
}
