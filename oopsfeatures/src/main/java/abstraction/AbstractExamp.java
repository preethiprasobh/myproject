package abstraction;

public abstract class AbstractExamp {
	public AbstractExamp()
	{
		System.out.println("its a constructor in abstract class");
	}
	public abstract void abstMethod();//its an abstract method declaration
	public void display()
	{
		System.out.println("Its a regular method");
	}
public static void print()
{
	System.out.println("Its a static method in abstract class");
}
}
