package week01;

public class Oval implements Shape {
	private int width, height;
	Oval(int width, int height) {
		this.width=width;
		this.height=height;
	}
	@Override
	public void draw() {
		System.out.println(width+"X"+height+"에 내접하는 타원입니다.");
	}
	@Override
	public double getArea() {
		return PI*width*height;
	}
}
