package test;

public class test5 {
	public static void main(String[] args) {
		Thread5 t1=new Thread5("Thread 1");
		Thread5 t2=new Thread5("Thread 2");
		Thread5 t3=new Thread5("Thread 3"); // ��Ƽ ������
		t1.start();
		t2.start();
		t3.start(); // �� �������� ����� ������ �Ǵ� ������� �������� ���
	}
}

class Thread5 extends Thread {
	public Thread5(String str) {
		setName(str);
	}
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println(getName()+" : "+i);
	}
}