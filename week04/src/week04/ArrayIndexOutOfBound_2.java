package week04;

public class ArrayIndexOutOfBound_2 {
	public static void main(String[] args) {

		try{
		String data1=args[0];
			String data2=args[1];
			
			System.out.println(data1);
			System.out.println(data2);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("변수를 입력하세요");
		}

	}

}
