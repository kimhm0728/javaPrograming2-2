package test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JButtonEx1 extends JFrame {
	private static final long serialVersionUID = 1L;
	JButton bt[]=new JButton[5];
	String str[]= {"인문대학", "사회대학", "공과대학", "자연대학", "예체능대학"};
	
	JLabel jl=new JLabel("이곳에 출력됨");
	JButtonEx1() {
		setTitle("버튼이벤트");
		setLayout(new GridLayout(2,1,10,50));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		
		jp1.setLayout(new GridLayout(3,2,5,5));
		jp2.add(jl);
		MyActionListener1 listener=new MyActionListener1(); // 리스너 객체 생성
		
		for(int i=0;i<str.length;i++) {
			bt[i]=new JButton(str[i]);
			bt[i].addActionListener(listener); // 각 버튼에 이벤트 리스너를 연결
			jp1.add(bt[i]);
		}
		add(jp1);
		add(jp2);
		setSize(300,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JButtonEx1();
	}
	class MyActionListener1 implements ActionListener {
		public void actionPerformed(ActionEvent e) { // 액션 이벤트를 처리하는 메소드
			String cmd=e.getActionCommand(); // 버튼에 있는 값 받아옴
			Font f=new Font("TimesRoman", Font.ITALIC, 30);
			jl.setForeground(Color.RED);
			jl.setFont(f); // 39~41 - 폰트 설정
			jl.setText(cmd+" 버튼 선택"); // 레이블 값 변경
		}
	}

}
