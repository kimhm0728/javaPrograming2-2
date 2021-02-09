package test;
import java.util.*;

public class GCalendarExam {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("���ϴ� ��� ���� �Է�(����� �������� �����Ͽ� �Է�) : ");
		int year=s.nextInt();
		int month=s.nextInt();
		GregorianCalendar cal=new GregorianCalendar(year, month-1, 1);
		int maxd=cal.getActualMaximum(Calendar.DATE); // �ش� ���� ������ ��¥
		int sday=cal.get(Calendar.DAY_OF_WEEK); // 1���� ����
		System.out.println("\n Sun  Mon  Tue  Wed  Thu  Fri  Sat");
		for(int i=1;i<sday;i++)
			System.out.print("     ");
		for(int i=1;i<=maxd;i++) {
			if(i>0&&i<10)
				System.out.print("  "+i+"  ");
			else
				System.out.print(" "+i+"  "); // ��¥�� �� �ڸ� ���� ��� ������ ����
			if(sday%7==0)
				System.out.println(); // sday�� ������� �Ǹ� �� �� ���
			sday++;
		}
		s.close();

	}

}
