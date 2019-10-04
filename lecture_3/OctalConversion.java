package First_Program;

import java.util.Scanner;

public class OctalConversion {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int deci=obj.nextInt();
        int octal=0;
        int place=1;
        //char dig[]={'0','1','2','3','4','5','6','7'};    //    .......
        while(deci>0) {
            int rem = deci % 8;
            //octal=dig[rem]+octal;
            deci=deci/8;
            octal = octal+ rem*place;
            place=place*8;
        }
        System.out.println(octal);
    }
}