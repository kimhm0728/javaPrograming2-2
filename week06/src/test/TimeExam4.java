package test;
import java.text.SimpleDateFormat;
import java.util.*;

public class TimeExam4 {
	public static void main(String[] args) {
		SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat format2=new SimpleDateFormat("yyyy�� MM��dd�� HH��mm��ss��");
		TimeZone tz1, tz2; // java ��ƿ��Ƽ�� ����
		
		tz1=TimeZone.getTimeZone("Asia/Seoul"); // �ش� ������ �ð����� ����
		format1.setTimeZone(tz1); // TimeZone ��ü�� format Ʋ(��ü)�� ����
		
		tz2=TimeZone.getTimeZone("Europe/Paris");
		format2.setTimeZone(tz2);
		
		Date time=new Date();
		
		String time1=format1.format(time);
		String time2=format2.format(time);
		
		System.out.println(time1);
		System.out.println(time2);
	}

}
