package week08;

class NotifyThread extends Thread {
	int total=0;
	public void run() {
		synchronized(this) { // wait, notify �޼ҵ� ���� ����ȭ ���������
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
				t1.wait(); // notify()�� ȣ��� ������ ���
			}catch(InterruptedException e) {}
		}
		System.out.println("Total = "+t1.total);
	}
}
