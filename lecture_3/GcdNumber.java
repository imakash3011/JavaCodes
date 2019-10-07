package First_Program;

import java.util.Scanner;
//import java.util.*;

public class GcdNumber {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int N1=obj.nextInt();
        int N2=obj.nextInt();
        int rem;
        while(N2>0)
        {
            rem=N1%N2;
            N1=N2;
            N2=rem;
            if(N2==0)
            {
                System.out.println(N1);
            }
        }
    }
}
