package week14;

import javax.swing.*;
import java.awt.*;

public class paintComponentEx extends JFrame{
	private static final long serialVersionUID = 1L;
	Container contentPane;
	paintComponentEx() {
		setTitle("paintComponent ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		MyButton b=new MyButton("New Button");
		b.setOpaque(true);
		b.setBackground(Color.CYAN);
		contentPane.add(b);
		
		setSize(250, 200);
		setVisible(true);
	}
	class MyButton extends JButton {
		private static final long serialVersionUID = 1L;
		MyButton(String s) {
			super(s);
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawOval(0, 0, getWidth()-1, getHeight()-1);
		}
	}
	public static void main(String[] args) {
		new paintComponentEx();
	}

}
