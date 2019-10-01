import java.util.Scanner;
class Fibo
{
	public static void main(String[] args)
	{
	int n,a=0,b=1,sum=0;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter a value to get the fibonacci series ");
	n=obj.nextInt();
	for(int i=0; i<n ; i++)
	{ 
	System.out.print(a + " + " );
	sum = a + b;
	a=b;
	b=sum;
	}
	}
}