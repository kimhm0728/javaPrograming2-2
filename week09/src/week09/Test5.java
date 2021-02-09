package week09;
import java.awt.*;
import javax.swing.*;

public class Test5 extends JFrame {
	private static final long serialVersionUID = 1L;
	Test5() {
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(5, 7));
		
		add(new JButton("�� ��"), BorderLayout.NORTH);
		add(new JButton("�� ��"), BorderLayout.WEST);
		add(new JButton("�� ��"), BorderLayout.CENTER);
		add(new JButton("������"), BorderLayout.EAST);
		add(new JButton("�� ��"), BorderLayout.SOUTH);
		
		setSize(400,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test5();
	}
}
