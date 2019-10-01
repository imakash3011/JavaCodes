import java.util.Scanner;
import java.util.*;
class Lexicographical
{
	public static void main(String [] args)
	{
	int n;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the Size of String array");
	n=obj.nextInt();
	word[]=new String[n];
	String word=obj.next();
	for(int i=0;i<n;i++)
	{
	for(int j=i+1;j<n;j++)
	{
	if(word[i].compareTo(word[j])>0)
	{
	String temp=word[i];
	word[i]=word[j];
	word[j]=temp;
	}
	}
	}
	System.out.println("the lexicographical order is :  ");
	for(int i=0;i<n;i++)
	{
		System.out.println(word[i]);
	}
	}
}