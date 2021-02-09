package test;
import java.text.SimpleDateFormat;

public class TimeExam3 {
	public static void main(String[] args) {
		SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat format2=new SimpleDateFormat("yyyy년 MM월dd일 HH시mm분ss초");
		
		String format_time1=format1.format(System.currentTimeMillis());
		String format_time2=format2.format(System.currentTimeMillis());
		// System 클래스의 currentTimeMillis() 메소드 -> 현재 시간을 반환 (long 타입의 1/1000초 값)
		// new Date(System.currentTimeMillis()) 도 가능
		
		System.out.println(format_time1);
		System.out.println(format_time2);
	}

}
