package finalkeyword;

public class FinalChild extends FinalMethodParent {
	public void display()  //cannot override the final method
	{
		int a=8;
		System.out.println("Value of a:"+a);
	}

	public static void main(String[] args) {
		FinalChild fc=new FinalChild();
		fc.display();
		FinalMethodParent fmp=new FinalMethodParent();
		fmp.display();
		
	}

}
