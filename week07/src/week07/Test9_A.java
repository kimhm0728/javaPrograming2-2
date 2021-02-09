package week07;
import java.util.*;
import java.io.*;

public class Test9_A {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("dic.dat");
		BufferedReader br=new BufferedReader(fr);
		Scanner s=new Scanner(br);
		
		HashMap<String, String> map=new HashMap<String, String>();
		while(s.hasNext()) {
			String a=s.next();
			String b=s.next();
			map.put(a,b);
		}
		Scanner stdin=new Scanner(System.in);
		while(true) {
			System.out.print("영어단어 ? ");
			String n=stdin.next();
			if(n.equals("quit")) {
				System.out.println("done!");
				break;
			}
			else if(map.containsKey(n))
				System.out.println("한글 : "+map.get(n));
			else 
				System.out.println("Not exist!");
		}
		s.close();
		stdin.close();
	}
}
