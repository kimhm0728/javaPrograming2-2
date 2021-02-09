package week11;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Test6 extends JFrame {
	private static final long serialVersionUID = 1L;
	JPanel pnl=new JPanel();
	JLabel la=new JLabel("Hello");
	JLabel lb=new JLabel("x,y");
	final int UNIT=10;
	
	Test6() {
		setTitle("KeyEvent Å×½ºÆ®");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(pnl, BorderLayout.CENTER);
		add(lb, BorderLayout.SOUTH);
		pnl.setLayout(null);
		pnl.addKeyListener(new MyKeyListener());
		pnl.addMouseMotionListener(new MyMouseMotionListener());
		la.setLocation(250,150);
		la.setSize(100,100);
		la.setForeground(Color.RED);
		la.setFont(new Font("Serif",Font.BOLD,25));
		
		pnl.add(la);
		setSize(600,500);
		setVisible(true);
		pnl.requestFocus();
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			lb.setText(la.getX()+","+la.getY());
			int keyCode=e.getKeyCode();
			if(e.isShiftDown())
				labelMove(keyCode, UNIT*2);
			else if(e.isAltDown())
				labelMove(keyCode, UNIT*3);
			else 
				labelMove(keyCode, UNIT);
		}
		private void labelMove(int code, int size) {
			switch(code) {
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY()-size);
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY()+size);
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX()-size, la.getY());
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX()+size, la.getY());
				break;
			}
		}
	}
	class MyMouseMotionListener extends MouseMotionAdapter {
		public void mouseDragged(MouseEvent e) {
			lb.setText(la.getX()+","+la.getY());
			la.setLocation(e.getPoint());
		}
	}
	public static void main(String[] args) {
		new Test6();
	}
}
