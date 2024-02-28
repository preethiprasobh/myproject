package inheritance;

public class HierarchicalC extends HierarchicalA {
	public void print()
	{
		System.out.println("This is child class c") ;
		{
			
		}
	}
	public static void main(String[] args) {
		HierarchicalC hc=new HierarchicalC();
		hc.print();
		hc.add();
		// TODO Auto-generated method stub

	}

}
