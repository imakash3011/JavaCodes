import java.util.Scanner;
class Reversed
{
	public static void main(String[] args)
	{
	int n ,num,i,digit=0;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter a number to reverse it ");
	n=obj.nextInt();
	for(i=0;n!=0;n/=10) // read all the condition very caefully
	{
	num=n%10;
	digit = digit*10 + num;
	}
	System.out.println(digit);
	}
}