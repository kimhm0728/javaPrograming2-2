package test;

public class test2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 t1=new Thread2();
		Thread t2=new Thread(t1);
		t2.start();
	}
}

class Thread2 implements Runnable {
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println(i);
	}
}