package test;

public class test3 {
	public static void main(String[] args) {
		Thread t1=new Thread3("Thread");
		t1.start();
	}
}

class Thread3 extends Thread {
	public Thread3(String str) {
		setName(str); // 스레드의 이름을 설정
	}
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println(getName()+" : "+i); // 스레드의 이름을 반환
	}
}