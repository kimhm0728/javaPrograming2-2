package week14;

import javax.swing.*;
import java.awt.*;


public class GraphicsDrawImageEx1 extends JFrame{
	private static final long serialVersionUID = 1L;
	Container contentPane;
	GraphicsDrawImageEx1() {
		setTitle("drawImage ��� ����1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		
		MyPanel panel=new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300, 400);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		ImageIcon imageIcon=new ImageIcon("images/image0.jpg");
		Image image=imageIcon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			//g.drawImage(image, 20, 20, this); 
			// ���� ũ��
			//g.drawImage(image, 20, 20, 100, 100, this); 
			// 100x100 ������� ����
			//g.drawImage(image, 0, 0, getWidth(), getHeight(), this); 
			// �г� ����� �°� ����
			g.drawImage(image, 20, 20, 250, 100, 50, 0, 150, 150, this);
			// �г� 20x20���� 250x100 ������ �̹����� 50x0 150x150 �κи� �׸���
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawImageEx1();
	}

}
