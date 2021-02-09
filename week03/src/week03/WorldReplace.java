package week03;
import java.util.Scanner;

public class WorldReplace {
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		String text="우리는 호서대학교를 사랑합니다";
		System.out.println("문자열 : "+text);
		StringBuffer sb=new StringBuffer(text);
		
		String c[]=new String[2];
		
		while(true) {
			System.out.print("입력 : ");
			String n=stdin.next();
			
			if(n.equals("display"))
				System.out.println(sb);
			
			else if(n.equals("stop")) {
				System.out.println("종료합니다");
				break;
			}
			else {
				c=n.split(":");
				int i=sb.indexOf(c[0]);
				if(i<0)
					System.out.println("찾을 수 없습니다!");
				else {
					sb.replace(i,i+c[0].length(), c[1]);
					System.out.println(sb);
				}
			}
		}
		stdin.close();
	}

}
