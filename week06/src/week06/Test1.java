package week06;
import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		Random r=new Random();
		Scanner s=new Scanner(System.in);
		int computer=r.nextInt(3);
		
		System.out.println("하나를 선택하시오 : 가위(0), 바위(1), 보(2) : ");
		int user=s.nextInt();
		
		if(computer==0) {
			System.out.println("컴퓨터는 가위를 냈습니다.");
			if(user==1)
				System.out.println("당신이 이겼습니다.");
			else if(user==2)
				System.out.println("당신이 졌습니다.");
		}
		else if(computer==1) {
			System.out.println("컴퓨터는 바위를 냈습니다.");
			if(user==0)
				System.out.println("당신이 졌습니다.");
			else if(user==2)
				System.out.println("당신이 이겼습니다.");
		}
		else if(computer==2) {
			System.out.println("컴퓨터는 보를 냈습니다.");
			if(user==0)
				System.out.println("당신이 이겼습니다.");
			else if(user==1)
				System.out.println("당신이 졌습니다.");
		}
		if(computer==user) System.out.println("비겼습니다");
		s.close();
	}
}
