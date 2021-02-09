package week08;

class NotifyThread extends Thread {
	int total=0;
	public void run() {
		synchronized(this) { // wait, notify 메소드 사용시 동기화 시켜줘야함
			for(int i=1;i<=100;i++)
				total+=i;
			notify();
		}
	}
}

public class ThreadNotify {
	public static void main(String[] args) {
		NotifyThread t1=new NotifyThread();
		t1.start();
		synchronized(t1) {
			try {
				System.out.println("Waiting until notify!");
				t1.wait(); // notify()가 호출될 때까지 대기
			}catch(InterruptedException e) {}
		}
		System.out.println("Total = "+t1.total);
	}
}
