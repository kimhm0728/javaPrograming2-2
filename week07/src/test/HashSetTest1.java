package test;
import java.util.*;

public class HashSetTest1 {
	public static void main(String[] args) {
		HashSet<Integer> odd=new HashSet<Integer>();
		HashSet<Integer> even=new HashSet<Integer>();
		for(int i=1;i<=5;i+=2) {
			odd.add(i); // 1 3 5
			even.add(i+1); // 2 4 6
		}
		boolean setChanged=odd.add(5);
		System.out.println("odd�� 5 �߰� ����? : "+setChanged);
		// �̹� 5�� �����ϱ� ������ �����ص� ������ ������� ����
		setChanged=even.add(12);
		System.out.println("even 12 �߰� ����? : "+setChanged);
		System.out.println("odd ���� : "+odd);
		System.out.println("even ���� : "+even);
		System.out.println("odd���� ���� ���� ���� : "+Collections.min(odd));
		System.out.println("even���� ���� ū ���� : "+Collections.max(even));
		Iterator<Integer> it=even.iterator();
		int sum=0;
		while(it.hasNext())
			sum+=it.next();
		System.out.println("even ������ ���� : "+sum);
	}

}
