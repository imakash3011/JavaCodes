package Fifth_Program;

import java.util.Scanner;

public class SpiralArray {
        public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            int M = obj.nextInt();
            int N = obj.nextInt();
            int nums[][] = new int[M][N];
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    nums[i][j] = obj.nextInt();
                    //System.out.print(arr[i][j]);
                }
                //System.out.println();
            }
//            for (int i = 0; i < M; i++) {
//                for (int j = 0; j < N; j++) {
//                    //arr[i][j]=obj.nextInt();
//                    System.out.print(nums[i][j] + "\t");
//                }
//                System.out.println();
//            }

            clockSpiral(nums);
        }

        public static void clockSpiral(int[][] nums){

            int left = 0;
            int top = 0;
            int right = nums[0].length - 1;
            int bottom = nums.length - 1;

            while (left <= right && top <= bottom) {
                for (int col = left; col <= right && top <= bottom ; col++) {
                    System.out.print(nums[top][col]+",");
                }
                top++;

                for (int row = top; row <= bottom && left <= right; row++) {
                    System.out.print(nums[row][right]+",");
                }
                right--;

                for (int col = right; col >= left && top <= bottom; col--) {
                    System.out.print(nums[bottom][col]+",");
                }
                bottom--;

                for (int row = bottom; row >= top && left <= right; row--) {
                    System.out.print(nums[row][left]+",");
                }
                left++;
            }
            System.out.println("END");
        }
    }

