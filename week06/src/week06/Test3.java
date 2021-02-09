package week06;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test3 {
	public static void main(String[] args) {
		SimpleDateFormat[] format=new SimpleDateFormat[10];
		String[] string= {"yyyy년 M월 dd일 aa HH시 mm분 ss초","yy년 MM월 dd일 aa HH시 mm분 ss초",
				"dd-M-yyyy aa HH:mm:ss", "M-dd-yyyy aa HH:mm:ss", "yy-MM-dd E요일 aa HH:mm:ss",
				"yyyy-M-dd aa HH:mm:ss", "yyyy/MM/dd E요일 HH:mm:ss aa", "GG yyyy-M-dd E요일 HH:mm:ss aa",
				"yyyy-MM-dd HH:mm:ss aa", "yy/M월/dd HH:mm:ss aa"};
		
		String[] country1= {"Asia/Seoul", "ECT", "EDT", "PDT", "Brazil/East",
				"Europe/Moscow", "AST", "Etc/GMT+2", "AET", "CST"};
		String[] country2= {"대한민국 표준시", "중부 유럽 표준시", "미 동부 표준시", "미 태평양 표준시",
				"브라질리아 표준시", "모스크바 표준시", "아라비아 표준시", "남아프리카 시간",
				"오스트레일리아 동부 표준시", "중국 표준시"};

		for(int i=0;i<10;i++) 
			format[i]=new SimpleDateFormat(string[i]);
		
		TimeZone []tz=new TimeZone[10];
		
		for(int i=0;i<10;i++) {
			tz[i]=TimeZone.getTimeZone(country1[i]);
			format[i].setTimeZone(tz[i]);
			
			Date time=new Date();
			
			System.out.println(country2[i]);
			System.out.println(format[i].format(time)+"\n");
		}
	}

}
