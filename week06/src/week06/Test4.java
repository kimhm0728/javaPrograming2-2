package week06;

class Box<T> {
	T a;
	void set(T a) {
		this.a=a;
	}
	T get() {
		return a;
	}
}
public class Test4 {
	public static void main(String[] args) {
		Box<Integer> i=new Box<>();
		i.set(100);
		System.out.println(i.get());
		
		Box<String> s=new Box<>();
		s.set("Hello!");
		System.out.println(s.get());
	}

}
