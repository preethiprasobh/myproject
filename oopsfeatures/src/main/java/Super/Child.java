package Super;

public class Child extends Parent{
	String s;
	public void colour()
	{
		 s="yellow";
		System.out.println("inside child: "+s);
		System.out.println("inside Parent:"+super.s);  //calling parent class string s
	}
	public static void main(String args[])
	{
		Child pp=new Child();
		pp.colour();
		
	}

}
