package week10;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Test3 extends JFrame {
	private static final long serialVersionUID = 1L;
	JButton btn1, btn2;
	JPanel pnl;
	JLabel lbl;
	MyActionListener3 listener;
	
	Test3() {
		setTitle("Action �̺�Ʈ Ŭ���� ������ �ۼ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pnl=new JPanel();
		btn1=new JButton("��ũ");
		listener=new MyActionListener3();
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
		new Test3();
	}
	class MyActionListener3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b=(JButton)e.getSource();
			if(b.getText().equals("��ũ")) 
				pnl.setBackground(Color.PINK);
			else if(b.getText().equals("���"))
				pnl.setBackground(Color.GREEN);
		}
	}
}
