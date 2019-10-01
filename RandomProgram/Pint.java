import java.util.Scanner;
class Prime
{
	public static void main(String[] args)
	{
	int n,i=2,j=2;;
	boolean flag=false;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the value of n ");
	n=obj.nextInt();

	for(i;i<=n; i++)
	{
		for(j;j<i;i++)
		{
			if(j%i==0)
				flag=true;
				break;
		}
	}
	System.out.println(j);
	}
}
//write this code properly ....