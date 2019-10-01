import java.util.Scanner;
import java.util.*;
class Roundoff
{
	public static void main(String [] args)
	{
	float n;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the value of n");
	n=obj.nextFloat(); //remember  here to write nextFloat
	System.out.printf("%.4f ",n);  //%.4f tells us that we are taking 4 digits after decimal in float form
	}
}