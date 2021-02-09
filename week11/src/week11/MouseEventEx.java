package week11;
import javax.swing.*;
import java.awt.event.*;

public class MouseEventEx extends JFrame implements ActionListener, MouseListener {
	private static final long serialVersionUID = 1L;
	JPanel p=new JPanel();
	JButton test=new JButton("Test");
	JButton exit=new JButton("종료");
	JTextArea ta=new JTextArea();
	
	MouseEventEx() {
		setTitle("MouseEvent 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p.add(test);
		p.add(exit);
		
		ta.setEditable(false);
		
		add("South",p); // add(p, BorderLayout.SOUTH)
		add("Center",ta); 
		
		setSize(300, 300);
		setVisible(true);
		
		test.addMouseListener(this);
		exit.addMouseListener(this);
	}
	public static void main(String[] args) {
		new MouseEventEx();
	}
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	public void mouseEntered(MouseEvent e) {
		ta.append("Mouse Enter Event... \n");
	}
	public void mousePressed(MouseEvent e) {
		ta.append("Mouse Press Event... \n");
	}
	public void mouseReleased(MouseEvent e) {
		ta.append("Mouse Release Event... \n");
	}
	public void mouseClicked(MouseEvent e) {
		ta.append("Mouse Click Event... \n");
	}
	public void mouseExited(MouseEvent e) {
		ta.append("Mouse Exit Event... \n");
	}
}
