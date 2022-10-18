
public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Alien";//Direct literal, new memory space in SCP & reference(s1) in heap
		String s2 = "Alien";//direct literal, no new memory space, reference s2 in the heap
		String s3 = "alien";//direct literal, new memory space, reference in the heap
		s1.concat(s3);//do not change the original string literal, instead running time result
		System.out.println(s1); //no change in the original s1 literal
		
		String st1 = new String("Sachin");
		String st2 = new String("Sachin");
		System.out.println("Direct Literals: " +st1.equals(st2));
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		StringBuffer sb = new StringBuffer("Sachin");
		System.out.println(sb);
		sb.append("Tendulkar");
		
		System.out.println(sb);
		
	}

}
