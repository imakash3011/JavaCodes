package First_Program;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int N1=obj.nextInt();
        int N2=obj.nextInt();
        for(int n=1;N1>0;n++){
            int sample= 3*n+2;
            if(sample%N2!=0){
                System.out.println(sample);
                N1--;
            }
        }
    }
}
