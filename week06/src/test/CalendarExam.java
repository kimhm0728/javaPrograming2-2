package test;
import java.util.Calendar;
import java.util.Date;

public class CalendarExam {
	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance(); // 현재 시각 객체 생성
		System.out.print("날짜 : ");
		System.out.print(calendar.get(Calendar.YEAR)+"년 ");
		System.out.print(calendar.get(Calendar.MONTH)+1+"월 "); // 월 값이 0~11 이므로 1을 더해줌
		System.out.print(calendar.get(Calendar.DATE)+"일 ");
		System.out.print(calendar.get(Calendar.HOUR)+"시 ");
		System.out.print(calendar.get(Calendar.MINUTE)+"분 ");
		System.out.println(calendar.get(Calendar.SECOND)+"초 ");
		
		Date d=calendar.getTime(); // getTime() -> 현재 날짜와 시간을 가지는 Date 객체 반환
		System.out.println(d); // 현재 시간 출력
		
		calendar.set(2000, 6, 28, 11, 10, 31);
		System.out.print("내가 태어난 일시는 : ");
		System.out.print(calendar.get(Calendar.YEAR)+"년 ");
		System.out.print(calendar.get(Calendar.MONTH)+1+"월 ");
		System.out.print(calendar.get(Calendar.DATE)+"일 ");
		System.out.print(calendar.get(Calendar.HOUR)+"시 ");
		System.out.print(calendar.get(Calendar.MINUTE)+"분 ");
		System.out.println(calendar.get(Calendar.SECOND)+"초 ");
	}

}
