package week01;

public class Oval implements Shape {
	private int width, height;
	Oval(int width, int height) {
		this.width=width;
		this.height=height;
	}
	@Override
	public void draw() {
		System.out.println(width+"X"+height+"�� �����ϴ� Ÿ���Դϴ�.");
	}
	@Override
	public double getArea() {
		return PI*width*height;
	}
}
