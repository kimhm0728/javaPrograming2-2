package week04;
import java.util.*;

public class DivideByZeroOK {
	public static void main(String[] args) {
		int x, y;
		Scanner stdin=new Scanner(System.in);
		System.out.print("������ �Է�: ");
		x=stdin.nextInt();
		System.out.print("���� �Է�: ");
		y=stdin.nextInt();	

		try{
			int result=x/y;
		}
		catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�."); 
		}
		System.out.println("���α׷��� ��� ����˴ϴ�.");
	}

}
