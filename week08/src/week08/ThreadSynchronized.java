package week08;
import java.util.Random;

class SharedCar {
//	public void drive(String name, String city) {
	public synchronized void drive(String name, String city) {
		System.out.println(name+"�� ���� ž��");
		Random r=new Random();
		
		for(int i=0;i<r.nextInt(3);i++)
			System.out.println(name+"�� ������ ��");
		System.out.println(name+"�� "+city+"�� ������");
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
		SynchronizedThread c1=new SynchronizedThread("ȫ�浿", car, "����");
		SynchronizedThread c2=new SynchronizedThread("�̼���", car, "�λ�");
		SynchronizedThread c3=new SynchronizedThread("������", car, "����");
		
		c1.start();
		c2.start();
		c3.start();
	}
}
