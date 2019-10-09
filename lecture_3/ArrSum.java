package First_Program;

import java.util.Arrays;
import java.util.Scanner;

public class ArrSum {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i <N; i++) {
            arr[i]=obj.nextInt();
        }
        int target=obj.nextInt();
        Arrays.sort(arr);
        int k=0;
        while (k<N){
            int j=k+1;
            while(j<N){
                int sum=arr[k]+arr[j];
                if(sum ==target){
                    System.out.println(arr[k]+" and " +arr[j]);
                    // Don't write j++ here becz if the condition will not be true than the value of j will not increase
                }
                j+=1;
            }
            k++;
        }
    }
}
