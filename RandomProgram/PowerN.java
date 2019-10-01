import java.util.Scanner;
import java.util.*;
class PowerN
{
	public static void main(String[] args)
	{
	int base,exp;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter a number ");
	base=obj.nextInt();
	System.out.println("enter the power of above number ");
	exp=obj.nextInt();
	int result=(int)Math.pow(base,exp); //see this line carefully
	System.out.println(result);

	}
}