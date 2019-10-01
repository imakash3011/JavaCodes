import java.util.Scanner;
class Whitespace
{
	public static void main(String[] args)
	{
	String sentence;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the sentence whose whitestring you want to remove : ");
	sentence=obj.nextLine(); //don't forget to use nextLine() becz without it ,program will give an error 
	System.out.println(sentence);
	sentence=sentence.replaceAll("\\s","");
	System.out.println("after removing spaces : " + sentence);
	}
}