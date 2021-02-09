package test;
import java.util.Random;

public class RandomExam {
	public static void main(String[] args) {
		Random r=new Random();
		for(int i=0;i<10;i++) {
			double d=r.nextDouble();
			int a=r.nextInt(20); // 0~19
			System.out.println("Integer Number = "+a+"\t Double Number = "+d);
		}
	}

}
