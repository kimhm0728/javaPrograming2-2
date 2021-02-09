package test;
import java.io.*;

public class DataStreamDemo {
	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("c:/wk/sample3.dat");
			DataOutputStream dos=new DataOutputStream(fos); // ������ ���� ��
			
			dos.writeDouble(1.0);
			dos.writeInt(1);
			dos.writeUTF("one");
			dos.flush(); // ���۸� ���
			
			FileInputStream fis=new FileInputStream("c:/wk/sample3.dat");
			DataInputStream dis=new DataInputStream(fis); // ������ �д� ��
			
			System.out.println(dis.readDouble()); // ���� ���� ������� ����
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
			
			dis.close();
			dos.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
