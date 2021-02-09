package week08;

class Job3 extends Thread {
	public Job3(String sr) {
		setName(sr);
	}
	public void run() {
		for(int n=0;n<10;n++)
			System.out.println(getName()+" : "+n);
	}
}

public class Quiz3 {
	public static void main(String[] args) {
		Job3 j1=new Job3("Thread");
		j1.start();
	}
}
