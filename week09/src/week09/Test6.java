package week09;
import java.awt.*;
import javax.swing.*;

public class Test6 extends JFrame {
	private static final long serialVersionUID = 1L;
	Test6() {
		setTitle("Ten Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 10));
		
		for(int i=0;i<10;i++)
			add(new JButton(Integer.toString(i)));
		
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test6();
	}

}
