package test;

public class test4 {
	public static void main(String[] args) throws Exception {
		Thread4 t1=new Thread4("Thread");
	    System.out.println("Before thread");
	    t1.start();
	    t1.join(); // 예외 처리를 해줘야 함
	    // join 메소드 -> t1 스레드의 실행이 끝날 때까지 대기하므로 의도대로 실행결과 출력됨
	    System.out.println("After thread");
	    // before, after, start 순으로 출력. 
	    // 스레드는 일종의 프로세스. main 스레드와 thread4라는 스레드로 구분할 수 있음
	    // 즉 하나의 스레드가 다 끝난 후 다음 스레드를 실행함
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