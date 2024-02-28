package stringClass;

public class BufferExam {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("helloworld");
		sb.append("all");
		System.out.println("After append:"+sb);
		sb.insert(1,'a');
		System.out.println("After insert:"+sb);
		sb.delete(0, 5);    
		System.out.println("after deletion in string: "+sb);
		sb.reverse();
		System.out.println("After reverse:"+sb);
		sb.replace(0, 4, "hello");
		System.out.println("After replace:"+sb);
		
		// TODO Auto-generated method stub

	}

}
