package test;

public class test6 {
	public static void main(String[] args) throws Exception {
		Thread6 t1=new Thread6("Thread 1");
		Thread6 t2=new Thread6("Thread 2");
		t1.setPriority(1);
		t2.setPriority(5); // t2의 우선순위가 더 높음
		System.out.println("Before thread");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("After thread");
	}
}

class Thread6 extends Thread {
	public Thread6(String str) {
		setName(str);
	}
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println(getName()+" : "+i);
	}
}