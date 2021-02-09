package week05;
import java.io.*;

public class Test3 {
	public static void main(String[] args) throws IOException {
		FileReader fr1=new FileReader("Output.txt");
		BufferedReader br1=new BufferedReader(fr1);
		
		FileReader fr2=new FileReader("Output1.txt");
		BufferedReader br2=new BufferedReader(fr2);
		
		FileWriter fw=new FileWriter("Output3.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		String line;
		while((line=br1.readLine())!=null) {
			bw.write(line);
			bw.newLine();
		}
		while((line=br2.readLine())!=null) {
			bw.write(line);
			bw.newLine();
		}

		br1.close();
		br2.close();
		bw.close();
	}
}
