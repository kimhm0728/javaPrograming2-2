package week05;
import java.io.*;
import java.util.*;

public class Test1 {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("Input.txt");
		BufferedReader br=new BufferedReader(fr);
		
		int[] list=new int[100];
		int cnt=0; // 배열의 인덱스
		String line;
		while((line=br.readLine())!=null) {
			int value=Integer.parseInt(line);
			list[cnt++]=value;
		}
		int[] list2=new int[cnt];
		
		for(int i=0;i<cnt;i++)
			list2[i]=list[i];
		
		Arrays.sort(list2);
		
		FileWriter fw=new FileWriter("Output.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		for(int i=0;i<list2.length;i++) {
			String str=Integer.toString(list2[i]);
			bw.write((i+1)+" : "+str);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}
