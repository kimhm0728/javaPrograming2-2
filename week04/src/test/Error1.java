package test;
import java.util.*;

public class Error1 {
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		while(true) {
			try {
				System.out.print("������(dividend) �Է�: ");
				int dividend=stdin.nextInt();
				System.out.print("����(divisor) �Է�: ");
				int divisor=stdin.nextInt();	
				System.out.println(dividend+"��"+divisor+"�� ���� �� "+dividend/divisor);
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage()); // �޼��� ��� �� ���� X �ٽ� while�� ����
				//System.out.println("0���� ������ �ȵ�"); // �� �ּ����� ����
			}
			catch(InputMismatchException e) { // java.util.Scanner �� �ƴ� java.util.*�� �ؾ� ��� ����
				System.out.println("������ �Է�");
				stdin.next(); // ���ڿ� �Է� �� ���� ģ ���� ó��
			}
			finally {
				System.out.print("���(y), �ߴ�(n) : ");
				String s=stdin.next();
				if(s.equals("n"))
					break;
			}
		}
	}
}
