class Market
{
	void product(int a,char b)
	{
	System.out.println(a,b);
	}
}
class Kasna
{
	void product(int y,int z)
	{
	System.out.println(y,z);
	}
}
class Hair
{
	public static void main(String args[])
	{
	Market obj1 = new Market();
	Kasna obj2 = new Kasna();
	obj1.product(5,'M');
	obj2.product(2,4);
	}
}