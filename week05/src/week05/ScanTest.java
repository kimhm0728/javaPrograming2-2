package week05;
import java.util.*; // scanner ����ϱ� ����
import java.io.*;

public class ScanTest {
	public static void main(String[] args) {
		Scanner s=null;
		try {
			FileReader fr=new FileReader("c:/wk/input.dat");
			BufferedReader br=new BufferedReader(fr);
			s=new Scanner(br); // Scanner�� br ������ �о�ͼ� ó��
			
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
