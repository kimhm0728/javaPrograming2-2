package week09;
import java.awt.*;
import javax.swing.*;

public class Test7 extends JFrame {
	private static final long serialVersionUID = 1L;
	Test7() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 10));
		
		Color [] color= {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
				Color.CYAN, Color.BLUE, Color.MAGENTA, Color.DARK_GRAY,
				Color.PINK, Color.GRAY};
		
		for(int i=0;i<10;i++) {
			JButton jb=new JButton(Integer.toString(i));
			jb.setBackground(color[i]);
			add(jb);
		}	
		
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test7();
	}

}
