package test;
import java.text.SimpleDateFormat;

public class TimeExam3 {
	public static void main(String[] args) {
		SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat format2=new SimpleDateFormat("yyyy�� MM��dd�� HH��mm��ss��");
		
		String format_time1=format1.format(System.currentTimeMillis());
		String format_time2=format2.format(System.currentTimeMillis());
		// System Ŭ������ currentTimeMillis() �޼ҵ� -> ���� �ð��� ��ȯ (long Ÿ���� 1/1000�� ��)
		// new Date(System.currentTimeMillis()) �� ����
		
		System.out.println(format_time1);
		System.out.println(format_time2);
	}

}
