import java.util.Scanner;
class Pattern
{
	public static void main(String[] args)
	{
	int i,j,n;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the value of n : ");
	n=obj.nextInt();
	for(i=1;i<=n;i++) 
	{
	for(j=1;j<=i;j++)
	{
	System.out.print("*");
	}
	System.out.println(" ");
	} 
	}
}