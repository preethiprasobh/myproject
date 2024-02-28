package inheritance;

public class MultiLevelC extends MultiLevelB {
public void print2()
{
	System.out.println("This is class C");
}
	public static void main(String[] args) {
		MultiLevelC mb=new MultiLevelC();
		mb.print2();
		mb.print1();
		mb.print();
		
		

	}

}
