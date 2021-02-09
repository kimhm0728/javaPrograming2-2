package week02;

class MyPoint {
	int a,b;

	public MyPoint(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "MyPoint("+a+","+b+")";
	}
	
}

public class MyPointTest {
	public static void main(String[] args) {
		MyPoint a=new MyPoint(3,20);
		System.out.println(a);
	}

}
