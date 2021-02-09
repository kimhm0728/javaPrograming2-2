package week01;

public class Rect implements Shape {
	private int width, height;
	Rect(int width, int height) {
		this.width=width;
		this.height=height;
	}
	@Override
	public void draw() {
		System.out.println(width+"X"+height+" ũ���� �簢���Դϴ�.");
	}
	@Override
	public double getArea() {
		return width*height;
	}
}
