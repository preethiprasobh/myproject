package abstraction;

public abstract class AbstractExamp {
	public AbstractExamp()
	{
		System.out.println("its a constructor");
	}
	public abstract void abstMethod();//its an abstract method declaration
	public void display()
	{
		System.out.println("hello all");
	}
public static void print()
{
	System.out.println("Its a static method in abstract class");
}
}
