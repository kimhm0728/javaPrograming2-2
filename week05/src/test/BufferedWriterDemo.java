package test;
import java.io.*;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		String str="시간은 금이다.\n"
				+ "Time is money.\n"
				+ "유유상종.\n"
				+ "Bireds of a feather flock together. ";
		try {
			FileWriter fw=new FileWriter("c:/wk/sample1.dat");
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(str);
			System.out.println(str);
			bw.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
