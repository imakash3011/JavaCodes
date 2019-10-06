package First_Program;

import java.util.Scanner;
import java.util.*;

public class Armst{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int number=obj.nextInt();
        int n=number;
        int temp=number;
        int rem;
        double x = 0;// enter the size of the integer
        int c=0;
        while(n>0) {

            n /= 10;
            c+=1;
        }
        while(number >0){
            rem = number % 10;
            //number = Integer.toString(number).length();
            number = number / 10;
            x = x + Math.pow(rem,c);
            //System.out.println(x);
        }
        //System.out.println(x);
        if(temp==x)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
