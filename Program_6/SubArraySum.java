package Program_6;

import java.util.Scanner;

public class SubArraySum {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int T=obj.nextInt();
        int N=obj.nextInt();
        int[] nums=new int[N];
        int i=0;
        int j=0;
        for (i = 0; i < T; i++) {
            for (j = 0; j < N; j++) {
                nums[j] = obj.nextInt();
            }
            System.out.println();
        }

            for (i = 0; i < T; i++) {
                for (j = 0; j < N; j++) {
                    System.out.print(nums[j] + " ");
                }

                // System.out.println();
            }

    }
}
