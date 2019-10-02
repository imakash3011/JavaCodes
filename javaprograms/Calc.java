import java.util.Scanner;
class Calc
{
public static void main(String args[])
{
int a,b,c;
Scanner obj =new Scanner(System.in);
 a=obj.nextInt();
 b=obj.nextInt();
 c=a*b;
System.out.println("Multipilcation of two number is " + c);
}
}