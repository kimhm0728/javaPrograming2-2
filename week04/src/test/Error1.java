package test;
import java.util.*;

public class Error1 {
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		while(true) {
			try {
				System.out.print("피젯수(dividend) 입력: ");
				int dividend=stdin.nextInt();
				System.out.print("젯수(divisor) 입력: ");
				int divisor=stdin.nextInt();	
				System.out.println(dividend+"를"+divisor+"로 나눈 값 "+dividend/divisor);
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage()); // 메세지 출력 후 종료 X 다시 while문 시작
				//System.out.println("0으로 나누면 안됨"); // 위 주석문과 동일
			}
			catch(InputMismatchException e) { // java.util.Scanner 가 아닌 java.util.*을 해야 사용 가능
				System.out.println("정수만 입력");
				stdin.next(); // 문자열 입력 후 엔터 친 것을 처리
			}
			finally {
				System.out.print("계속(y), 중단(n) : ");
				String s=stdin.next();
				if(s.equals("n"))
					break;
			}
		}
	}
}
