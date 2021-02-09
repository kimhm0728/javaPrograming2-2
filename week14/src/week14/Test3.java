package week14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test3 extends JFrame {
	private static final long serialVersionUID = 1L;
	Container contentPane;
	Test3() {
		setTitle("그래픽 이미지 확대 축소 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		
		MyPanel panel=new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);

		setSize(300, 300);
		setVisible(true);		
		contentPane.requestFocus();
	}
	class MyPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		ImageIcon imageIcon=new ImageIcon("images/apple.jpg");
		Image image=imageIcon.getImage();
		double size;
		MyPanel() {
			size=1.0;
			addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) { // 키를 눌렀을 때
					if(e.getKeyChar()=='+') {
						size+=0.1;
						repaint();
					}
					else if(e.getKeyChar()=='-') {
						size-=0.1;
						repaint();
					}
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 10, 10, (int)(image.getWidth(this)*size), (int)(image.getHeight(this)*size), this);
		}
	}
	public static void main(String[] args) {
		new Test3();
	}

}
