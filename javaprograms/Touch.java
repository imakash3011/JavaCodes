interface Wheel
{ 
	void wire();
	void screen();
}
class Cooler implements Wheel
{
	public void wire();
{ 
	System.out.println("this is my cooler");
}
	public void screen();
{
	 System.out.println("this is my laptop");
}
}
class Touch
{
	public static void main(String args[])
{
	Cooler obj= new Cooler();
	obj.wire();
}
}