package week04;
import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		try{
			int number1, number2, result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ����: ");
		number1 = sc.nextInt();
		System.out.print("�ι�° ����: ");
		number2 = sc.nextInt();
		result = number1/number2;
		System.out.println(result);
		}
		catch(InputMismatchException e) {
			System.out.println("������ �Է�");
		}
		catch(ArithmeticException e) {
			System.out.println("0���� ����");
		}
		finally {
			System.out.println("Finally ��� ����");
		}
	}

}
