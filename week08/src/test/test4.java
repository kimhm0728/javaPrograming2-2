package test;

public class test4 {
	public static void main(String[] args) throws Exception {
		Thread4 t1=new Thread4("Thread");
	    System.out.println("Before thread");
	    t1.start();
	    t1.join(); // ���� ó���� ����� ��
	    // join �޼ҵ� -> t1 �������� ������ ���� ������ ����ϹǷ� �ǵ���� ������ ��µ�
	    System.out.println("After thread");
	    // before, after, start ������ ���. 
	    // ������� ������ ���μ���. main ������� thread4��� ������� ������ �� ����
	    // �� �ϳ��� �����尡 �� ���� �� ���� �����带 ������
	}
}

class Thread4 extends Thread {
	public Thread4(String str) {
		setName(str);
	}
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println(getName()+" : "+i);
	}
}