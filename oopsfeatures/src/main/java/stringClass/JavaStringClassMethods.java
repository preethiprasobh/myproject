package stringClass;

public class JavaStringClassMethods {

	public static void main(String[] args) {
		String s=new String("I am Preethi");
		String s1=new String("Hello all");
		
		System.out.println("characetr at index position 2 is: "+s.charAt(2));
		System.out.println("Compare s with s1 "+s.compareTo(s1)); //returns 0 if equals otherwise 1
		System.out.println("Concatenation "+s.concat(s1));
		System.out.println("checking whether s is equal to s2:"+s.equals(s1));
		System.out.println("checking the Index position of a string in s:"+s.indexOf("Preethi"));
		System.out.println("Cheking whether the s1 String is empty or not:"+s1.isEmpty());
		
	}
	

}
