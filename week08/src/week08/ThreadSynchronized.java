package week08;
import java.util.Random;

class SharedCar {
//	public void drive(String name, String city) {
	public synchronized void drive(String name, String city) {
		System.out.println(name+"이 차에 탑승");
		Random r=new Random();
		
		for(int i=0;i<r.nextInt(3);i++)
			System.out.println(name+"이 운전을 함");
		System.out.println(name+"이 "+city+"에 도착함");
	}
}

class SynchronizedThread extends Thread {
	String name;
	SharedCar car;
	String city;
	public SynchronizedThread(String name, SharedCar car, String city) {
		this.name=name;
		this.car=car;
		this.city=city;
	}
	public void run() {
		car.drive(name,city);
	}
}

public class ThreadSynchronized {
	public static void main(String[] args) {
		SharedCar car=new SharedCar();
		SynchronizedThread c1=new SynchronizedThread("홍길동", car, "서울");
		SynchronizedThread c2=new SynchronizedThread("이순신", car, "부산");
		SynchronizedThread c3=new SynchronizedThread("김유신", car, "대전");
		
		c1.start();
		c2.start();
		c3.start();
	}
}
