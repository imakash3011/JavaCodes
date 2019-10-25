package Program_6;

import java.util.Scanner;

public class MatRot {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[][] nums = new int[N][N];
        int row=0;
        int col=0;
        for (row = 0; row < N; row++) {
            for (col = 0; col < N; col++) {
                nums[row][col] = obj.nextInt();
            }
        }
        for (row = 0; row < N; row++) {
            for (col = 0; col < N; col++) {
                System.out.print(nums[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (col = N-1; col >= 0; col--) {
            for (row = 0; row < N  ; row++) {
                System.out.print(nums[row][col]+ " ");
            }
            System.out.println();
        }

    }
}
