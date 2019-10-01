import java.util.Scanner;
class Leap
{
	public static void main(String[] args)
	{
	int year;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the year ");
	year=obj.nextInt();
	if((year%4==0 && year % 100!= 0) || year % 400 ==0)
	{
	System.out.println("the year is a leap year ");
	}
	else
	{
	System.out.println("the year is not a leap year");
	}
	}
}