package week05;
import java.io.*;

public class Test6_C {
	public static void main(String[] args) throws Exception {
		FileInputStream fs=new FileInputStream("student.dat");
		ObjectInputStream ois=new ObjectInputStream(fs);
		
		Student stu;
		int n=0; // 2학년 학생 수 카운트
		try {
		while(true) {
			stu=(Student)ois.readObject();
			if(stu.grade==2) {
				System.out.println(stu.num+"\t"+stu.grade+"\t"+stu.name+"\t"+stu.tel_number);
				n++;
				}
			}
		}
		catch(EOFException e) { // readObject는 더이상 읽을 객체가 없다면 null을 반환하지 않고 EOFException 예외를 발생시킴
			System.out.println();
			System.out.println("총 "+n+" 명");
		}
		ois.close();
	}
}
