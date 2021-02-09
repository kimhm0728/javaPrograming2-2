package week09;
import java.awt.*;
import javax.swing.*;

public class BorderLayoutEx extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	BorderLayoutEx() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		add(new JButton("����"), BorderLayout.NORTH);
		add(new JButton("�Ʒ���"), BorderLayout.SOUTH);
		add(new JButton("������"), BorderLayout.WEST);
		add(new JButton("����"), BorderLayout.EAST);
		add(new JButton("�߾�"), BorderLayout.CENTER);
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutEx();
	}

}
