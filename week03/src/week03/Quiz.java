package week03;

public class Quiz {
	public static void main(String[] args) {
		String s="�����,��Ź��,������,TV,�����,��ǻ��";
		String a[]=new String[6];
		
		a=s.split(",");
		for(String i:a) 
			System.out.println(i);
		
	}

}
