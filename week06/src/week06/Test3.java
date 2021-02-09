package week06;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test3 {
	public static void main(String[] args) {
		SimpleDateFormat[] format=new SimpleDateFormat[10];
		String[] string= {"yyyy�� M�� dd�� aa HH�� mm�� ss��","yy�� MM�� dd�� aa HH�� mm�� ss��",
				"dd-M-yyyy aa HH:mm:ss", "M-dd-yyyy aa HH:mm:ss", "yy-MM-dd E���� aa HH:mm:ss",
				"yyyy-M-dd aa HH:mm:ss", "yyyy/MM/dd E���� HH:mm:ss aa", "GG yyyy-M-dd E���� HH:mm:ss aa",
				"yyyy-MM-dd HH:mm:ss aa", "yy/M��/dd HH:mm:ss aa"};
		
		String[] country1= {"Asia/Seoul", "ECT", "EDT", "PDT", "Brazil/East",
				"Europe/Moscow", "AST", "Etc/GMT+2", "AET", "CST"};
		String[] country2= {"���ѹα� ǥ�ؽ�", "�ߺ� ���� ǥ�ؽ�", "�� ���� ǥ�ؽ�", "�� ����� ǥ�ؽ�",
				"��������� ǥ�ؽ�", "��ũ�� ǥ�ؽ�", "�ƶ��� ǥ�ؽ�", "��������ī �ð�",
				"����Ʈ���ϸ��� ���� ǥ�ؽ�", "�߱� ǥ�ؽ�"};

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
