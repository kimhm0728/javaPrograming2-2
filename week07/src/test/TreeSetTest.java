package test;
import java.util.*;

public class TreeSetTest {
	public static void main(String[] args) {
		Random r=new Random();
		HashSet<Integer> num1=new HashSet<Integer>();
		TreeSet<Integer> num2=new TreeSet<Integer>();
		int a;
		
		for(int i=0;i<10;i++) {
			a=r.nextInt(20); // 0~19
			num1.add(a);
			num2.add(a);
		}
		
		System.out.println("HashSet number = "+num1); // ���Ե� �������
		System.out.println("TreeSet number = "+num2); // sort
		// ����� ���Ұ� 10�� ���� ���� ��� -> set�� �ߺ��� ������� �ʱ� ������ �ߺ��� ���Ұ� ���ŵ� �� 
	}

}
