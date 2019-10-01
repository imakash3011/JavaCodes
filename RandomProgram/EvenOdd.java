import java.util.Scanner;
class EvenOdd
{
	public static void main(String [] args)
	{
	int a;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the value of a");
	a=obj.nextInt();
	if(a%2==0)
	{
	System.out.println(" a is an even number");
	}
	else
	{
	System.out.println("a is an odd number");
	}
	}
}