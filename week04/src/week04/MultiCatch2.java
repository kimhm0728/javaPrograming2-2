package week04;

public class MultiCatch2 {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 / value2;
			System.out.println(result);
		}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("실행매개변수가 부족하거나 숫자로 변환이 안됨");
		}
	}

}
