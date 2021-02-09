package week02;

class Circle {
	int x,y,radius;

	public Circle(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		Circle c=(Circle)obj;
		if(c.radius==this.radius) // c.x==this.x && c.y==this.y (좌표가 같을 경우)
			return true;
		else return false;
	}
}

public class CircleTest {
	public static void main(String[] args) {
		Circle c1=new Circle(1,3,5);
		Circle c2=new Circle(-3,1,4);
		Circle c3=new Circle(10,13,5);
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c3.equals(c2));
	}

}
