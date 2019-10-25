package Program_6;

import java.util.Scanner;

public class PatternOne {
        public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            int N = obj.nextInt();
            int i=1;
            int a;
            System.out.println("1");
            while(i<N)
            {
                System.out.print("1");
                a=i-1;
                if(i%2==0) {
                    while (a > 0) {
                        System.out.print("1");
                        a--;
                    }
                }
                else{
                    while(a>0){
                        System.out.print("0");
                        a--;
                    }
                }
                System.out.println("1");
                i++;
            }
        }
    }
