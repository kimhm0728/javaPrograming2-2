package week08;

class MyRunnable implements Runnable {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Runnable ~");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {}
		}
	}
}

public class Thread1 {
	public static void main(String[] args) {
		Thread t1=new Thread(new MyRunnable());
		t1.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("Main thread ~");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {}
		}
	}
}
