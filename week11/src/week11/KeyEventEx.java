package week11;
import javax.swing.*;
import java.awt.event.*;

public class KeyEventEx extends JFrame {
	private static final long serialVersionUID = 1L;
	JPanel contentPane=new JPanel();
	JLabel la=new JLabel("X");
	final int UNIT=10;
	
	KeyEventEx() {
		setTitle("KeyEvent Å×½ºÆ®");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		contentPane.addKeyListener(new MyKeyListener());
		
		la.setLocation(300, 200);
		la.setSize(100,20);
		contentPane.add(la);
		
		setSize(600, 500);
		setVisible(true);
		contentPane.requestFocus();
	}
	public static void main(String[] args) {
		new KeyEventEx();
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode=e.getKeyCode();
			switch(keyCode) {
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY()-UNIT);
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY()+UNIT);
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX()-UNIT, la.getY());
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX()+UNIT, la.getY());
				break;
			}
		}
	}
}
