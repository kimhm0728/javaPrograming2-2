package week07;
import java.util.*;
import java.io.*;

public class Test9_B {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("dic.dat");
		BufferedReader br=new BufferedReader(fr);
		Scanner s=new Scanner(br);
		
		HashMap<String, String> map=new HashMap<String, String>();
		while(s.hasNext()) {
			String a=s.next();
			String b=s.next();
			map.put(b,a);
		}
		Scanner stdin=new Scanner(System.in);
		while(true) {
			System.out.print("�ѱ� ? ");
			String n=stdin.next();
			if(n.equals("�׸�")) {
				System.out.println("����");
				break;
			}
			else if(map.containsKey(n))
				System.out.println("english : "+map.get(n));
			else 
				System.out.println("���� �ܾ�");
		}
		s.close();
		stdin.close();
	}
}
