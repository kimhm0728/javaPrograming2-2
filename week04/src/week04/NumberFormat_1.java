package week04;

public class NumberFormat_1 {

	public static void main(String[] args) {
		String data1="100";
		String data2="a100";
		
		try{
			int value1=Integer.parseInt(data1);
			int value2=Integer.parseInt(data2);

			int result=value1+value2;
			System.out.println(result);
		}
		catch(NumberFormatException e) {
			System.out.println("숫자에 문자가 들어감");
		}
	}

}
