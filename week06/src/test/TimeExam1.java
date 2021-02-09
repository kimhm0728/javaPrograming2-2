package test;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeExam1 {
	public static void main(String[] args) {
		SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat format2=new SimpleDateFormat("yyyy년MM월dd일HH시mm분ss초");
		// 시간 출력 틀
		Date time=new Date(); // 현재 시간 객체
		
		String time1=format1.format(time); // 객체의 틀에 현재 시간 넣은 Date 객체 반환
		String time2=format2.format(time);
		
		System.out.println(time1);
		System.out.println(time2);
	}

}
