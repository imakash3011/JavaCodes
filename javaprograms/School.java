class Nav
{
	void Jeevan()
	{
	System.out.println("i had studied in Nav jeevan mission school");
	}
}
class University extends Nav
{
	void Mission()
	{
	System.out.println("i am studing in Gautam Buddha UNiversity");
	}
}
class School
{
	public static void main(String args[])
	{
	University obj= new University();
	obj.Mission();
	}
}