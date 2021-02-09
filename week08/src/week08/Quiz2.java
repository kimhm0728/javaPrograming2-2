package week08;

class Job2 extends Thread {
	public void run() {
		for(int n=0;n<10;n++)
			System.out.println(n);
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		Job2 j1=new Job2();
		j1.start();
	}
}
