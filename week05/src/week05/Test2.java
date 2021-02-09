package week05;
import java.io.*;
import java.util.*;

public class Test2 {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("Input1.txt");
		BufferedReader br=new BufferedReader(fr);
		
		double[] list=new double[100];
		int cnt=0; // 배열의 인덱스
		String line;
		while((line=br.readLine())!=null) {
			double value=Double.parseDouble(line);
			list[cnt++]=value;
		}
		double[] list2=new double[cnt];
		
		for(int i=0;i<cnt;i++)
			list2[i]=list[i];
		
		Arrays.sort(list2);
		
		FileWriter fw=new FileWriter("Output1.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		for(int i=0;i<list2.length;i++) {
			String str=Double.toString(list2[i]);
			bw.write((i+1)+" : "+str);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}
