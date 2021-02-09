package week12;
import javax.swing.*;
import java.awt.*;

public class TextFieldEx extends JFrame {
	private static final long serialVersionUID = 1L;
	TextFieldEx() {
		setTitle("텍스트 필드 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		add(new JLabel("이름 : "));
		add(new JTextField(10));
		add(new JLabel("학과 : "));
		add(new JTextField("컴퓨터 공학과"));
		add(new JLabel("주소 : "));
		add(new JTextField("아산시 ...",20));
		
		add(new JLabel("id : "));
		add(new JTextField(10));
		add(new JLabel("password : "));
		add(new JPasswordField(10));
		
		setSize(530, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextFieldEx();
	}

}
