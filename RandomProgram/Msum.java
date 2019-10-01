import java.util.Scanner;
class Msum
{
	public static void main(String [] args)
	{
	int row1=0,col1=0,i,j,row2=0,col2=0;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the Number of Row's ");
	row1=obj.nextInt();
	System.out.println("Enter the number of column's ");
	col1=obj.nextInt();
	int [][] arr1=new int[row1][col1];
	
	for(i=0;i<row1;i++)
	{
	for(j=0;j<col1;j++)
	{
	arr1[i][j]=obj.nextInt();
	}
	}

	for(i=0;i<row1;i++)
	{
	for(j=0;j<col1;j++)
	{
	System.out.print(arr1[i][j]+ " ");
	}
	System.out.println("\n");
	}

	System.out.println("entries for second matrix ");
	int [][] arr2=new int[row1][col1];

	System.out.println("Enter the Number of Row's ");
	row2=obj.nextInt();
	System.out.println("Enter the number of column's ");
	col2=obj.nextInt();

	for(i=0;i<row2;i++)
	{
	for(j=0;j<col2;j++)
	{
	arr2[i][j]=obj.nextInt();
	}
	}

	for(i=0;i<row2;i++)
	{
	for(j=0;j<col2;j++)
	{
	System.out.print(arr2[i][j] + " ");
	}
	System.out.println("\n");
	}
	if(row2==col1)
	{
		System.out.println("Sum of matrix is Possible ");
	}
	else
	{
		System.out.println("Sum of matrix is not possible ");
	}
	//int row=row1+ row2;
	//int col=col1+col2;
	//int [] [] sum=int new[row][col];
	//int sum[i][j]=arr1[i][j]+arr2[i][j];
	//System.out.println(sum[i][j]+ " ");
	}
}