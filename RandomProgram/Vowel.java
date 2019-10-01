import java.util.Scanner;
class Vowel
{
	public static void main(String args[])
	{
	char ch;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the value of ch");
	ch=obj.next().charAt(0);   // See here carefully and note down this method for taking character input from user
	if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u')
	{
	System.out.print("entered value is an vowel");
	}
	else
	{
	System.out.println("entered value is an consonant");
	}
	}
}