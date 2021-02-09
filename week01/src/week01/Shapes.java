package week01;

public class Shapes {
	public static void main(String[] args) {
		Shape donut = new Circle(10);
		donut.redraw();
		System.out.println("¸éÀûÀº "+donut.getArea());
	}

}
