import java.util.Scanner;
class Scndptn
{
	public static void main(String [] args)
	{
	int n;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the value of n ");
	n=obj.nextInt();
	for(int i=1;i<=n;i++)
	{
	for(int j=1;j<=i;j++)
	{
	System.out.print(j);
	System.out.print(" "); //must note onething that where to use print and println when writing program for pattern printing
	}
	System.out.println(" ");
	}
	}
}