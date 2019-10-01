import java.util.Scanner;
class ArrSum
{
	public static void main(String [] args)
	{
	int sum=0, n;
	System.out.println("enter the number of elements in ");
	Scanner obj=new Scanner(System.in);
	n=obj.nextInt();
	int salary[]= new int[n];
	System.out.println("enter all the elements of the array ");
	for(int i=0;i<n;i++)
	{
	salary[i]=obj.nextInt();
	sum += salary[i];
	}
	System.out.println(sum);
	}
}