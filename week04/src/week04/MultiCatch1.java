package week04;

public class MultiCatch1 {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 / value2;
			System.out.println(result);
		}
		catch(NumberFormatException e)
		{
			System.out.println("���ڷ� ��ȯ�� �ȵ�.");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("����Ű������� ������.");
		}
	}

}
