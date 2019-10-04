package First_Program;

import java.util.Scanner;
public class Lcm {
    public static void main(String args[]){
        int N1, N2, max, step, lcm = 0;
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter first number ::");
        N1 = sc.nextInt();
       // System.out.println("Enter second number ::");
        N2 = sc.nextInt();
        if(N1 > N2){
            max = step = N1;
        }
        else{
            max = step = N2;
        }
        while(N1!= 0) {
            if(max % N1 == 0 && max % N2 == 0) {
                lcm = max;
                break;
            }
            max += step;
        }
        System.out.println(lcm);
    }
}