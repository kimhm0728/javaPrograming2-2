package week14;
import javax.swing.*;
import java.awt.*;

public class Test2_A extends JFrame {
	private static final long serialVersionUID = 1L;
	Container contentPane;
	Test2_A() {
		setTitle("이미지 그리기 연습");
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
		MyPanel() {
			setLayout(new FlowLayout());
			Button b=new Button("Show");
			add(b);
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		}
	}
	public static void main(String[] args) {
		new Test2_A();
	}

}
