package finalkeyword;

public class FinalVar {
	final int x=10;
	public void change()
	{
		x=x+10; //cannot assign to a final variable
		System.out.println("value of x:"+x);
	}

	public static void main(String[] args) {
		FinalVar vr=new FinalVar();
		vr.change();

	}

}
