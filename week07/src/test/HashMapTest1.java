package test;
import java.util.*;

public class HashMapTest1 {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("����", "���ѱ�");
		hm.put("����", "21");
		
		Object x=hm.put("����","���ѹα�");
		// �����̶�� Ű�� �������� �����Ƿ� null�� ��ȯ�ϰ� �ʿ� �߰�
		if(x!=null)
			System.out.println("��ü�� �� : "+x);
		else 
			System.out.println("�ʿ� �߰�");
		System.out.println(hm);
		
		Object y=hm.put("����","24");
		// ���̶�� Ű�� ���� ���� ��ȯ
		if(y!=null)
			System.out.println("��ü�� �� : "+y);
		System.out.println(hm);
		
		Object z=hm.remove("����"); // Ű�� ���� ��ȯ
		if(z!=null)
			System.out.println("������ �� : "+z);
		else 
			System.out.println("Ű�� �������� ����");
		System.out.println(hm);
	}

}
