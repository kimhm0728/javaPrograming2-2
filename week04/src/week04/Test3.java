package week04;
import java.util.*;

public class Test3 {
	public static void main(String[] args) {
		int number1, number2, result;
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		number1 = sc.nextInt();
		System.out.print("두번째 정수: ");
		number2 = sc.nextInt();
		
		result = quotient(number1, number2);
		System.out.println(result);
		}
		catch(DivideByZeroException e) {
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("정수만 입력하시오");
		}
	}
	public static int quotient(int numerator, int denominator) throws DivideByZeroException {
		if(denominator==0)
			throw new DivideByZeroException();
		return numerator/denominator;
	}
}

class DivideByZeroException extends Exception {
	DivideByZeroException() {
		super("0으로 나누는 에러");
	}
}