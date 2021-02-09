package week05;
import java.io.*;
import java.util.*;

public class Test4 {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("Output3.txt");
		BufferedReader br=new BufferedReader(fr);
		
		FileWriter fw=new FileWriter("Output4.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		String line, num, number;
		double []list=new double[100];
		int cnt=0;
		
		while((line=br.readLine())!=null) {
			StringTokenizer st=new StringTokenizer(line, ":");
			while(st.hasMoreTokens()) {
				num=st.nextToken();
				number=st.nextToken();
				list[cnt++]=Double.parseDouble(number);
			}
		}
		double[] list1=new double[cnt];
		//for(int i=0;i<cnt;i++)
		//	list1[i]=list[i];
		System.arraycopy(list, 0, list1, 0, cnt);
		Arrays.sort(list1);
		
		for(int i=0;i<list1.length;i++) {
			String str=Double.toString(list1[i]);
			bw.write((i+1)+" : "+str);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}
