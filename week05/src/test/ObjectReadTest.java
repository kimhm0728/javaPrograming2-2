package test;
import java.io.*;

public class ObjectReadTest {
	public static void main(String[] args) throws Exception {
		FileInputStream fs=new FileInputStream("c:/wk/object.dat");
		ObjectInputStream ois=new ObjectInputStream(fs);
		
		Object s2=ois.readObject();
		Box mybox2=(Box)ois.readObject();
		
		System.out.println(s2);
		System.out.println("�ڽ��� ���δ� : "+mybox2.width);
		System.out.println("�ڽ��� ���δ� : "+mybox2.height);
		System.out.println("�ڽ��� ���̴� : "+mybox2.depth);
		System.out.println("Double ���� : "+ois.readDouble()); // readInt�� ����ϸ� 123�� �ƴ� Binary ������ ���� ���
		// �Է��� ������� ����ؾ� ��
		ois.close();
	}

}
