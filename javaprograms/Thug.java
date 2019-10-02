interface lamp
{
void  b();
}
class Demo implements lamp
{
public void  b()
{
System.out.println("work hard and achieve our aim ");
}
}
class Thug
{
public static void main(String args[])
{
Demo obj=new Demo();
obj.b();
}
}
