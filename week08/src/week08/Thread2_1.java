package week08;

public class Thread2_1 {
	public static void main(String[] args) {
		Thread t1=new MyThread("Thread 1 ~");
		Thread t2=new MyThread("Thread 22 ~");
		t1.start();
		t2.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("Main thread ~");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {}
		}
	}

}
