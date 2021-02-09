package week08;

public class Test1_1 {
	public static void main(String[] args) {
		T1 t1=new T1(1,30000);
		T1 t2=new T1(30001, 60000);
		T1 t3=new T1(60001, 90000);
		long time1=System.nanoTime();
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		}catch(InterruptedException e) {}
		
		long time2=System.nanoTime();
		long threadtime=time2-time1;
		long sum=0;
		sum=t1.total+t2.total+t3.total;
		System.out.println("Thread �հ� = \t\t"+sum);
		System.out.println("����ð�(�������̿�) = \t"+threadtime);
		
		time1=System.nanoTime();
		sum=0;
		for(int i=1;i<=90000;i++)
			sum+=i;
		time2=System.nanoTime();
		long fortime=time2-time1;
		System.out.println("\n��ü��� �հ� = \t\t"+sum);
		System.out.println("����ð�(��ü���) = \t\t"+fortime);
		
		System.out.println("\n����ð����� = \t\t"+(threadtime-fortime));
		
	}
}