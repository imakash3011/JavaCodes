package Fourth_program;

import java.util.Arrays;
import java.util.Scanner;

public class ArrSumTri {
        public static void main(String[] args) {
            Scanner obj=new Scanner(System.in);
            int N=obj.nextInt();
            int[] arr=new int[N];
            for (int i = 0; i <N; i++) {
                arr[i]=obj.nextInt();
            }
            Arrays.sort(arr);
            int target=obj.nextInt();
            int k=0;
            while (k<N){
                int j=k+1;
                while(j<N){
                    int l=j+1;
                    while(l<N) {
                        int sum = arr[k] + arr[j] + arr[l];
                        if (sum == target) {
                            System.out.println(arr[k] + "," + arr[j] +" and "+ arr[l]);
                        }
                        l++;
                    }
                    j+=1;
                }
                k++;
            }
        }
    }
