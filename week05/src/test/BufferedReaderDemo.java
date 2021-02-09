package test;
import java.io.*;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		String str;
		try {
			FileReader fr=new FileReader("c:/wk/sample1.dat");
			BufferedReader br=new BufferedReader(fr);
			while((str=br.readLine())!=null){
				System.out.println(str);
			}
			br.close();
		}
		catch(IOException e) {
			System.err.println(e);
		}
	}

}
