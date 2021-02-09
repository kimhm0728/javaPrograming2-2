package week09;
import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 4, 5, 5));
		
		for(int i=0;i<10;i++) 
			add(new JButton(Integer.toString(i)));
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutEx();
	}
}
