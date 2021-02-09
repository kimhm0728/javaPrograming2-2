package week08;

class MyThread extends Thread {
	String sr="Thread ~";
	public MyThread() {}
	public MyThread(String sr) {
		this.sr=sr;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(sr);
			try {
				Thread.sleep(500); // 0.5ÃÊ
			}catch(InterruptedException e) {}
		}
	}
}

public class Thread2 {
	public static void main(String[] args) {
		Thread t1=new MyThread();
		t1.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("Main thread ~");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {}
		}
	}

}
