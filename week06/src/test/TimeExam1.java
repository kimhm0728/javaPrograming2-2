package test;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeExam1 {
	public static void main(String[] args) {
		SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat format2=new SimpleDateFormat("yyyy��MM��dd��HH��mm��ss��");
		// �ð� ��� Ʋ
		Date time=new Date(); // ���� �ð� ��ü
		
		String time1=format1.format(time); // ��ü�� Ʋ�� ���� �ð� ���� Date ��ü ��ȯ
		String time2=format2.format(time);
		
		System.out.println(time1);
		System.out.println(time2);
	}

}
