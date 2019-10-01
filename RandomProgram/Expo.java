import java.util.Scanner;
class expo
{
	public static void main(String[] args)
	{
	int base,exp,result=1;   // always mind this initialisation of result
	Scanner obj=new Scanner(System.in);
	System.out.println("enter a number ");
	base=obj.nextInt();
	System.out.println("enter the power of above number ");
	exp=obj.nextInt();
	//int temp=base;
	for(int i=1;i<=exp;i++)
	{
		result *=base;
	}
	System.out.println(result);
	}
}