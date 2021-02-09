package test;
import java.util.*;

public class ScannerTest {
	public static void main(String[] args) {
		String s="생각하는 자바, 재미있는 자바, 즐거운 자바, 신나는 자바";
		Scanner scanner=new Scanner(s);
		scanner.useDelimiter("자바, ");
		while(scanner.hasNext())
			System.out.println(scanner.next());
		
		s="1  fish  2  fish  red  fish  blue  fish";
		scanner=new Scanner(s).useDelimiter("\\s*fish\\s*");
		// \\s* 는 한 개 이상의 스페이스를 의미하는 정규표현식
		System.out.println(scanner.nextInt());
		System.out.println(scanner.nextInt());
		System.out.println(scanner.next());
		System.out.println(scanner.next());
		
		scanner.close();
	}
}
