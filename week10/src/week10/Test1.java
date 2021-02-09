package week10;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Test1 extends JFrame {

	private static final long serialVersionUID = 1L;
	Test1() {
		setTitle("Action 이벤트");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyActionListener listener=new MyActionListener();
		JButton jb=new JButton("Action");
		jb.addActionListener(listener );
		
		add(jb);
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test1();
	}
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b=(JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
		}
	}
}