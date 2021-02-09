package week01;

interface Animal {
	void sound();
}
class Dog implements Animal {
	@Override
	public void sound() {
		System.out.println("¸Û¸Û~~");
	}
}
class Duck implements Animal {
	@Override
	public void sound() {
		System.out.println("²Ð²Ð~~");
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
	} // °´Ã¼¸¦ »ý¼ºÇÏÁö ¾Ê°í makeSound¸¦ ¹Ù·Î È£ÃâÇßÀ¸¹Ç·Î static,,?
}
