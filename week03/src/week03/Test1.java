package week03;

public class Test1 {
	public static void main(String[] args) {
		String s1="java\t";
		String s2=", C++,C ";
		String s3="java";
		
		System.out.println(s1+s2+s3);
		
		System.out.println("Before Trim : "+ "\""+s1+"\"");
		s1=s1.trim();
		System.out.println("After Trim : "+"\""+s1+"\"");
		
		System.out.println("���ڿ� s1�� v���� ����ִ��� ���� : "+s1.contains("v"));
		
		s1=s1.concat(s2);
		System.out.println(s1);
		
		String ss[]=s1.split(",");
		for(String s:ss)
			System.out.println(s);
		
		s1=s1.replace("java", "Python");
		System.out.println(s1);
		
		s1=s1.substring(8);
		System.out.println(s1);
		System.out.println(s1.charAt(0));
	}

}