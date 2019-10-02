class Abc
{
	void Uttar()
	{
	System.out.println("we are indian");
	}
}
class dcb extends Abc
{
	void Uttar()
	{
	System.out.println("Respect girls");
	}
}
 
class Xyz
{
	public static void main(String args[])
	{
	dcb obj= new dcb();
	obj.Uttar();
	Abc obj1 = new Abc();
	obj1.Uttar();
	}
}
