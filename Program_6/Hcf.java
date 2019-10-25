package Program_6;

import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        int [] nums=new int[N];
        int i=0;
        for (i = 0; i < nums.length ; i++) {
            nums[i]=obj.nextInt();
        }
        for (i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        int min=nums[0];
        for (i = 0; i <nums.length ; i++) {
            if(min> nums[i]){
                min=nums[i];
            }
           //System.out.println(min);
        }
        System.out.println(min);
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % min == 0) {
            } else {
                min--;
            }
        }
        System.out.println(min);
    }
}
