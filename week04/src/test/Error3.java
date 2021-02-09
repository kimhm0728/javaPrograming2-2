package test;
import java.util.*;

public class Error3 {
	public static void main(String[] args) {
		
		try {
			read_data(args);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage()+" error 1");
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage()+" error 2");
		}
		catch(Exception e) {
			System.out.println(e.getMessage()+" error 3");
		}

	}

	public static void read_data(String[] args) throws Exception { // main에서 호출했으므로 에러 발생시 main에서 처리
		int sum=0;
		double avg=0.0;
		sum=Integer.parseInt(args[0])+Integer.parseInt(args[1]);
		avg=sum/2.0;
		
		System.out.println("Total : "+sum);
		System.out.println("Average : "+avg);
	}
}
