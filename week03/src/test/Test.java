package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Hoseo";
		System.out.println("s1�� ���̴� " +s1.length());
		System.out.println("3���� ���ڴ� "+s1.charAt(2));
		
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
		
		System.out.println(s2.compareTo(s3)); // �ҹ��ڰ� �빮�ں��� 32 �� ũ�� ������ -32 ���
		System.out.println(s3.compareTo(s2));
		
		System.out.println(s2.indexOf("sity"));
		System.out.println(s3.indexOf("e",4));
		
		String ss1="hyemin";
		String ss2=new String("hyemin");
		System.out.println(ss1==ss2);
		System.out.println(ss1==ss2.intern());
	}

}
