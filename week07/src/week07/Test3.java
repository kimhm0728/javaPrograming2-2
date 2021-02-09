
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
		System.out.println("홀수 집합 : "+low);
		System.out.println("짝수 집합 : "+even);
		
		TreeSet<Integer> union=new TreeSet<Integer>(low);
		boolean setChanged=union.addAll(even);
		if(setChanged==true) System.out.println("\n합집합 : "+union);
		
		TreeSet<Integer> intersection=new TreeSet<Integer>(low);
		setChanged=intersection.retainAll(even);
		if(setChanged==true) System.out.println("공통집합 : "+intersection);
		
		TreeSet<Integer> difference=new TreeSet<Integer>(low);
		setChanged=difference.removeAll(even);
		if(setChanged==true) System.out.println("차집합 : "+difference);		
	
		System.out.println("\n공통집합에서 가장 작은 값은 : "+Collections.min(intersection));
		System.out.println("차집합에서 가장 큰 값은 : "+Collections.max(difference));
		
		Iterator<Integer> it1=intersection.iterator();
		Iterator<Integer> it2=difference.iterator();
		
		int sum=0;
		while(it1.hasNext())
			sum+=it1.next();
		System.out.println("\n공통집합의 합은 : "+sum);
		
		sum=0;
		while(it2.hasNext())
			sum+=it2.next();
		System.out.println("차집합의 합은 : "+sum);
	}

}
