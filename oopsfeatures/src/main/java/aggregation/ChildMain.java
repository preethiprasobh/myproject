package aggregation;

public class ChildMain {
int t;
Parent1 ref;
	ChildMain(int t,Parent1 ref)
	{
		this.t=t;
		this.ref=ref;
		
	}
	public void display()
	{
		System.out.println("Print child class value:"+t);
		System.out.println("Parent class variable:"+ref.value);
	}
	public static void main(String[] args) {
		
		Parent1 pp=new Parent1(7);
		ChildMain cm=new ChildMain(6,pp);
				cm.display();
		
		

	}

}
