interface Laptop
{
void x();
void y();
}
class Mouse implements Laptop
{
public void x()
	{
	System.out.println("Bharat mata ki jai");
	}
public void y()
	{
	System.out.println("jai jawan jai kisan");
	}
}
class Screen
{
public static void main(String args[])
	{
	Mouse obj= new Mouse();
	obj.x();
	obj.y();
	}
}


