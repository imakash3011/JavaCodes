package Fifth_Program;

import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();    //No. of row
        int M = obj.nextInt();    //No. of column
        int target=obj.nextInt();  //target
        int arr[][] = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = obj.nextInt();
                //System.out.print(arr[i][j]);
            }
            // System.out.println();
        }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                  //  System.out.print(arr[i][j] + "\t");
                }
               // System.out.println();
            }
       // System.out.println(binary(arr,target));
        System.out.println(Matrix(arr,N,M,target));


    }
    public  static int Matrix(int arr[][] ,int N,int M,int target){
        int row=0;
        int col=0;
//        if(arr[row][col]!=target){
//            return 0;
//        }
        for ( row = 0; row < N; row++) {
            for ( col = 0; col < M; col++) {
                if(arr[row][col]==target) {
                    return 1;
                }
            }
        }
        return 0;
    }
//    public static int binary( int arr[][],int target){
//        int start = 0;
//        int end = arr.length - 1;
//        System.out.println(end);
//        int mid = (start + end) / 2;
//        while(start<end) {
//            if (arr[start][mid] == target) {
//                return 1;
//            } else if (arr[start][mid] < target) {
//                start=mid+1;
//            } else {
//                end=mid-1;
//            }
//        }
//        return 0;
//    }

    // use this code if facing problem in above one
//import java.util.*;
//    public class Main {
//
//        public static void main(String args[]) {
//            Scanner input = new Scanner(System.in);
//
//            int n = input.nextInt();
//            int m = input.nextInt();
//            int a[][] = new int[n][m];
//            for(int i = 0; i < n; i++){
//                for(int j = 0; j < m; j++){
//                    a[i][j] = input.nextInt();
//                }
//            }
//            int key = input.nextInt();
//
//            int i = 0, j = m-1;
//            int flag = 0;
//            while(i < n && j>= 0){
//                if(key == a[i][j]){
//                    flag = 1;
//                    break;
//                }else if(key < a[i][j])
//                    j--;
//                else
//                    i++;
//            }
//            System.out.println(flag);
//        }
//    }

}
