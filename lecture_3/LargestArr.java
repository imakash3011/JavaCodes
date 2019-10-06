package First_Program;

import java.util.Scanner;

public class LargestArr {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i<n ; i++) {
            arr[i]=obj.nextInt();
        }
        System.out.println(large(arr));
    }

    static int large(int[] arr) {
        int max = arr[0];   //intialize

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}