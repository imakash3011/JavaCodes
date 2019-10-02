class Abc
{
public int sum(int a,int b)
{
int c=a+b;
return c;
}
}
class Efg
{
public static void main(String args[])
{
Abc obj=new Abc();
int i=obj.sum(2,3);
System.out.println("sum of two number is " +i);
}
}