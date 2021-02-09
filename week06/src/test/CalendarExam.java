package test;
import java.util.Calendar;
import java.util.Date;

public class CalendarExam {
	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance(); // ���� �ð� ��ü ����
		System.out.print("��¥ : ");
		System.out.print(calendar.get(Calendar.YEAR)+"�� ");
		System.out.print(calendar.get(Calendar.MONTH)+1+"�� "); // �� ���� 0~11 �̹Ƿ� 1�� ������
		System.out.print(calendar.get(Calendar.DATE)+"�� ");
		System.out.print(calendar.get(Calendar.HOUR)+"�� ");
		System.out.print(calendar.get(Calendar.MINUTE)+"�� ");
		System.out.println(calendar.get(Calendar.SECOND)+"�� ");
		
		Date d=calendar.getTime(); // getTime() -> ���� ��¥�� �ð��� ������ Date ��ü ��ȯ
		System.out.println(d); // ���� �ð� ���
		
		calendar.set(2000, 6, 28, 11, 10, 31);
		System.out.print("���� �¾ �Ͻô� : ");
		System.out.print(calendar.get(Calendar.YEAR)+"�� ");
		System.out.print(calendar.get(Calendar.MONTH)+1+"�� ");
		System.out.print(calendar.get(Calendar.DATE)+"�� ");
		System.out.print(calendar.get(Calendar.HOUR)+"�� ");
		System.out.print(calendar.get(Calendar.MINUTE)+"�� ");
		System.out.println(calendar.get(Calendar.SECOND)+"�� ");
	}

}
