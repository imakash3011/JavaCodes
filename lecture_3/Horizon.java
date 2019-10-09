package First_Program;

public class Horizon {
    public static void main(String[] args) {
        int row = 0;
        int n = 5;

        int h_mir = 0;
        while (h_mir < 2*n-1) {
            int col = 0;
            if (col <= row) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
            if (h_mir < n - 1) {
                col = col + 1;
            } else {
                col = col - 1;
            }
            System.out.println();
            h_mir = h_mir + 1;

        }
    }
}