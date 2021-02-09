package week09;
import java.awt.*;
import javax.swing.*;

public class Test3 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Test3() {
		setTitle("Panel Test");
		setSize(200, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 1));
		
		Panel p1=new Panel();
		p1.setBackground(Color.RED);
		add(p1);
		
		
		Panel p2=new Panel();
		p2.setBackground(Color.YELLOW);
		add(p2);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test3();
	}
}
