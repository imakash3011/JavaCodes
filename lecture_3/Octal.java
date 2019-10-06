package First_Program;

import java.util.Scanner;
import java.util.*;

public class Octal {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        int i=0;
        int oct=0;
        int a,b;
        while(N>0)
        {
            a=N%8;
            N/=8;
            b=(int) Math.pow(10,i);
            oct=oct+(b*a);
            i++;
        }
        System.out.println(oct);
    }
}

