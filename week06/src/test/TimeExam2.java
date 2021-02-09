package test;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeExam2 {
	public static void main(String[] args) {
		SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat format2=new SimpleDateFormat("yyyy년 MM월dd일 HH시mm분ss초");
		
		Calendar time=Calendar.getInstance();
		
		String format_time1=format1.format(time.getTime());
		String format_time2=format2.format(time.getTime());
		// Calendar 클래스의 getTime() 메소드 -> 현재 시간을 가지는 Date 객체 반환
		
		System.out.println(format_time1);
		System.out.println(format_time2);
	}

}
