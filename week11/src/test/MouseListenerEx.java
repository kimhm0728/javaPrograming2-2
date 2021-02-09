package test;
import javax.swing.*;
import java.awt.event.*;

public class MouseListenerEx extends JFrame {
	private static final long serialVersionUID = 1L;
	JLabel la;
	MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contentPane=new JPanel();
		setContentPane(contentPane);
		setLayout(null);
		contentPane.addMouseListener(new MyMouseListener());
		
		la=new JLabel("hello");
		la.setSize(50, 20);
		la.setLocation(30, 30);
		contentPane.add(la);
		
		setSize(200, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseListenerEx();
	}
	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
			int x=e.getX();
			int y=e.getY();
			la.setLocation(x, y);
			int cnt=e.getClickCount(); // 연속으로 클릭한 경우에만 카운트 됨. 그냥 클릭 시 다시 1으로 리셋
			la.setText("hello"+cnt);
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
}
