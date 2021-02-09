package test;
import java.io.*;
@SuppressWarnings("serial")
class Box implements Serializable { // ��� ���� ���� �� ��ü ���� �Ұ�. (23��)
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
	public static void main(String[] args) throws Exception { // try�� ��� throws
		FileOutputStream fos=new FileOutputStream("c:/wk/object.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		String s1="***�ڽ��� ����,,����,����***";
		Box mybox1=new Box(10,20,30);
		
		oos.writeObject(s1); // ���ڿ��� ������ ��ü (String ��ü. Serializable�� ��ӹ���)
		oos.writeObject(mybox1);
		oos.writeDouble(123.456);
		
		oos.close();
		System.out.println("tmp.txt ȭ�ϸ����� ��ü ������ �����Ͽ����ϴ�.");
		
	}

}
// Binary ������ ����Ǿ� �ֱ� ������ object ������ ������� �� �� ���� ������ ����Ǿ� ����