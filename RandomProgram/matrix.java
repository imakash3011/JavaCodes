import java.util.Scanner;
class Matrix
{
	public static void main(String[] args)
	{
	int row=0,col=0,i,j;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the Number of Row's ");
	row=obj.nextInt();
	System.out.println("Enter the number of column's ");
	col=obj.nextInt();
	int [][] arr=new int[row][col];
	System.out.println("Enter the elements of Matrix ");
	for(i=0;i<row;i++)
	{
	for(j=0;j<col;j++)  //remeber to intialise i=0 and j=0 becz matrix take value on the basis of 00,01,10,11  and so on......
	{
	arr[i][j]=obj.nextInt();
	}
	}

	for(i=0;i<row;i++)
	{
	for(j=0;j<col;j++)  //here on write both the with loop with  i=1 and j=1 it will give error....
	{
	System.out.print(arr[i][j]+ " ");
	}
	System.out.println(" \n ");
	}
	}
}