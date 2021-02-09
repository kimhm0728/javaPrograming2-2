package week07;
import java.util.*;

class Lotto {
	TreeSet<Integer> set=new TreeSet<Integer>();
	int n;
	public Lotto(int n) {
		int d;
		this.n=n;
		for(int i=0;i<6;i++) {
			do {
			d=(int)(Math.random()*45.0+1.0);
			} while(set.contains(d));
			set.add(d);
		}
	}
	public String toString() {
		return "Lotto "+n+" = "+set;
	}
}

public class Test8 {
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		while(true) {
			System.out.print("구입 갯수 ? ");
			int n=stdin.nextInt();
			
			Lotto l[]=new Lotto[n]; 
			for(int i=0;i<n;i++) {
				l[i]=new Lotto(i+1);
				System.out.println(l[i].toString());
			}
			System.out.print("다른 번호를 원하십니까 ? ");
			String a=stdin.next();
			if(a.equals("n")) {
				System.out.println("감사합니다");
				break;
			}
		}
		stdin.close();
	}
}
