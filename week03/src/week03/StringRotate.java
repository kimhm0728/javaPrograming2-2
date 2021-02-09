package week03;
import java.util.Scanner;

public class StringRotate {
	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요 ");
		Scanner stdin=new Scanner(System.in);
		String text=stdin.nextLine();
		
		for(int i=0;i<text.length();i++) {
			String a=text.substring(0,1);
			String b=text.substring(1);
			text=b;
			text=text.concat(a);
			System.out.println(text);
		}
		stdin.close();
	}

}
