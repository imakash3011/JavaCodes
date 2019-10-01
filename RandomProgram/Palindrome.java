import java.util.Scanner;

class Palindrome
{
	public static void main(String [] args)
	{
	int n,remainder=0,reverse=0;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter a number");
	n=obj.nextInt();
	for(int i=1;n!=0;n/=10,i++)
	{
	remainder=n%10;
	reverse *= remainder;
	}
	if(n==reverse)
	System.out.println("number is palindrome ");
	else
	System.out.println("number is not palindrome ");
	}
}