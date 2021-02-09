package week11;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Test5 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JButton red=new JButton("빨강");
	JButton green=new JButton("초록");
	JButton yellow=new JButton("노랑");
	JButton exit=new JButton("종료");
	JTextField tf=new JTextField(15);
	Test5() {
		setTitle("ActionEvent Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,1));
		
		red.setBackground(Color.RED);
		red.addActionListener(this);
		green.setBackground(Color.GREEN);
		green.addActionListener(this);
		yellow.setBackground(Color.YELLOW);
		yellow.addActionListener(this);
		exit.setBackground(Color.CYAN);
		exit.addActionListener(this);
		
		p2.setLayout(new GridLayout(1,4));
		p2.add(red);
		p2.add(green);
		p2.add(yellow);
		p2.add(exit);
		p3.add(tf);
		
		add(p1);
		add(p2);
		add(p3);
		setSize(400, 300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==red) {
			p1.setBackground(Color.RED);
			tf.setText("빨강이 선택되었습니다.");
		}
		else if(e.getSource()==green){
			p1.setBackground(Color.GREEN);
			tf.setText("초록이 선택되었습니다.");
		}
		else if(e.getSource()==yellow){
			p1.setBackground(Color.YELLOW);
			tf.setText("노랑이 선택되었습니다.");
		}
		else if(e.getSource()==exit)
			System.exit(0);
	}
	public static void main(String[] args) {
		new Test5();
	}
}
