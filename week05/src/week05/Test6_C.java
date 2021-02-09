package week05;
import java.io.*;

public class Test6_C {
	public static void main(String[] args) throws Exception {
		FileInputStream fs=new FileInputStream("student.dat");
		ObjectInputStream ois=new ObjectInputStream(fs);
		
		Student stu;
		int n=0; // 2�г� �л� �� ī��Ʈ
		try {
		while(true) {
			stu=(Student)ois.readObject();
			if(stu.grade==2) {
				System.out.println(stu.num+"\t"+stu.grade+"\t"+stu.name+"\t"+stu.tel_number);
				n++;
				}
			}
		}
		catch(EOFException e) { // readObject�� ���̻� ���� ��ü�� ���ٸ� null�� ��ȯ���� �ʰ� EOFException ���ܸ� �߻���Ŵ
			System.out.println();
			System.out.println("�� "+n+" ��");
		}
		ois.close();
	}
}
