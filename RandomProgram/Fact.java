import java.util.Scanner;
class Fact
{
	public static void main(String[] args)
	{
	int n,factorial=1;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter a number ");
	n=obj.nextInt();
	for(int i=1;i<=n;i++)
	{
	factorial = factorial * i;
	//System.out.println(factorial);
	}
	System.out.println(factorial);
	}
}