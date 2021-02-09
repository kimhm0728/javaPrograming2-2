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
		add(new JButton("위쪽"), BorderLayout.NORTH);
		add(new JButton("아래쪽"), BorderLayout.SOUTH);
		add(new JButton("오른쪽"), BorderLayout.WEST);
		add(new JButton("왼쪽"), BorderLayout.EAST);
		add(new JButton("중앙"), BorderLayout.CENTER);
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutEx();
	}

}
