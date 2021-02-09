package week09;
import java.awt.*;
import javax.swing.*;

public class Test4 extends JFrame {
	private static final long serialVersionUID = 1L;
	Test4() {
		setTitle("Panel Test");
		setSize(200, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 1));
		
		Panel p1=new Panel();
		p1.setBackground(Color.RED);
		p1.add(new JButton("»¡°­»ö"));
		add(p1);
		
		Panel p2=new Panel();
		p2.setBackground(Color.YELLOW);
		p2.add(new JButton("³ë¶û»ö"));
		add(p2);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test4();
	}
}
