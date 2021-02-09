package week04;
import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		try{
			int number1, number2, result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		number1 = sc.nextInt();
		System.out.print("두번째 정수: ");
		number2 = sc.nextInt();
		result = number1/number2;
		System.out.println(result);
		}
		catch(InputMismatchException e) {
			System.out.println("정수만 입력");
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눔");
		}
		finally {
			System.out.println("Finally 블록 실행");
		}
	}

}
