interface wire
{
	void a();
	void b();
}
class Light implements lamp
{
	public void  b()
	{
	System.out.println("work hard and achieve our aim ");
	}
	public void a()
	{
	System.out.println("work smarter not harder");
	}
}
class Bulb
{
	public static void main(String args[])
{
	Light obj=new Light();
	obj.b();
	obj.a();
}
}
