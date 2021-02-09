package test;
import java.awt.*;
import javax.swing.*;

public class ContentPaneEx extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 시리얼 아이디 생성하지 않으면 warning 발생
	
	ContentPaneEx() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임의 x창을 누르면 프로그램 종료.
		// 주석 처리 시 창은 똑같이 닫히지만 프로그램이 계속 실행 중임
		
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout()); // 버튼을 수평 방향으로 연속해서 배치시킴
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(350,150); // 가로 세로
		setVisible(true);
	}
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
