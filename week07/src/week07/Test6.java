package week07;
import java.util.*;

public class Test6 {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		for(int i=0;i<args.length;i++) {
			int n=Integer.parseInt(args[i]);
			s.push(n);
			System.out.println("���ÿ� push : "+ n);
		}
		System.out.println("=============================");
		int n=s.search(23);
		if(n!=-1)
			System.out.println("���ÿ��� ���� '23'�� ��ġ�� : "+s.search(23)+"��° �Դϴ�");
		else 
			System.out.println("���ÿ��� ���� '23'�� �����ϴ�");
		System.out.println("=============================");
		
		while(!s.empty())
			System.out.println("���ÿ��� pop : "+s.pop());
	}

}
