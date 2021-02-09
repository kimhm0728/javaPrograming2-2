package week04;

public class Nullpoint_1 {
	public static void main(String[] args) {
		try {
			String data=null;
			System.out.println(data.toString());
		}
		catch(NullPointerException e) {
			System.out.println("NullPointer 오류 발생");
		}
	}

}
