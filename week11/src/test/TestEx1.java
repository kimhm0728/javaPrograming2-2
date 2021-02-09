package test;
import java.awt.event.*;
import javax.swing.*;

public class TestEx1 extends JFrame {
	private static final long serialVersionUID = 1L;
	TestEx1() {
		JButton btn=new JButton("Hello");
		setTitle("Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn.addActionListener(new MyActionListener1("1"));
		btn.addActionListener(new MyActionListener1("2"));
		btn.addActionListener(new MyActionListener1("3"));
		add(btn);
		// 객체 생성된 순서의 반대대로 실행
		
		setSize(300, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TestEx1();
	}
	class MyActionListener1 implements ActionListener {
		private String msg;
		public MyActionListener1(String msg) {
			this.msg=msg;
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println(msg);
		}
	}
}
