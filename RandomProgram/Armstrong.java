import java.util.Scanner;
import java.util.*;
class Armstrong
{
	public static void main(String[] args)
	{
	int n,num=0,remainder,j;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter a number ");
	n=obj.nextInt();
	int temp=n;
	for( j=0; temp!=0 ;temp/=10,j++)
	{
	}
    System.out.println("number of digits are " + j);

	for( int i=1; n!=0 ;n/=10,i++)
	{
	remainder=n%10;
	int result=(int)Math.pow(remainder,j);
	num += result;
	System.out.println(num);
	}
	System.out.println(num);

	if(num==n)
	{
	System.out.println("it is an armstrong number ");
	}
	else
	{
	System.out.println("it is not an armstrong number");
	}
	}
}
//according to me ....program is correct...