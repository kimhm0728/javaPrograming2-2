package week08;

class InterruptThread extends Thread {
	public void run() {
		try {
			while(true) {
				System.out.println("running thread until Interruption");
				Thread.sleep(5);
			}
		}catch(InterruptedException e) {
			System.out.println("Interrupt thread");
		}
		System.out.println("sopt thread");
	}
}

public class ThreadInterrupt {
	public static void main(String[] args) {
		InterruptThread t1=new InterruptThread();
		t1.start();
		try {
			Thread.sleep(10);
		}catch(InterruptedException e) {
		}
		t1.interrupt();
	}
}
