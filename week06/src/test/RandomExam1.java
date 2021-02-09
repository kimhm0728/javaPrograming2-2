package test;
import java.util.*;

public class RandomExam1 {
	public static void main(String[] args) {
		Random r=new Random();
		int[] num1=new int[10];
		double[] num2=new double[10];
		
		for(int i=0;i<10;i++) {
			int a=r.nextInt(20);
			a : for(int j=0;j<=i;j++) { // 값 중복 없애기
				if(a==num1[j])
					continue a;
			}
			num1[i]=a;
		}
		
		for(int i=0;i<10;i++) {
			double a=r.nextDouble();
			b : for(int j=0;j<=i;j++) {
				if(a==num2[j])
					continue b;
			}
			num2[i]=a;
		}
		Arrays.sort(num1);
		Arrays.sort(num2);
		System.out.println("Integer number = "+Arrays.toString(num1));
		System.out.println("Integer number = "+Arrays.toString(num2));
		
	}

}
