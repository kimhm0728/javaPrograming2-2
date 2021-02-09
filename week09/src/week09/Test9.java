package week09;
import java.awt.*;
import javax.swing.*;

public class Test9 extends JFrame {
	private static final long serialVersionUID = 1L;
	Test9() {
		setTitle("���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(new North(),BorderLayout.NORTH);
		add(new Center(), BorderLayout.CENTER);
		add(new South(), BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test9();
	}
}

class North extends Panel {
	private static final long serialVersionUID = 1L;
	North() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		add(new JLabel("�����Է�"));
		add(new JTextField(20));
	}
}

class Center extends Panel {
	private static final long serialVersionUID = 1L;
	Center() {
		setLayout(new GridLayout(4, 4, 5, 5));
		String s[]= {"+", "-", "X", "/"};
		for(int i=0;i<10;i++)
			add(new JButton(Integer.toString(i)));
		add(new JButton("CE"));
		add(new JButton("���"));
		for(String st : s) {
			JButton b=new JButton(st);
			b.setBackground(Color.CYAN);
			add(b);
		}
	}
}

class South extends Panel {
	private static final long serialVersionUID = 1L;
	South() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setBackground(Color.YELLOW);
		add(new JLabel("�����"));
		add(new JTextField(15));
	}
}