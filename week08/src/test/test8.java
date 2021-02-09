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

/* 5개의 스레드가 하나의 cc 객체를 사용하므로 value 필드를 공유. 
 * 동기화 메소드 쓰지 않으면 inc dec의 함수 호출이 CPU의 실행에 따라 무작위로 실행되기 때문에
 * value 값이 0이 유지되지 않고 다른 값이 호출됨
 * 동기화 메소드를 사용한다면 각 스레드들이 하나씩 실행되므로 0을 유지
*/