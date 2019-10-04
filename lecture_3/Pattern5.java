package First_Program;

public class Pattern5 {
        public static void main(String arg[])
        {
            int row,col,k;
            for(row=0;row<4;row++)
            {
                for(col=1;col<4-row;col++)
                {
                    System.out.print("  ");
                }
                for(k=0;k<=row;k++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
}
