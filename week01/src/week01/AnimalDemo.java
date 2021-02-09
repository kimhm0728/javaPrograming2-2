package week01;

interface Animal {
	void sound();
}
class Dog implements Animal {
	@Override
	public void sound() {
		System.out.println("�۸�~~");
	}
}
class Duck implements Animal {
	@Override
	public void sound() {
		System.out.println("�в�~~");
	}
}

public class AnimalDemo {
	public static void main(String[] args) {
		Dog d = new Dog();
		Duck c = new Duck();
		makeSound(d);
		makeSound(c);
	}
	static void makeSound(Animal a) {
		a.sound();
	} // ��ü�� �������� �ʰ� makeSound�� �ٷ� ȣ�������Ƿ� static,,?
}
