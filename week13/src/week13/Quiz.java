package week13;
import javax.swing.*;

public class Quiz extends JFrame {
	JSlider s=new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	Quiz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.setValue(SwingConstants.CENTER);
		add(s);
		
		setSize(200, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Quiz();
	}

}
