package week14;
import javax.swing.*;
import java.awt.*;

public class GraphicsDrawLineEx2 extends JFrame{
	private static final long serialVersionUID = 1L;
	Container contentPane;
	GraphicsDrawLineEx2() {
		setTitle("drawLine 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		
		MyPanel panel=new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300, 600);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(10));
			// 선 굵기 조정
			g.setColor(Color.RED);
			g.drawLine(20, 20, 100, 100);
			g.drawOval(20, 150, 80, 80);
			g.drawRect(20, 270, 80, 80);
			g.drawArc(20, 400, 80, 80, 90, 270);
			
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawLineEx2();
	}

}
