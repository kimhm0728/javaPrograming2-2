package week12;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxItemEventEx extends JFrame {
	private static final long serialVersionUID = 1L;
	Container contentPane;
	JCheckBox []fruits=new JCheckBox [3];
	String [] names= {"���", "��", "ü��"};
	JLabel sumLabel;
	int sum=0;
	CheckBoxItemEventEx() {
		setTitle("üũ�ڽ��� ItemEvent ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());

		contentPane.add(new JLabel("��� 100��, �� 500��, ü�� 20000��"));
		for(int i=0;i<fruits.length;i++) {
			fruits[i]=new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			contentPane.add(fruits[i]);
			fruits[i].addItemListener(new MyItemListener());
		}
		sumLabel=new JLabel("���� 0�� �Դϴ�.");
		contentPane.add(sumLabel);
		setSize(250,200);
		setVisible(true);
	}
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			int selected=1;
			if(e.getStateChange()==ItemEvent.SELECTED) // ���� ���� ��
				selected=1;
			else // ���õ��� �ʾ��� ��
				selected=-1;
			if(e.getItem()==fruits[0])
				sum+=selected*100;
			else if(e.getItem()==fruits[1])
				sum+=selected*500;
			else
				sum+=selected*20000;
			sumLabel.setText("���� "+sum+"�� �Դϴ�.");
		}
	}
	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}

}
