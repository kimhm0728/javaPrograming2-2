package week08;

class StopThread extends Thread {
	public boolean stop;
	public void run() {
		while(!stop) {
			System.out.println("running thread");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {}
		}
		System.out.println("stop thread");
	}
}

public class ThreadStop {
	public static void main(String[] args) {
		StopThread t1=new StopThread();
		t1.start();
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
		}
		t1.stop=true;
	}
}
