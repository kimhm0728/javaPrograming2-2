package test;
import java.io.*;

public class DataStreamDemo {
	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("c:/wk/sample3.dat");
			DataOutputStream dos=new DataOutputStream(fos); // 파일을 쓰는 것
			
			dos.writeDouble(1.0);
			dos.writeInt(1);
			dos.writeUTF("one");
			dos.flush(); // 버퍼를 비움
			
			FileInputStream fis=new FileInputStream("c:/wk/sample3.dat");
			DataInputStream dis=new DataInputStream(fis); // 파일을 읽는 것
			
			System.out.println(dis.readDouble()); // 위와 같은 순서대로 읽음
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
