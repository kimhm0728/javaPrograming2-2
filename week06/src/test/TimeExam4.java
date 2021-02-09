package test;
import java.text.SimpleDateFormat;
import java.util.*;

public class TimeExam4 {
	public static void main(String[] args) {
		SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat format2=new SimpleDateFormat("yyyy년 MM월dd일 HH시mm분ss초");
		TimeZone tz1, tz2; // java 유틸리티에 포함
		
		tz1=TimeZone.getTimeZone("Asia/Seoul"); // 해당 지역의 시간으로 설정
		format1.setTimeZone(tz1); // TimeZone 객체를 format 틀(객체)에 대입
		
		tz2=TimeZone.getTimeZone("Europe/Paris");
		format2.setTimeZone(tz2);
		
		Date time=new Date();
		
		String time1=format1.format(time);
		String time2=format2.format(time);
		
		System.out.println(time1);
		System.out.println(time2);
	}

}
