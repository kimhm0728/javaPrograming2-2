package week14;
import javax.swing.*;
import java.awt.*;

public class Test4 extends JFrame {
	private static final long serialVersionUID = 1L;
	Container contentPane;
	Test4() {
		setTitle("그래픽 이미지 연습");
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
		int imageW=image.getWidth(this);
		int imageH=image.getHeight(this);
		public void paintComponent(Graphics g) {
			int panelW=this.getWidth();
			int panelH=this.getHeight();
			super.paintComponent(g);
			g.drawImage(image, 0, 0, panelW/2-5, panelH/2-5, 0, 0, imageW/2, imageH/2, this);
			g.drawImage(image, panelW/2+5, 0, panelW, panelH/2-5, imageW/2, 0, imageW, imageH/2, this);
			g.drawImage(image, 0, panelH/2+5, panelW/2-5, panelH, 0, imageH/2, imageW/2, imageH, this);
			g.drawImage(image, panelW/2+5, panelH/2+5, panelW, panelH, imageW/2, imageH/2, imageW, imageH, this);
		}
	}
	public static void main(String[] args) {
		new Test4();
	}

}
