package week06;
import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		Random r=new Random();
		Scanner s=new Scanner(System.in);
		int computer=r.nextInt(3);
		
		System.out.println("�ϳ��� �����Ͻÿ� : ����(0), ����(1), ��(2) : ");
		int user=s.nextInt();
		
		if(computer==0) {
			System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
			if(user==1)
				System.out.println("����� �̰���ϴ�.");
			else if(user==2)
				System.out.println("����� �����ϴ�.");
		}
		else if(computer==1) {
			System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
			if(user==0)
				System.out.println("����� �����ϴ�.");
			else if(user==2)
				System.out.println("����� �̰���ϴ�.");
		}
		else if(computer==2) {
			System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
			if(user==0)
				System.out.println("����� �̰���ϴ�.");
			else if(user==1)
				System.out.println("����� �����ϴ�.");
		}
		if(computer==user) System.out.println("�����ϴ�");
		s.close();
	}
}
