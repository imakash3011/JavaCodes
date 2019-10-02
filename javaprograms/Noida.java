abstract class Animal
{
abstract void sound();
}
class Dog extends Animal
{
	void sound()
	{
	System.out.println("wow");
	}
}
class Noida
{
	public static void main(String args[])
{
	Dog obj = new Dog();
	obj.sound();
}
}