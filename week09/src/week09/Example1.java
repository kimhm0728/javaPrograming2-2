package week09;
import java.awt.*;
import javax.swing.*;

public class Example1 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Example1() {
		setTitle("Sample Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new NorthPanel(), BorderLayout.NORTH);
		add(new CenterPanel(), BorderLayout.CENTER);
		add(new SouthPanel(), BorderLayout.SOUTH);
		// JFrame�� ����Ʈ ��ġ������ -> BorderLayout
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Example1();
	}
}

class NorthPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NorthPanel() {
		setBackground(Color.YELLOW);
		add(new JLabel("�г��� �̿��� GUI ����"));
	}
}

class CenterPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CenterPanel() {
		setLayout(new GridLayout(4, 4, 5, 5));
		for(int i=0;i<10;i++) {
			JButton b=new JButton(Integer.toString(i));
			b.setBackground(Color.CYAN);
			add(b);
		}
	}
}

class SouthPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SouthPanel() {
		setBackground(Color.GREEN);
		add(new JTextField(20)); // ������ �� ���ڴ� �ʵ��� ũ��
	}
}