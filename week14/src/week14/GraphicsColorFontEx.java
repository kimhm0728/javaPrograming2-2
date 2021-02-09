package week14;

import javax.swing.*;
import java.awt.*;

public class GraphicsColorFontEx extends JFrame {
	private static final long serialVersionUID = 1L;
	Container contentPane;
	GraphicsColorFontEx() {
		setTitle("Color, Font 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		
		MyPanel panel=new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		setSize(350, 450);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawString("I Love Java.~~", 30, 30);
			g.setColor(new Color(255, 0, 0)); // new Color(0x00ff0000) 와 동일 (red)
			g.setFont(new Font("Arial", Font.ITALIC, 30));
			g.drawString("How much?", 30, 60);
			g.setColor(new Color(0x00ff00ff)); // purple
			for(int i=1;i<5;i++) {
				g.setFont(new Font("Dialog", Font.ITALIC, i*10));
				g.drawString("This much!!", 30, 60+i*60);
			}
		}
	}
	public static void main(String[] args) {
		new GraphicsColorFontEx();
	}

}
