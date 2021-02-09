package week08;

class T1 extends Thread {
	int start, end;
	long total;
	public T1(int start, int end) {
		this.start=start;
		this.end=end;
	}
	public void run() {
		total=0;
		for(int i=start;i<=end;i++)
			total+=i;
	}
}

public class Test1 {
	public static void main(String[] args) {
		T1 t1=new T1(1,30000);
		T1 t2=new T1(30001, 60000);
		T1 t3=new T1(60001, 90000);
		
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		}catch(InterruptedException e) {}
		
		long sum=0;
		sum=t1.total+t2.total+t3.total;
		System.out.println("1~30000ÀÇ ÇÕ = \t\t"+t1.total);
		System.out.println("30000~60000ÀÇ ÇÕ = \t"+t2.total);
		System.out.println("600001~90000ÀÇ ÇÕ = \t"+t3.total);
		System.out.println("ÃÑÈü = \t\t"+sum);
		
		sum=0;
		for(int i=1;i<=90000;i++)
			sum+=i;
		System.out.println("ÃÑÇÕ2 = \t\t"+sum);
		
	}
}
