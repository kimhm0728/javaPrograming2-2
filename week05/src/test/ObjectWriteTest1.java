package test;
import java.io.*;
@SuppressWarnings("serial")
class Box implements Serializable { // 상속 받지 않을 시 객체 대입 불가. (23줄)
	public int width;
	public int height;
	public int depth;
	public Box(int w, int h, int d) {
		width=w;
		height=h;
		depth=d;
	}
}
public class ObjectWriteTest1 {
	public static void main(String[] args) throws Exception { // try문 대신 throws
		FileOutputStream fos=new FileOutputStream("c:/wk/object.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		String s1="***박스의 가로,,세로,높이***";
		Box mybox1=new Box(10,20,30);
		
		oos.writeObject(s1); // 문자열도 일종의 객체 (String 객체. Serializable을 상속받음)
		oos.writeObject(mybox1);
		oos.writeDouble(123.456);
		
		oos.close();
		System.out.println("tmp.txt 화일명으로 객체 파일을 생성하였습니다.");
		
	}

}
// Binary 값으로 저장되어 있기 때문에 object 파일을 열어봐도 알 수 없는 값들이 저장되어 있음