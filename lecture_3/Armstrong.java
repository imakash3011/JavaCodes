package First_Program;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int number=obj.nextInt();
        int n=obj.nextInt();
        double x = 0;// enter the size of the integer
        int c=0;
        while(number != 0){

 //       while(number>0) {
//            {
//                // num = num/10
//                number /= 10;
//                c+=1;
//            }
            int rem = number % 10;
            //number = Integer.toString(number).length();
            x = x + Math.pow(rem,n);
            number = number / 10;
            //System.out.println(x);
        }
        System.out.println(x);
    }
}
