package week09;
import java.awt.*;
import javax.swing.*;

public class MyAppEx extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MyAppEx() {
		setTitle("Frame에 component붙이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(new JButton("OK"));
		add(new JButton("Cancel"));
		add(new JButton("Lgnore"));
		setSize(350,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyAppEx();
	}

}
