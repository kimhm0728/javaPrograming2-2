package test;
import java.util.TimeZone;

public class TimeExam5 {
	public static void main(String[] args) {
		String[] local=TimeZone.getAvailableIDs(); 
		// Ŭ���� �޼ҵ� getAvailableIDs() -> TimeZone Ŭ������ �����ϴ� ���� �迭�� ��ȯ
		for(int i=0;i<local.length;i++)
			System.out.println(local[i]);
	}

}
