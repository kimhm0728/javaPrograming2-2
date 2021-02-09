package week09;
import java.awt.*;
import javax.swing.*;

public class Test2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Test2() {
		setTitle("Panel Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);
		add(new RedPanel());
		add(new GreenPanel());
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test2();
	}
}

class RedPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	RedPanel() {
		setSize(200, 200);
		setBackground(Color.RED);
	}
}
class GreenPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	GreenPanel() {
		setSize(200, 200);
		setBackground(Color.GREEN);
	}
}