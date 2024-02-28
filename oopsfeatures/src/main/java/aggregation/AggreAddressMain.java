package aggregation;

public class AggreAddressMain {
	AggreStudent ag;
	String address;
	
public AggreAddressMain(String address,AggreStudent ag)
{
	this.address=address;
	this.ag=ag;
}
public void display()
{
	System.out.println("Student Name:"+ag.stdname);
	System.out.println("Student rollnum:"+ag.rollnum);
	System.out.println("Student Address:"+address);
}
	public static void main(String[] args) {
		
			AggreStudent as=new AggreStudent("mary",56);
			AggreAddressMain aam=new AggreAddressMain("hsadhash",as);
			aam.display();
			
		
	}

}
