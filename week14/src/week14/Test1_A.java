package week14;
import javax.swing.*;
import java.awt.*;

public class Test1_A extends JFrame {
	private static final long serialVersionUID = 1L;
	Container contentPane;
	Test1_A() {
		setTitle("삼원색 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		
		MyPanel panel=new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.YELLOW);
			g.fillArc(10, 10, 250, 250, -30, 120);
			g.setColor(Color.RED);
			g.fillArc(10, 10, 250, 250, 90, 120);
			g.setColor(Color.BLUE);
			g.fillArc(10, 10, 250, 250, 210, 120);
		}
	}
	public static void main(String[] args) {
		new Test1_A();
	}

}
