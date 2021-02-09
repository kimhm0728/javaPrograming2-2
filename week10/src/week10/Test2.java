package week10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test2 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField tf=new JTextField(15);
	JButton b1=new JButton("Copy");
	JButton b2=new JButton("Clear");
	JLabel jl=new JLabel("이곳에 출력됨");
	Test2() {
		setTitle("Action 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,1));
		
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		
		p1.add(tf);
		p2.add(b1);
		p2.add(b2);
		p3.add(jl);
		
		MyActionListener2 listener=new MyActionListener2();
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		
		add(p1);
		add(p2);
		add(p3);
		setSize(300,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test2();
	}
	class MyActionListener2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b=(JButton)e.getSource();
			if(b.getText().equals("Copy")) {
				String st=tf.getText();
				Font f=new Font("Serif", Font.BOLD, 30);
				jl.setForeground(Color.RED);
				jl.setFont(f);
				jl.setText(st);
			}
			else if(b.getText().equals("Clear")) {
				tf.setText("");
				jl.setText("이곳에 출력됨");
			}
		}
	}
}
