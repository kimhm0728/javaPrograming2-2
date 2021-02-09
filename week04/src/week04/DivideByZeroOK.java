package week04;
import java.util.*;

public class DivideByZeroOK {
	public static void main(String[] args) {
		int x, y;
		Scanner stdin=new Scanner(System.in);
		System.out.print("피젯수 입력: ");
		x=stdin.nextInt();
		System.out.print("젯수 입력: ");
		y=stdin.nextInt();	

		try{
			int result=x/y;
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다."); 
		}
		System.out.println("프로그램은 계속 진행됩니다.");
	}

}
