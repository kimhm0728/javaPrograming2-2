package test;
import java.util.TimeZone;

public class TimeExam5 {
	public static void main(String[] args) {
		String[] local=TimeZone.getAvailableIDs(); 
		// 클래스 메소드 getAvailableIDs() -> TimeZone 클래스가 제공하는 나라를 배열로 반환
		for(int i=0;i<local.length;i++)
			System.out.println(local[i]);
	}

}
