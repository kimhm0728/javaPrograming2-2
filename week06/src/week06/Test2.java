package week06;
import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ��� : ");
		String s=stdin.nextLine(); // ������ �ƴ� ���ͷ� ���ڿ� ����
		
		StringTokenizer st=new StringTokenizer(s);
		int n=0;
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			n++;
		}
		System.out.println("��� "+n+"���� �ܾ �ֽ��ϴ�.");
		stdin.close();
	}

}
