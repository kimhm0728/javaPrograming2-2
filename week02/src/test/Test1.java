package test;

public class Test1 {

	public static void main(String[] args) {
		int i=Integer.parseInt(args[0]);
		int j=Integer.parseInt(args[1]);
		
		System.out.println(i+j);
		
		Integer a=new Integer(100); // Integer a=10; 
		System.out.println(a.doubleValue());
		
		System.out.println(Integer.toBinaryString(a)); // 2����
		System.out.println(Integer.toOctalString(a)); // 8����
		System.out.println(Integer.toHexString(a)); // 16����
	
		Character c='a';
		System.out.println(Character.isDigit(c));
	}

}
