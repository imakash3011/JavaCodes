package Program_6;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        int P=obj.nextInt();
        int pow=1;
        while(P!=0){
            pow=pow*N;
            P--;
        }
        System.out.println(pow);
    }
}
