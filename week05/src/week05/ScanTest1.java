package week05;
import java.util.*;
import java.io.*;

public class ScanTest1 {
	public static void main(String[] args) {
		String s1;
		try {
			FileReader fr=new FileReader("input.dat"); //eclipse-workspace 속 week05 폴더 안에 파일이 있으면 실행가능
			BufferedReader br=new BufferedReader(fr);
			while(true) {
				if((s1=br.readLine())==null)
					break;
				// System.out.println(s1); (한줄씩 출력)
				StringTokenizer st=new StringTokenizer(s1);
				while(st.hasMoreTokens())
					System.out.println(st.nextToken());
			}
			br.close();
		}
		catch(IOException e) {
			System.err.println(e.getMessage());
		}
	}

}
 