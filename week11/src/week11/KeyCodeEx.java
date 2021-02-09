package week11;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx extends JFrame {
	private static final long serialVersionUID = 1L;
	JPanel contentPane=new JPanel();
	JLabel la=new JLabel();
	
	KeyCodeEx() {
		setTitle("Key Code 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.addKeyListener(new MyKeyListener());
		contentPane.add(la);
		setSize(300, 150);
		setVisible(true);
		contentPane.requestFocus();
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) { // 키를 눌렀을 때
			int code=e.getKeyCode();
			String str=KeyEvent.getKeyText(code);
			la.setText(str);
			if(e.getKeyChar()=='%') // unicode 값으로 비교
				contentPane.setBackground(Color.YELLOW);
			else if(e.getKeyCode()==KeyEvent.VK_F1) { // key code로 비교
				if(e.isShiftDown()) // shift가 함께 눌렸는지
					contentPane.setBackground(Color.pink);
				else
					contentPane.setBackground(Color.GREEN);
			}
		}
	}
	public static void main(String[] args) {
		new KeyCodeEx();
	}

}