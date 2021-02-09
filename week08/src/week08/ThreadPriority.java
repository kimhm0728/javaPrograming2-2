package week08;

class Counter extends Thread {
	private int count=0;
	public Counter(String name) {
		setName(name);
	}
	public void run() {
		while(count++<5) {
			System.out.println(getName()+" ");
			try {
				Thread.sleep(5);
			}catch(InterruptedException e) {}
		}
	}
}

public class ThreadPriority {
	public static void main(String[] args) {
		Counter c1=new Counter("Low priority");
		c1.setPriority(Thread.MIN_PRIORITY); // 1
		Counter c2=new Counter("High priority");
		c2.setPriority(Thread.MAX_PRIORITY); // 10
		
		c2.start();
		c1.start();
	}

}
