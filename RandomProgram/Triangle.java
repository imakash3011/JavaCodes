import java.util.Scanner;
class Triangle
{
	public static void main(String [] args)
	{
	int n;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the value of n");
	n=obj.nextInt();
	for(int i=1;i<=n;i++)
	{
	for(int j=n-i;j>0;j--)
	{
		System.out.print("  ");
	}
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
		System.out.print("  "); //always note where to use print and where to use println 
	}
		System.out.println("");
	}
	}
}