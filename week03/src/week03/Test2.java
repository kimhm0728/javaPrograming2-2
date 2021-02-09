package week03;

public class Test2 {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Hello");
		System.out.println(s1);
		
		s1.append(" world");
		System.out.println(s1);
		
		s1.insert(5, " Java");
		System.out.println(s1);
		
		s1.replace(6,10,"my");
		System.out.println(s1);
	}

}
