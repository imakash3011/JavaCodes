package First_Program;

import java.util.Scanner;

public class Kaka {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();

            int row = 1;
            int rw  = n-1;
            int i=1;
            while (row <= n) {
                i++;
                int col = 1;
                while (col <= row) {
                    System.out.print(col + " ");
                    col = col + 1;
                }

                while (rw>=1){
                    System.out.print("* ");
                    rw -= 1;
                }

                rw =n-i;
                    System.out.println();
                row = row + 1;
            }
        }
    }
