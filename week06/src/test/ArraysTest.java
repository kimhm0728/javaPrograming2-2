package test;
import java.util.*;

public class ArraysTest {
	public static void main(String[] args) {
		int[] a= {0,1,2,3,4,5,6,7,8,9};
		arrayPrint("�ʱ� �迭 : ", a); // �迭  ���
		Arrays.fill(a, 3, 5, 33); // 3~4 �ε��� �� ����
		arrayPrint("fll() ���� �� : ", a);
		Arrays.sort(a);
		arrayPrint("sort() ���� �� : ", a);
		System.out.println("33�� �迭�� "+Arrays.binarySearch(a, 33)+"��° ���");
		// 33�� ù��° ��ġ ���
		System.out.println("-3�� �迭�� "+Arrays.binarySearch(a, -3)+"��° ���");
		System.out.println("53�� �迭�� "+Arrays.binarySearch(a, 53)+"��° ���");
		// �迭�� ���� �������� ������ ���� �� ���
		int[] b= {0,1,2,3,4,5,6,7,8,9};
		System.out.println("�迭 a�� �迭 b�� ������? : "+Arrays.equals(a,b));
	}

	static void arrayPrint(String s, int[] a) {
		System.out.print(s);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
