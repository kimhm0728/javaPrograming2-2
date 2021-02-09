package test;
import java.io.*;
import java.util.*;

public class BufferedReaderDemo1 {
	public static void main(String[] args) {
		String str;
		StringTokenizer st;
		try {
			FileReader fr=new FileReader("c:/wk/sample1.dat");
			BufferedReader br=new BufferedReader(fr);
			while((str=br.readLine())!=null){
				st=new StringTokenizer(str);
				while(st.hasMoreTokens())
					System.out.println(st.nextToken());
			}
			br.close();
		}
		catch(IOException e) {
			System.err.println(e);
		}
	}

}
