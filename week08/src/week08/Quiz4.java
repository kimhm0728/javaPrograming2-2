package week08;

class Job4 extends Thread {
	public Job4(String sr) {
		setName(sr);
	}
	public void run() {
		for(int n=0;n<10;n++)
			System.out.println(getName()+" : "+n);
	}
}

public class Quiz4 {
	public static void main(String[] args) {
		Job4 j1=new Job4("1st Thread");
		Job4 j2=new Job4("2nd Thread");
		j1.start();
		j2.start();
	}
}
