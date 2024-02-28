package stringClass;

public class StringExamp {

	public static void main(String[] args) {
		
		String s1="Using literally";

		s1=s1.concat("using concat");  //should assign then only change the value
		System.out.println(s1);
		String s2=new String("Using new keyword");
		String s3=s1.concat(s2);
		System.out.println(s3);
		 s1="cannot take";
		 System.out.println(s1.equals(s2));
		 System.out.println(s1.length());
		 
		System.out.println(s1);
		System.out.println(s2);
		// TODO Auto-generated method stub

	}

}
