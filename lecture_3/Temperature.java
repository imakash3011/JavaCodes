package First_Program;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
      int min=obj.nextInt();
       int max=obj.nextInt();
       int step=obj.nextInt();
//        for (int i = 0; i>min && i<max ; i=i+step);
        int F;         //=obj.nextInt();
        int n=(max-min)/step;
        int i=0;
        int x=0;
        while (x<=n) {
            i = x * step;
            F = min + i;
            int C = ((F - 32) * 5) / 9;
            System.out.println(F+" " +C);
            x+=1;
        }
    }
}
