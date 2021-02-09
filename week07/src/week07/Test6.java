package week07;
import java.util.*;

public class Test6 {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		for(int i=0;i<args.length;i++) {
			int n=Integer.parseInt(args[i]);
			s.push(n);
			System.out.println("스택에 push : "+ n);
		}
		System.out.println("=============================");
		int n=s.search(23);
		if(n!=-1)
			System.out.println("스택에서 숫자 '23'의 위치는 : "+s.search(23)+"번째 입니다");
		else 
			System.out.println("스택에서 숫자 '23'이 없습니다");
		System.out.println("=============================");
		
		while(!s.empty())
			System.out.println("스택에서 pop : "+s.pop());
	}

}
