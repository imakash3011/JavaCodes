package Program_7;

import java.util.Scanner;

public class PrimeVisits {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        int[] nums=new int[N];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = obj.nextInt();
            }
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i] +" ");
        }
        System.out.println(prime(nums,0,0));
    }
    public static int prime(int [] nums,int index,int count){
        if(index==nums.length-1){
            return 0;
        }
        int i=0;
        for (index = 0; index <nums.length-1; index++) {
            if((nums[index]) % (index-1)==0){
                count++;
                if(count==2){
                    i++;
                }
            }

        }
        return i;
    }
}
