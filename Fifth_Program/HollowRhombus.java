package Fifth_Program;

import java.util.Scanner;
public class HollowRhombus {
        public static void main(String args[]) {
            Scanner scn=new Scanner(System.in);
            int N=scn.nextInt();
            int row,col;
            for(row=1;row<=N;row++)
            {
                for(col=1;col<=(2*N)-1;col++)
                {
                    if(col<=N)
                    {
                        if(row<N)
                        {
                            if(col==N-(row-1))
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        else
                        {
                            if(col<=N)
                                System.out.print("*");
                        }
                    }
                    else
                    {
                        if(row>1)
                        {
                            if(col==((2*N)-1)-(row-1))
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        else
                        if((col>N)&&(col<=(2*N)-1))
                            System.out.print("*");
                    }
                }
                System.out.println();
            }

        }
    }

