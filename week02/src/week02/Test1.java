package week02;

public class Test1 {
	public static void main(String[] args) {
		Integer a=1234;
		
		System.out.println("1,234를 2진수로 표현 : "+Integer.toBinaryString(a));
		System.out.println("1,234를 8진수로 표현 : "+Integer.toOctalString(a));
		System.out.println("1,234를 16진수로 표현 : "+Integer.toHexString(a));
	}

}
