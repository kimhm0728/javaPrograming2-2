package week01;

class Circle implements Shape {
	private int radius;
	Circle(int radius) {
		this.radius=radius;
	}
	@Override
	public void draw() {
		System.out.println("�������� "+radius+"�� ���Դϴ�.");
	}
	@Override
	public double getArea() {
		return PI*radius*radius;
	}
}