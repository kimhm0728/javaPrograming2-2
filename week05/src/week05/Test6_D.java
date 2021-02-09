package week05;
import java.io.*;
import java.util.*;

public class Test6_D {
	public static void main(String[] args) throws Exception {
		FileInputStream fs=new FileInputStream("student.dat");
		ObjectInputStream ois=new ObjectInputStream(fs);

		int n; // 학생 수 카운트
		int cnt=0; // 배열 인덱스 값;
		String[] str=new String[100];

		try {
			while(true) {
				Student stu=(Student)ois.readObject();
				str[cnt++]=stu.grade+" "+stu.num+" "+stu.name+" "+stu.tel_number;
			}
		}
		catch(EOFException e) {
		}

		String[] str1=new String[cnt];
		System.arraycopy(str, 0, str1, 0, cnt);
		Arrays.parallelSort(str1);


		for(int g=1;g<=4;g++) { // 학년
			System.out.println(g+"학년");
			n=0;
			for(int i=0;i<cnt;i++) {
				StringTokenizer st=new StringTokenizer(str1[i]);
				while(st.hasMoreTokens()) {
					int grade=Integer.parseInt(st.nextToken());
					String num=st.nextToken();
					String name=st.nextToken();
					String tel_number=st.nextToken();
					if(grade==g) {
						System.out.println(num+"\t"+grade+"\t"+name+"\t"+tel_number);
						n++;
					}
				}
			}
			System.out.println("총 "+n+"명\n");
		}
		ois.close();
	}
}
