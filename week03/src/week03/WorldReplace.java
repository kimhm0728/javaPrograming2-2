package week03;
import java.util.Scanner;

public class WorldReplace {
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		String text="�츮�� ȣ�����б��� ����մϴ�";
		System.out.println("���ڿ� : "+text);
		StringBuffer sb=new StringBuffer(text);
		
		String c[]=new String[2];
		
		while(true) {
			System.out.print("�Է� : ");
			String n=stdin.next();
			
			if(n.equals("display"))
				System.out.println(sb);
			
			else if(n.equals("stop")) {
				System.out.println("�����մϴ�");
				break;
			}
			else {
				c=n.split(":");
				int i=sb.indexOf(c[0]);
				if(i<0)
					System.out.println("ã�� �� �����ϴ�!");
				else {
					sb.replace(i,i+c[0].length(), c[1]);
					System.out.println(sb);
				}
			}
		}
		stdin.close();
	}

}
