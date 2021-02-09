package week04;
import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		int n;
		Scanner stdin=new Scanner(System.in);

		try{
			System.out.print("배열 사이즈 입력 : ");
			n=stdin.nextInt();
			int array[]=new int[n];
			System.out.print("배열값 : ");
			for(int i=0;i<n;i++)
				array[i]=stdin.nextInt();
			double average=getAverage(array);
			System.out.println("평균값 : "+average);
		}
		catch(ArithmeticException e) {
			System.out.println("나누는 값으로 0 입력");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("배열 사이즈 음수 입력");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 벗어남");
		}
		catch(NullPointerException e) {
			System.out.println("null 입력");
		}
		catch(Exception e) {
			System.out.println("이외의 오류 발생");
		}
	}
	public static double getAverage(int array[]) throws Exception {
		Scanner stdin=new Scanner(System.in);
		System.out.print("평균 구할 때 나눌 값 : ");
		int size=stdin.nextInt();
		int sum=0;
		for(int i=0;i<size;i++) 
			sum+=array[i];
		return sum/(double)size;
	}
}

