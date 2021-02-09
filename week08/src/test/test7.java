package test;

public class test7 {
	public static void main(String[] args) throws Exception {
		Thread7 t1=new Thread7("Thread");
		System.out.println("Before thread");
		t1.start();
		t1.join();
		System.out.println("After thread");
	}
}

class Thread7 extends Thread {
	public Thread7(String str) {
		setName(str);
	}
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println(getName()+" : "+i);
				Thread.sleep(1000); // 하나 출력할 때 마다 1초 대기
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}