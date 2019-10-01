import java.util.Scanner;
class Reverse
{
	public static void main(String [] args)
	{
	int n,i;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter a number ,containing at two digit ");
	n=obj.nextInt();
	for(i=0;n!=0;n/=10, i++)
	{
	}
	System.out.println("number of digits are " + i);
	}
}