interface Inbox
{
void a();
void b();
}
class Telegram implements Inbox
{
public void a()
 {
  System.out.println("this is my laptop");
 }
public void b()
 {
   System.out.println("i am learning java");
 }
}
class main
{
public static void main(String[] args)
{
Telegram obj=new Telegram();
obj.a();
obj.b();
}
}
