package week14;
import javax.swing.*;
import java.awt.*;

public class Test1_C extends JFrame {
	private static final long serialVersionUID = 1L;
	Container contentPane;
	Test1_C() {
		setTitle("격자 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		
		MyPanel panel=new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(254, 277);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			for(int i=1;i<10;i++) {
				g.drawLine(0, 24*i, 250, 24*i); // 가로 줄
				g.drawLine(24*i, 0, 24*i, 250); // 세로 줄
			}

		}
	}
	public static void main(String[] args) {
		new Test1_C();
	}

}
