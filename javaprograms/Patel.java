class Akash
{
String bahubali = "corruption";
String katappa = "devsena";
public void deoria()
{
System.out.println(" i am from Deoria ");
}
}
class Patel extends Akash
{
void gorakhpur()
{
System.out.println(" i am from Gorakhpur");
}
public static void main(String args[])
{
Patel obj= new Patel();
System.out.println(obj.bahubali);
System.out.println(obj.katappa);
obj.deoria();
}
}
