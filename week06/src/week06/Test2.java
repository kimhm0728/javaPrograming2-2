package week06;
import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String s=stdin.nextLine(); // 공백이 아닌 엔터로 문자열 구분
		
		StringTokenizer st=new StringTokenizer(s);
		int n=0;
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			n++;
		}
		System.out.println("모두 "+n+"개의 단어가 있습니다.");
		stdin.close();
	}

}
