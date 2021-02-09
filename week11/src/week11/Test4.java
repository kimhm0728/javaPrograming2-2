package week11;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Test4 extends JFrame {
	private static final long serialVersionUID = 1L;
	JButton btn1, btn2;
	JPanel pnl;
	
	Test4() {
		setTitle("Action 이벤트 무명 클래스 처리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pnl=new JPanel();
		
		btn1=new JButton("핑크");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnl.setBackground(Color.PINK);
			}
		});
		pnl.add(btn1);
		
		btn2=new JButton("녹색");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnl.setBackground(Color.GREEN);
			}
		});
		pnl.add(btn2);
		
		add(pnl);
		
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test4();
	}
}
