import java.util.Scanner;
class Nsum
{
	public static void main(String[] args)
	{
	int n, sum=0;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter value of n");
	n=obj.nextInt();
	System.out.println("sum of natural number are");
	for(int i=0;i<n;i++)
	{
	
	sum += i;
	}
	System.out.println(sum);
	}
}