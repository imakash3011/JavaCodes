import java.util.Scanner;
import java.io.*;
class TwoDi
{
public static void main(String[] args)
{
	int r=0,c=0,i,j;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the number of rows  ");
	r=obj.nextInt();
	System.out.println("enter the number of columns  ");
	c=obj.nextInt();
	int matrix[][]=new int[r][c];
	System.out.println("enter the elements of matrix");
	for(i=0;i<r;i++)
	{
	for(j=0;j<c;j++)
	{
	matrix[i][j]=obj.nextInt();
	}
 	}	

 	for(i=0;i<r;i++)
	{
	for(j=0;j<c;j++)
	{
		System.out.print(matrix[i][j]+" ");
	}
	System.out.println("\n");
 	}
}
}