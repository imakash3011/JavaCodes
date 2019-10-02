class Jai
{
public int add(int m, int n)
{
int c=m+n;
return c;
}
}
class kali
{
public static void main(String args[])
{
Jai obj=new Jai();
int i=obj.add(9,3);
System.out.println("sum of two number is " +i);
}
}