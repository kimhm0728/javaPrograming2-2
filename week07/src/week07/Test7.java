package week07;
import java.util.*;

public class Test7 {
	public static void main(String[] args) {
		HashSet<Integer> set1=new HashSet<Integer>();
		TreeSet<Integer> set2=new TreeSet<Integer>();
		int d;
		for(int i=0;i<6;i++) {
			do {
			d=(int)(Math.random()*45.0+1.0);
			} while(set1.contains(d));
			set1.add(d);
		}
		for(int i=0;i<6;i++) {
			do {
			d=(int)(Math.random()*45.0+1.0);
			} while(set2.contains(d));
			set2.add(d);
		}
		System.out.println("Lotto 번호(HashSet) = "+set1);
		System.out.println("Lotto 번호(TreeSet) = "+set2);
	}
}
