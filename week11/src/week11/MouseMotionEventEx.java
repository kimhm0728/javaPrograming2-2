package week11;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseMotionEventEx extends JFrame implements ActionListener, MouseMotionListener {
	private static final long serialVersionUID = 1L;
	JLabel move=new JLabel("���콺 ���� �ٴϱ�", JLabel.CENTER);
	JButton exit=new JButton("����");
	
	MouseMotionEventEx() {
		setTitle("MouseMotionEvent �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		move.setOpaque(true); // ���̺��� ���� ������ ���̺��� ���������� �����ؾ���
		move.setBackground(Color.green);
		move.setLocation(250,150);
		move.setSize(120,30);
		
		exit.setLocation(200, 500);
		exit.setSize(80, 30);
		
		add(move);
		add(exit);
		
		setSize(500, 600);
		setVisible(true);
		
		exit.addActionListener(this);
		addMouseMotionListener(this);
	}
	public static void main(String[] args) {
		new MouseMotionEventEx();
	}
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	public void mouseMoved(MouseEvent e) {
		Point p=e.getPoint();
		move.setLocation(p);
	}
	public void mouseDragged(MouseEvent e) {}
}
