package week14;

import javax.swing.*;
import java.awt.*;
import java.util.*; // Vector Ŭ���� ���
import java.awt.event.*;

public class GraphicsDrawLineMouseEx extends JFrame {
	private static final long serialVersionUID = 1L;
	Container contentPane;
	GraphicsDrawLineMouseEx() {
		setTitle("Drawing Line by Mouse ��� ����");
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
					ve.add(endP); // ���Ϳ� �߰����� ������ ���� ������ ������ �׸� �͵��� �����
					repaint(); // paint �Լ� ȣ��
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			for(int i=0;i<vs.size();i++) {
				Point s=vs.elementAt(i); 
				Point e=ve.elementAt(i);
				// ������ ���� �͵��� �����Ǿ� �׷����� �� x. �� �� ���� ������ vs�� ve�� �ִ� ������ ó������ ���� �׸�
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawLineMouseEx();
	}

}
