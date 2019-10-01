import java.util.Scanner;
class Largest
{
	public static void main(String [] args)
	{
	int a,b,c;
	Scanner obj=new Scanner(System.in);
	System.out.println(" enter the value of a , b, c respectively ");
	a=obj.nextInt();
	b=obj.nextInt();
	c=obj.nextInt();
	if(a>b && a>c)
	{
	System.out.print("a is the largest number ");
	}
	else if(b>a && b>c)
	{
	System.out.println(" b is the largest number ");
	}
	else
	{
	System.out.println(" c is the largest number");
	}
	}
}