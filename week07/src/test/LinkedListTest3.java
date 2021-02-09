package test;
import java.util.*;

public class LinkedListTest3 {
	public static void main(String[] args) {
		ArrayList<Integer> alist=new ArrayList<Integer>();
		LinkedList<Integer> llist=new LinkedList<Integer>();
		long start, stop;
		int k=5000000;
		
		start=System.currentTimeMillis();
		for(int i=0;i<=k;i++)
			alist.add(i);
		stop=System.currentTimeMillis();
		System.out.println("ArrayList - ¼øÂ÷Àû »ðÀÔ : "+(stop-start));
		
		start=System.currentTimeMillis();
		for(int i=0;i<=k;i++)
			llist.add(i);
		stop=System.currentTimeMillis();
		System.out.println("LinkedList - ¼øÂ÷Àû »ðÀÔ : "+(stop-start));
		
		start=System.currentTimeMillis();
		for(int i=0;i<500;i++)
			alist.add(500,i);
		stop=System.currentTimeMillis();
		System.out.println("ArrayList - Áß°£ »ðÀÔ : "+(stop-start));
		
		start=System.currentTimeMillis();
		for(int i=0;i<500;i++)
			llist.add(500,i);
		stop=System.currentTimeMillis();
		System.out.println("LinkedList - Áß°£ »ðÀÔ : "+(stop-start));
		
	}

}
