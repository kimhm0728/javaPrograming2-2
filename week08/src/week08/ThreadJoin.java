package week08;

class JoinThread extends Thread {
	int total=0;
	public void run() {
		for(int i=1;i<=100;i++)
			total+=i;
	}
}

public class ThreadJoin {
	public static void main(String[] args) {
		JoinThread t1=new JoinThread();
		t1.start();

		System.out.println("Total = "+t1.total);
	}
}
