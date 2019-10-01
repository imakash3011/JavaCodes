import java.util.Scanner;
class Factor
{
	public static void main(String [] args)
	{
	int n;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter a number");
	n=obj.nextInt();
	for(int i=1;i!=0;i++)
	{
	if(n%i==0)
	{
	System.out.println(i);
	}
	}
	}
}