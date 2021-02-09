package week14;
import javax.swing.*;
import java.awt.*;

public class Quiz extends JFrame {
	private static final long serialVersionUID = 1L;
	Container contentPane;
	Quiz() {
		setTitle("∏Ì«‘");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		
		MyPanel panel=new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300, 160);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		ImageIcon imageIcon=new ImageIcon("images/Cat.gif");
		Image image=imageIcon.getImage();
		MyPanel() {
			setBackground(Color.LIGHT_GRAY);
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 20, 20, 80, 80, this);
			g.setColor(Color.BLACK);
			g.setFont(new Font("±º∏≤√º", Font.BOLD, 20));
			g.drawString("±Ë«˝πŒ", 150, 45);
			g.setColor(Color.BLUE);
			g.setFont(new Font("±º∏≤√º", Font.BOLD, 15));
			g.drawString("»£º≠¥Î«–±≥", 150, 65);
			g.drawString("010-3181-6227", 150, 80);
		}
	}
	public static void main(String[] args) {
		new Quiz();
	}

}
