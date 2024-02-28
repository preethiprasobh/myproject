package polymorphism;

public class ChildPoly extends ParentPoly {
	void display()
	{
		System.out.println("hello");
		super.display();
		
	}

	public static void main(String[] args) {
		ChildPoly ch=new ChildPoly();
		ch.display();
		

	}

}
