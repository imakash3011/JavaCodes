package Program_6;

import java.util.Scanner;

public class PythaTri {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        if(N%2==0){
            int rem=N/2;
            int sq=rem*rem;
            sq=sq-1;
            System.out.print(sq+" ");
            sq=sq+2;
            System.out.print(sq);
        }else if(N%2==1){
            int rem=N*N;
            int sq=rem/2;
            System.out.print(sq+" ");
            sq=sq+1;
            System.out.print(sq);
        }
    }
}
