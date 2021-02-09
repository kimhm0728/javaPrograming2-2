package week14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test2_C extends JFrame {
	private static final long serialVersionUID = 1L;
	Container contentPane;
	Test2_C() {
		setTitle("이미지 위에 원 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		
		MyPanel panel=new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);

		setSize(300, 300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		ImageIcon imageIcon=new ImageIcon("images/back.jpg");
		Image image=imageIcon.getImage();
		int X=150, Y=100;

		public MyPanel() {
			addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					X=e.getX();
					Y=e.getY();
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.GREEN);
			g.fillOval(X, Y, 20, 20);
		}
	}
	public static void main(String[] args) {
		new Test2_C();
	}

}