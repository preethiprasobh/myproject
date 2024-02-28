package inheritance;

public class HierarchicalB extends HierarchicalA{
	public void print()
	{
		System.out.println("This is child class B") ;
		{
			
		}
	}
	public static void main(String args[])
	{
		HierarchicalB hb=new HierarchicalB();
		hb.print();
		hb.add();
	}
	

}
