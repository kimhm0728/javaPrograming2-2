package test;

public class test1 {
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		t1.start(); // �ڵ����� run() �޼ҵ� ȣ��
	}
}

class Thread1 extends Thread {
	public void run() { // Thread Ŭ������ run() �޼ҵ带 �������̵�
		for(int i=0;i<10;i++)
			System.out.println(getName()+" : "+i);
	}
}