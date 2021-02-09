package week03;

public class Quiz {
	public static void main(String[] args) {
		String s="냉장고,세탁기,에어컨,TV,오디오,컴퓨터";
		String a[]=new String[6];
		
		a=s.split(",");
		for(String i:a) 
			System.out.println(i);
		
	}

}
