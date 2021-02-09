package week09;
import java.awt.*;
import javax.swing.*;

public class Test5 extends JFrame {
	private static final long serialVersionUID = 1L;
	Test5() {
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(5, 7));
		
		add(new JButton("合 率"), BorderLayout.NORTH);
		add(new JButton("哭 率"), BorderLayout.WEST);
		add(new JButton("吝 居"), BorderLayout.CENTER);
		add(new JButton("坷弗率"), BorderLayout.EAST);
		add(new JButton("巢 率"), BorderLayout.SOUTH);
		
		setSize(400,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test5();
	}
}
