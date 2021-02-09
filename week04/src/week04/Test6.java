package week04;
import java.util.*;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수의 개수 : ");
		try {
			int n=sc.nextInt();
			int sum=0;

			for(int i=0;i<n;i++) {
				System.out.print("정수를 입력하시오: ");
				int a=sc.nextInt();
				sum+=a;
				if (a<0)
					throw new NegativeNumberException();
			}
			int avg=sum/n;
			System.out.println("평균은 "+avg);
		}
		catch(ArithmeticException e) {
			System.out.println(e+" 산술 오류");
		}
		catch(NegativeNumberException e) {
			System.err.print(e);
		}
	}

}
class NegativeNumberException extends Exception {
	NegativeNumberException() {
		super("음수 입력 오류");
	}
}