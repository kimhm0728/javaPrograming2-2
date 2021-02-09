package week05;
import java.io.*;
import java.util.*;

public class Test5 {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("Output3.txt");
		BufferedReader br=new BufferedReader(fr);
		
		FileWriter fw=new FileWriter("Output5.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		String line, num, number;
		double []list=new double[100];
		int cnt=0;
		double n;
		
		while((line=br.readLine())!=null) {
			StringTokenizer st=new StringTokenizer(line, ":");
			while(st.hasMoreTokens()) {
				num=st.nextToken();
				number=st.nextToken();
				n=-1*Double.parseDouble(number);
				list[cnt++]=n;
			}
		}
		double[] list1=new double[cnt];
		for(int i=0;i<cnt;i++)
			list1[i]=list[i];
		Arrays.sort(list1);
		
		for(int i=0;i<list1.length;i++) {
			String str=Double.toString(list1[i]*-1);
			bw.write((i+1)+" : "+str);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}
