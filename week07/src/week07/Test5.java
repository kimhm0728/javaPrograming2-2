package week07;
import java.util.*;

public class Test5 {
	public static void main(String[] args) {
		LinkedList<Integer> low=new LinkedList<Integer>();
		LinkedList<Integer> even=new LinkedList<Integer>();
		
		for(int i=0;i<10;i++) {
			low.add(i);
			even.add(i*2);
		}
		System.out.println("Ȧ�� ���� : "+low);
		System.out.println("¦�� ���� : "+even);
		
		LinkedList<Integer> union=new LinkedList<Integer>(low);
		boolean setChanged=union.addAll(even);
		if(setChanged==true) System.out.println("\n�� : "+union);
		
		LinkedList<Integer> intersection=new LinkedList<Integer>(low);
		setChanged=intersection.retainAll(even);
		if(setChanged==true) System.out.println("���� : "+intersection);
		
		LinkedList<Integer> difference=new LinkedList<Integer>(low);
		setChanged=difference.removeAll(even);
		if(setChanged==true) System.out.println("�� : "+difference);		
	
		System.out.println("\n���뿡�� ���� ���� ���� : "+Collections.min(intersection));
		System.out.println("������ ���� ū ���� : "+Collections.max(difference));
		
		Iterator<Integer> it1=intersection.iterator();
		Iterator<Integer> it2=difference.iterator();
		
		int sum=0;
		while(it1.hasNext())
			sum+=it1.next();
		System.out.println("\n������ ���� : "+sum);
		
		sum=0;
		while(it2.hasNext())
			sum+=it2.next();
		System.out.println("���� ���� : "+sum);
	}

}