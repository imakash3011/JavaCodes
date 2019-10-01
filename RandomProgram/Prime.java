import java.util.Scanner;
class Prime
{
	public static void main(String[] args)
	{
	int n;
	boolean flag=false;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the value of n ");
	n=obj.nextInt();

	for(int i=2;i<=n/2; i++)
	{
	if(n%i==0)
	{
		flag=true; // jb divide hoga koi number to flag true ho jayega aur loop terminate ho jayega it means wo number prime nhi hai
		break;
	}
	}
	if(flag!=true)
	
		System.out.println("it is prime number");

	else

		System.out.println("it is not prime");

	}
}

//In the above program, for loop is used to determine if the given number num is prime or not. We only have to loop through 2 to half of num, because no number is divisible by more than its half.

//Inside the for loop, we check if the number is divisible by any number in the given range (2..num/2). If it is, flag is set to true and we break out of the loop. This determines num is not a prime number.

//If num isn't divisible by any number, flag is false and num is a prime number.