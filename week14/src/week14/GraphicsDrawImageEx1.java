package week14;

import javax.swing.*;
import java.awt.*;


public class GraphicsDrawImageEx1 extends JFrame{
	private static final long serialVersionUID = 1L;
	Container contentPane;
	GraphicsDrawImageEx1() {
		setTitle("drawImage 사용 예제1");
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
			// 원본 크기
			//g.drawImage(image, 20, 20, 100, 100, this); 
			// 100x100 사이즈로 조정
			//g.drawImage(image, 0, 0, getWidth(), getHeight(), this); 
			// 패널 사이즈에 맞게 변함
			g.drawImage(image, 20, 20, 250, 100, 50, 0, 150, 150, this);
			// 패널 20x20에서 250x100 영역에 이미지의 50x0 150x150 부분만 그리기
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawImageEx1();
	}

}
