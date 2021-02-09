package week09;
import javax.swing.*;

class MyFrame1 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MyFrame1() {
		setTitle("세번째 프레임");
		setSize(300, 300);
		setVisible(true);
	}
}

public class MyApp3 {
	public static void main(String[] args) {
		new MyFrame1();
	}
}
