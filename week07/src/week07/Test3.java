
package week07;
import java.util.*;

public class Test3 {
	public static void main(String[] args) {
		TreeSet<Integer> low=new TreeSet<Integer>();
		TreeSet<Integer> even=new TreeSet<Integer>();
		
		for(int i=0;i<10;i++) {
			low.add(i);
			even.add(i*2);
		}
		System.out.println("Ȧ�� ���� : "+low);
		System.out.println("¦�� ���� : "+even);
		
		TreeSet<Integer> union=new TreeSet<Integer>(low);
		boolean setChanged=union.addAll(even);
		if(setChanged==true) System.out.println("\n������ : "+union);
		
		TreeSet<Integer> intersection=new TreeSet<Integer>(low);
		setChanged=intersection.retainAll(even);
		if(setChanged==true) System.out.println("�������� : "+intersection);
		
		TreeSet<Integer> difference=new TreeSet<Integer>(low);
		setChanged=difference.removeAll(even);
		if(setChanged==true) System.out.println("������ : "+difference);		
	
		System.out.println("\n�������տ��� ���� ���� ���� : "+Collections.min(intersection));
		System.out.println("�����տ��� ���� ū ���� : "+Collections.max(difference));
		
		Iterator<Integer> it1=intersection.iterator();
		Iterator<Integer> it2=difference.iterator();
		
		int sum=0;
		while(it1.hasNext())
			sum+=it1.next();
		System.out.println("\n���������� ���� : "+sum);
		
		sum=0;
		while(it2.hasNext())
			sum+=it2.next();
		System.out.println("�������� ���� : "+sum);
	}

}
