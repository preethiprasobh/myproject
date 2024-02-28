package inheritance;

public class ChildClass extends ParentClass {
public void display()
{
	System.out.println("Inside Child Class");
}

	public static void main(String[] args) {
		ChildClass ob=new ChildClass();
		ob.display();
		ob.print();
		ob.add();

	}

}
