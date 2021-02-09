package week05;
import java.io.*;
import java.util.*;

@SuppressWarnings("serial")
class Student implements Serializable {
	String num;
	int grade;
	String name;
	String tel_number;
	
	public Student(String num, int grade, String name, String tel_number) {
		super();
		this.num = num;
		this.grade = grade;
		this.name = name;
		this.tel_number = tel_number;
	}

}

public class Test6_B {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("student.txt");
		BufferedReader br=new BufferedReader(fr);
		
		FileOutputStream fos=new FileOutputStream("student.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);

		String line;
		String num, name, tel_number;
		int grade;
		int n=0; // °´Ã¼ °¹¼ö Ä«¿îÆ®
		Student stu;
		
		while((line=br.readLine())!=null) {
			StringTokenizer st=new StringTokenizer(line);
			while(st.hasMoreTokens()) {
				num=st.nextToken();
				grade=Integer.parseInt(st.nextToken());
				name=st.nextToken();
				tel_number=st.nextToken();
				stu=new Student(num, grade, name, tel_number);
				oos.writeObject(stu);
				n++;
			}
		}
		
		System.out.println("ÇÐ»ý °´Ã¼´Â ÃÑ "+n+"°³ »ý¼ºµÊ.");

		br.close();
		oos.close();
	}

}
