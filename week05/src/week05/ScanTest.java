package week05;
import java.util.*; // scanner 사용하기 위해
import java.io.*;

public class ScanTest {
	public static void main(String[] args) {
		Scanner s=null;
		try {
			FileReader fr=new FileReader("c:/wk/input.dat");
			BufferedReader br=new BufferedReader(fr);
			s=new Scanner(br); // Scanner가 br 파일을 읽어와서 처리
			
			while(s.hasNext())
				System.out.println(s.next());
		}
		catch(IOException e) {
			System.err.println(e.getMessage());
		}
		finally {
			if(s!=null)
				s.close();
		}
	}

}
