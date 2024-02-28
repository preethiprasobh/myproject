package abstraction;

public class AbstractExten extends AbstractExamp {

	public static void main(String[] args) {
		
AbstractExten ae=new AbstractExten(); //this will call the constructor of abstract class
ae.display();   //non-abstract method calling
ae.abstMethod();  //abstract method calling
AbstractExamp.print(); //static method calling
AbstractExamp nn=new AbstractExten(); //invoking constructor in abstract class(if not it will work because it is extended)
	}

	@Override
	public void abstMethod() {
		System.out.println("Inside abstract method");//defining abstract method
		
	}

}
