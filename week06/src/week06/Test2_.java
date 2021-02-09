package week06;
import java.util.*;

public class Test2_ {
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String s=stdin.nextLine();
		
		StringTokenizer st=new StringTokenizer(s);
		int n=0;
		
		String[] array=new String[50];
		
		while(st.hasMoreTokens()) {
			array[n]=st.nextToken();
			System.out.println(array[n]);
			n++;
		}
		System.out.println("모두 "+n+"개의 단어가 있습니다.");
		
		String[] array1=new String[n];
		System.arraycopy(array, 0, array1, 0, n);
		Arrays.sort(array1);
		System.out.println("======= 정렬 후 데이터 =======");
		System.out.println(Arrays.toString(array1));
		stdin.close();
	}

}
