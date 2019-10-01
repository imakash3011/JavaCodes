import java.util.Scanner;
class Table
{
	public static void main(String[] args)
	{
	int n,i,ans;
	Scanner obj=new Scanner(System.in);
	System.out.println("plz enter a value ");
	n=obj.nextInt();
	for(i=1;i<=10;i++)
	{ 
	ans=n*i;
	System.out.format("%d * %d = %d  \n",n,i, ans); // instead of "System.out.format" we can also use "printf" because we want our answer in a particular format
	//System.out.println();
	}
	}
}