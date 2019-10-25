package Program_6;

import java.util.Scanner;

public class StrToInt {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.next();
        //int num=Integer.valueOf(str);   // use any of two way to convert
        int num=Integer.parseInt(str);  // used to convert String into integer
        System.out.println(num);
    }
}
