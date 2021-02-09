package week07;
import java.util.*;

public class Test4 {
	public static void main(String[] args) {
		HashSet<Integer> low=new HashSet<Integer>();
		HashSet<Integer> even=new HashSet<Integer>();
	
//		TreeSet<Integer> low=new TreeSet<Integer>();
//		TreeSet<Integer> even=new TreeSet<Integer>();
		
//		LinkedHashSet<Integer> low=new LinkedHashSet<Integer>();
//		LinkedHashSet<Integer> even=new LinkedHashSet<Integer>();

		System.out.println("HashSet�� �̿��� ������");
//	    System.out.println("TreeSet�� �̿��� ������");
//	    System.out.println("LinkedListSet�� �̿��� ������");
	    
		A:for(int i=0;i<10;i++) {
			int d=(int)((Math.random()*100.0)+1.0);
			if(low.contains(d))
				continue A;
			else low.add(d);
		}
		System.out.print("\nlow ���� : "+low);
		
		B:for(int i=0;i<10;i++) {
			int d=(int)((Math.random()*100.0)+1.0);
			if(even.contains(d))
				continue B;
			else even.add(d);
		}
		System.out.println(" , even ���� : "+even);
		
		HashSet<Integer> union=new HashSet<Integer>(low);
//		TreeSet<Integer> union=new TreeSet<Integer>();
//		LinkedHashSet<Integer> union=new LinkedHashSet<Integer>();
		boolean setChanged=union.addAll(even);
		if(setChanged==true) System.out.println("\nunion ������ : "+union);
	}
}
