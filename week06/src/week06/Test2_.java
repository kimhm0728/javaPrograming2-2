package week06;
import java.util.*;

public class Test2_ {
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ��� : ");
		String s=stdin.nextLine();
		
		StringTokenizer st=new StringTokenizer(s);
		int n=0;
		
		String[] array=new String[50];
		
		while(st.hasMoreTokens()) {
			array[n]=st.nextToken();
			System.out.println(array[n]);
			n++;
		}
		System.out.println("��� "+n+"���� �ܾ �ֽ��ϴ�.");
		
		String[] array1=new String[n];
		System.arraycopy(array, 0, array1, 0, n);
		Arrays.sort(array1);
		System.out.println("======= ���� �� ������ =======");
		System.out.println(Arrays.toString(array1));
		stdin.close();
	}

}
