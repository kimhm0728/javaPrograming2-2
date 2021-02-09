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
		System.out.println("홀수 집합 : "+low);
		System.out.println("짝수 집합 : "+even);
		
		LinkedList<Integer> union=new LinkedList<Integer>(low);
		boolean setChanged=union.addAll(even);
		if(setChanged==true) System.out.println("\n합 : "+union);
		
		LinkedList<Integer> intersection=new LinkedList<Integer>(low);
		setChanged=intersection.retainAll(even);
		if(setChanged==true) System.out.println("공통 : "+intersection);
		
		LinkedList<Integer> difference=new LinkedList<Integer>(low);
		setChanged=difference.removeAll(even);
		if(setChanged==true) System.out.println("차 : "+difference);		
	
		System.out.println("\n공통에서 가장 작은 값은 : "+Collections.min(intersection));
		System.out.println("차에서 가장 큰 값은 : "+Collections.max(difference));
		
		Iterator<Integer> it1=intersection.iterator();
		Iterator<Integer> it2=difference.iterator();
		
		int sum=0;
		while(it1.hasNext())
			sum+=it1.next();
		System.out.println("\n공통의 합은 : "+sum);
		
		sum=0;
		while(it2.hasNext())
			sum+=it2.next();
		System.out.println("차의 합은 : "+sum);
	}

}