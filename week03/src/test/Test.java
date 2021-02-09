package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Hoseo";
		System.out.println("s1의 길이는 " +s1.length());
		System.out.println("3번쨰 문자는 "+s1.charAt(2));
		
		char dest[]=new char[10];
		dest[0]='n';
		s1.getChars(1, 4, dest, 3);
		System.out.println(dest);
		
		String s2="Hoseo University";
		String s3="hoseo university";
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		
		System.out.println(s1.startsWith("Ho"));
		System.out.println(s1.startsWith("ho"));
		
		System.out.println(s2.compareTo(s3)); // 소문자가 대문자보다 32 더 크기 때문에 -32 출력
		System.out.println(s3.compareTo(s2));
		
		System.out.println(s2.indexOf("sity"));
		System.out.println(s3.indexOf("e",4));
		
		String ss1="hyemin";
		String ss2=new String("hyemin");
		System.out.println(ss1==ss2);
		System.out.println(ss1==ss2.intern());
	}

}
