package week14;
import javax.swing.*;
import java.awt.*;

public class Test1_B extends JFrame {
	private static final long serialVersionUID = 1L;
	Container contentPane;
	Test1_B() {
		setTitle("¿À·û±â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		
		MyPanel panel=new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(400, 300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2=(Graphics2D) g;
			g2.setStroke(new BasicStroke(5));
			
			g.setColor(Color.BLUE);
			g.drawOval(10, 10, 100, 100);
			g.setColor(Color.BLACK);
			g.drawOval(120, 10, 100, 100);
			g.setColor(Color.RED);
			g.drawOval(230, 10, 100, 100);
			g.setColor(Color.YELLOW);
			g.drawOval(60, 60, 100, 100);
			g.setColor(Color.GREEN);
			g.drawOval(170, 60, 100, 100);
		}
	}
	public static void main(String[] args) {
		new Test1_B();
	}

}
