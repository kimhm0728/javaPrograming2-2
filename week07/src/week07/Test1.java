package week07;
import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		HashSet<Integer> low=new HashSet<Integer>();
		HashSet<Integer> even=new HashSet<Integer>();
		
		for(int i=0;i<5;i++) {
			low.add(i);
			even.add(i*2);
		}
		System.out.println("low ���� : "+low);
		Iterator<Integer> evenit=even.iterator();
		System.out.println("even ���� : "+even);
		HashSet<Integer> union=new HashSet<Integer>(low);
		boolean setChanged=union.addAll(even);
		System.out.println("������ : "+union);
	}

}
