package test;

public class test1 {
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		t1.start(); // 자동으로 run() 메소드 호출
	}
}

class Thread1 extends Thread {
	public void run() { // Thread 클래스의 run() 메소드를 오버라이딩
		for(int i=0;i<10;i++)
			System.out.println(getName()+" : "+i);
	}
}