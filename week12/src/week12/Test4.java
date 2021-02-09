package week12;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Test4 extends JFrame implements ItemListener {
	private static final long serialVersionUID = 1L;
	int sum=0;
	JCheckBox []cb=new JCheckBox[4];
	String []str= {"�������� ��ȯ", "�ڵ����ӱ� ��ȯ", "���������� ��ȯ", "Ÿ�̾� ��ȯ"};
	JLabel lb;
	Test4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		for(int i=0;i<str.length;i++) {
			cb[i]=new JCheckBox(str[i]);
			add(cb[i]);
			cb[i].addItemListener(this);
		}
		lb=new JLabel("��������� ������ 0�� �Դϴ�.");
		lb.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, 30));
		add(lb);
		setSize(500, 200);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent e) {
		int select=1;
		if(e.getStateChange()==ItemEvent.SELECTED)
			select=1;
		else
			select=-1;
		if(e.getItem()==cb[0])
			sum+=45000*select;
		else if(e.getItem()==cb[1])
			sum+=80000*select;
		else if(e.getItem()==cb[2])
			sum+=30000*select;
		else
			sum+=100000*select;
		if(sum>0)
			lb.setText("��������� ������ "+(sum/1000)+","+"000�� �Դϴ�.");
		else
			lb.setText("��������� ������ 0�� �Դϴ�.");
	}
	public static void main(String[] args) {
		new Test4();
	}

}
