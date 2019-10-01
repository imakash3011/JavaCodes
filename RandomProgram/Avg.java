import java.util.Scanner;
class Avg
{
	public static void main(String [] args)
	{
	int n,sum=0;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the size of th array ");
	n=obj.nextInt();
	int arr[]=new int[n];
	System.out.println("enter the elements of Array ");
	for(int i=0;i<n;i++)
	{
	arr[i]=obj.nextInt();
	sum += arr[i];
	}
	int average=sum/n;
	System.out.printf("%d is an average of required array ", average);

	}
}