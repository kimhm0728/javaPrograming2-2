package week11;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Test1 extends JFrame {
	private static final long serialVersionUID = 1L;
	JButton btn1, btn2;
	JPanel pnl;
	MyActionListener listener;
	
	Test1() {
		setTitle("Action �̺�Ʈ ����Ŭ���� ������ �ۼ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pnl=new JPanel();
		
		btn1=new JButton("��ũ");
		listener=new MyActionListener();
		btn1.addActionListener(listener);
		pnl.add(btn1);
		
		btn2=new JButton("���");
		btn2.addActionListener(listener);
		pnl.add(btn2);
		
		add(pnl);
		
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test1();
	}
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton btn=(JButton)e.getSource();
			if(btn.getText().equals("��ũ"))
				pnl.setBackground(Color.PINK);
			else
				pnl.setBackground(Color.GREEN);
		}
	}
}
