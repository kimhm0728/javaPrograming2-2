package test;
import javax.swing.*;
import java.awt.*;

public class JButtonEx0 extends JFrame {
	private static final long serialVersionUID = 1L;
	JButton bt[]=new JButton[5];
	String str[]= {"�ι�����", "��ȸ����", "��������", "�ڿ�����", "��ü�ɴ���"};
	
	JLabel jl=new JLabel("�̰��� ��µ�");
	JButtonEx0() {
		setTitle("��ư�̺�Ʈ");
		setLayout(new GridLayout(2,1,10,50));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		jp1.setLayout(new GridLayout(3,2,5,5));
		jp2.add(jl);
		for(int i=0;i<str.length;i++) {
			bt[i]=new JButton(str[i]);
			jp1.add(bt[i]);
		}
		add(jp1);
		add(jp2);
		setSize(300,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JButtonEx0();
	}

}
