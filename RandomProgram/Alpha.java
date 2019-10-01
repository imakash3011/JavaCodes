import java.util.Scanner;
class Alpha
{
	public static void main(String [] args)
	{
	char ab;
	Scanner obj=new Scanner(System.in);
	System.out.println("please enter a single character");
	ab=obj.next().charAt(0);
	if(ab >='a' && ab<='z' || ab>='A' && ab<='Z')
	{
	System.out.println("the entered element is an alphabet ");
	}
	else
	{
	System.out.println("the entered element is not an alphabet");
	}
	}
}