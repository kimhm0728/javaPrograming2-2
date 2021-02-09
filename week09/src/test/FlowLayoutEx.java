package test;
import java.awt.*;
import javax.swing.*;

public class FlowLayoutEx extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	FlowLayoutEx() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); // 왼쪽부터 채워짐
//		setLayout(new FlowLayout()); // 디폴트 값이 센터. 버튼이 센터부터 채워짐
		add(new JButton("add"));
		add(new JButton("sub"));
		add(new JButton("mul"));
		add(new JButton("div"));
		add(new JButton("Calculate"));
		
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.ORANGE); // 컨텐트팬이 아닌 프레임에는 적용 x
		
		// 프레임에 컴포넌트 추가 후, 컨텐트팬 생성 가능.
		
		setSize(300,250);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlowLayoutEx();
	}

}
