package finalkeyword;

public class FinalClassChild extends FinalClassParent {
	public void print()
	{
		System.out.println("child class method");
	}

	public static void main(String[] args) {
		FinalClassChild fcc=new FinalClassChild();
		fcc.print();
		fcc.display();
		

	}

}
