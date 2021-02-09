package test;
import java.util.*;

public class TreeSetTest {
	public static void main(String[] args) {
		Random r=new Random();
		HashSet<Integer> num1=new HashSet<Integer>();
		TreeSet<Integer> num2=new TreeSet<Integer>();
		int a;
		
		for(int i=0;i<10;i++) {
			a=r.nextInt(20); // 0~19
			num1.add(a);
			num2.add(a);
		}
		
		System.out.println("HashSet number = "+num1); // 삽입된 순서대로
		System.out.println("TreeSet number = "+num2); // sort
		// 출력한 원소가 10개 보다 적은 경우 -> set은 중복을 허용하지 않기 때문에 중복된 원소가 제거된 것 
	}

}
