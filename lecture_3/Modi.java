package First_Program;

import java.util.Scanner;
    public class Modi{
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();

            int i=1;
            int a;
            System.out.println("1");
            while(i<n)
            {
                i++;
                System.out.print(i);
                a=i-1;
                while(a>1)
                {
                    System.out.print("0");
                    a--;
                }
                System.out.println(i);

            }
        }
    }
