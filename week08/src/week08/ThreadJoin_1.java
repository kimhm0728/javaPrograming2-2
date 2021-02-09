package week08;

public class ThreadJoin_1 {
	public static void main(String[] args) {
		JoinThread t1=new JoinThread();
		t1.start();
		try{
			t1.join();
			System.out.println("Waiting for complet thread !");
		}catch(InterruptedException e) {}
		System.out.println("Total = "+t1.total);
	}
}
