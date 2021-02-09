package test;

class Max<T extends Number>{ // Number 클래스를 상속 (즉 Number 클래스의 타입들 모두 가능)
	T max(T t1, T t2) {
		if((Double)t1.doubleValue()>(Double)t2.doubleValue())
			return t1;
		else return t2;
	}
}

public class MaxTest {
	public static void main(String[] args) {
		Max<Number> m=new Max<>();
		System.out.println(m.max(10.0, 8.0));
		System.out.println(m.max(5, 8.0));
		System.out.println(m.max(5, 3.0));
	}

}
