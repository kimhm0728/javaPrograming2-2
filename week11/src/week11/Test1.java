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
		setTitle("Action 이벤트 내부클래스 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pnl=new JPanel();
		
		btn1=new JButton("핑크");
		listener=new MyActionListener();
		btn1.addActionListener(listener);
		pnl.add(btn1);
		
		btn2=new JButton("녹색");
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
			if(btn.getText().equals("핑크"))
				pnl.setBackground(Color.PINK);
			else
				pnl.setBackground(Color.GREEN);
		}
	}
}
