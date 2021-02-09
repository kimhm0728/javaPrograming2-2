package week05;
import java.io.*;
import java.util.*;

public class Test6_D {
	public static void main(String[] args) throws Exception {
		FileInputStream fs=new FileInputStream("student.dat");
		ObjectInputStream ois=new ObjectInputStream(fs);

		int n; // �л� �� ī��Ʈ
		int cnt=0; // �迭 �ε��� ��;
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


		for(int g=1;g<=4;g++) { // �г�
			System.out.println(g+"�г�");
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
			System.out.println("�� "+n+"��\n");
		}
		ois.close();
	}
}
