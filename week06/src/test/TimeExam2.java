package test;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeExam2 {
	public static void main(String[] args) {
		SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat format2=new SimpleDateFormat("yyyy�� MM��dd�� HH��mm��ss��");
		
		Calendar time=Calendar.getInstance();
		
		String format_time1=format1.format(time.getTime());
		String format_time2=format2.format(time.getTime());
		// Calendar Ŭ������ getTime() �޼ҵ� -> ���� �ð��� ������ Date ��ü ��ȯ
		
		System.out.println(format_time1);
		System.out.println(format_time2);
	}

}
