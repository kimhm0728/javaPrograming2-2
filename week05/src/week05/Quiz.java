package week05;
import java.io.*;
import java.util.*;

public class Quiz {
	public static void main(String[] args) {
		String s1;
		try {
			FileReader fr = new FileReader("input.dat");
			BufferedReader br = new BufferedReader(fr);
			while((s1=br.readLine())!=null) {
				StringTokenizer st=new StringTokenizer(s1);
				while(st.hasMoreTokens()) {
					String num=st.nextToken();
					String name=st.nextToken();
					String tel_num=st.nextToken();
					String email=st.nextToken();
					System.out.println(name+" : "+email);
				}
			}
			br.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}