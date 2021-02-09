package week04;
import java.util.*;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("������ ���� : ");
		try {
			int n=sc.nextInt();
			int sum=0;

			for(int i=0;i<n;i++) {
				System.out.print("������ �Է��Ͻÿ�: ");
				int a=sc.nextInt();
				sum+=a;
				if (a<0)
					throw new NegativeNumberException();
			}
			int avg=sum/n;
			System.out.println("����� "+avg);
		}
		catch(ArithmeticException e) {
			System.out.println(e+" ��� ����");
		}
		catch(NegativeNumberException e) {
			System.err.print(e);
		}
	}

}
class NegativeNumberException extends Exception {
	NegativeNumberException() {
		super("���� �Է� ����");
	}
}