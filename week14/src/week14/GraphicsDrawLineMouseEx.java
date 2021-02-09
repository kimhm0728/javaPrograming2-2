package week14;

import javax.swing.*;
import java.awt.*;
import java.util.*; // Vector 클래스 사용
import java.awt.event.*;

public class GraphicsDrawLineMouseEx extends JFrame {
	private static final long serialVersionUID = 1L;
	Container contentPane;
	GraphicsDrawLineMouseEx() {
		setTitle("Drawing Line by Mouse 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		
		MyPanel panel=new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		setSize(350, 300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		Vector<Point> vs=new Vector<Point>();
		Vector<Point> ve=new Vector<Point>();

		Point startP=null;
		Point endP=null;

		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					startP=e.getPoint();
				}
				public void mouseReleased(MouseEvent e) {
					endP=e.getPoint();
					vs.add(startP);
					ve.add(endP); // 벡터에 추가하지 않으면 누를 때마다 이전에 그린 것들이 사라짐
					repaint(); // paint 함수 호출
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			for(int i=0;i<vs.size();i++) {
				Point s=vs.elementAt(i); 
				Point e=ve.elementAt(i);
				// 예전에 누른 것들이 누적되어 그려지는 것 x. 한 번 누를 때마다 vs와 ve에 있는 값들을 처음부터 새로 그림
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawLineMouseEx();
	}

}
