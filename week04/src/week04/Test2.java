package week04;
import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		int n;
		Scanner stdin=new Scanner(System.in);

		try{
			System.out.print("�迭 ������ �Է� : ");
			n=stdin.nextInt();
			int array[]=new int[n];
			System.out.print("�迭�� : ");
			for(int i=0;i<n;i++)
				array[i]=stdin.nextInt();
			double average=getAverage(array);
			System.out.println("��հ� : "+average);
		}
		catch(ArithmeticException e) {
			System.out.println("������ ������ 0 �Է�");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("�迭 ������ ���� �Է�");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 �ε��� ���");
		}
		catch(NullPointerException e) {
			System.out.println("null �Է�");
		}
		catch(Exception e) {
			System.out.println("�̿��� ���� �߻�");
		}
	}
	public static double getAverage(int array[]) throws Exception {
		Scanner stdin=new Scanner(System.in);
		System.out.print("��� ���� �� ���� �� : ");
		int size=stdin.nextInt();
		int sum=0;
		for(int i=0;i<size;i++) 
			sum+=array[i];
		return sum/(double)size;
	}
}

