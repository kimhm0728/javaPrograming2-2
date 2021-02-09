package week14;

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawStringEx extends JFrame {
	private static final long serialVersionUID = 1L;
	Container contentPane;
	GraphicsDrawStringEx() {
		setTitle("drawString ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		
		MyPanel panel=new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		setSize(250, 200);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("�ڹٴ� ��մ�.~~", 30, 30);
			g.drawString("�󸶳�? �ϴø�ŭ ����ŭ !!!!", 60, 60);
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawStringEx();
	}

}
