package week08;

class Job1 implements Runnable {
	public void run() {
		for(int n=0;n<10;n++)
			System.out.println(n);
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		Thread j1=new Thread(new Job1());
		j1.start();
	}
}
