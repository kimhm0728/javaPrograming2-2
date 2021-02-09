package test;
import java.io.*;

public class ObjectReadTest {
	public static void main(String[] args) throws Exception {
		FileInputStream fs=new FileInputStream("c:/wk/object.dat");
		ObjectInputStream ois=new ObjectInputStream(fs);
		
		Object s2=ois.readObject();
		Box mybox2=(Box)ois.readObject();
		
		System.out.println(s2);
		System.out.println("박스의 가로는 : "+mybox2.width);
		System.out.println("박스의 세로는 : "+mybox2.height);
		System.out.println("박스의 높이는 : "+mybox2.depth);
		System.out.println("Double 값은 : "+ois.readDouble()); // readInt로 출력하면 123이 아닌 Binary 형태의 값이 출력
		// 입력한 순서대로 출력해야 함
		ois.close();
	}

}
