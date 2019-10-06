package First_Program;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int N,Digit;
        N=obj.nextInt();
        Digit=obj.nextInt();
        int c=0;
        while(N!=0){
            int rem=N%10;
            N=N/10;
            if(Digit==rem) {
                c = c + 1;
            }
            //System.out.println(c);
        }
//        if(c==0){
//            System.out.println("no repeatition");
//        }
        System.out.println(c);
    }
}
