package test;

public class test8 {
	public static void main(String[] args) {
		Count cc=new Count();
		Thread8 t1=new Thread8(cc);
		Thread8 t2=new Thread8(cc);
		Thread8 t3=new Thread8(cc);
		Thread8 t4=new Thread8(cc);
		Thread8 t5=new Thread8(cc);
	
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}

class Thread8 extends Thread {
	Count c;
	public Thread8(Count c) {
		this.c=c;
	}
	public void run() {
		for(int i=0;i<10000;i++) {
			c.inc();
			c.dec();
			if(i%1000==0)
				c.print();
			try {
				int t=(int)(Math.random()*2);
				sleep(t);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
class Count {
	int value=0;
//	public void inc() {
	synchronized public void inc() {
		value++;
	}
//	public void dec() {
	synchronized public void dec() {
		value--;
	}
	public void print() {
		System.out.println(value);
	}
}

/* 5���� �����尡 �ϳ��� cc ��ü�� ����ϹǷ� value �ʵ带 ����. 
 * ����ȭ �޼ҵ� ���� ������ inc dec�� �Լ� ȣ���� CPU�� ���࿡ ���� �������� ����Ǳ� ������
 * value ���� 0�� �������� �ʰ� �ٸ� ���� ȣ���
 * ����ȭ �޼ҵ带 ����Ѵٸ� �� ��������� �ϳ��� ����ǹǷ� 0�� ����
*/