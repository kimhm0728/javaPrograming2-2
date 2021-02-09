package week12;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class TextAreaEx extends JFrame {
	private static final long serialVersionUID = 1L;
	Container contentPane;
	TextAreaEx() {
		setTitle("텍스트 영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		contentPane.add(new MyCenterPanel(), BorderLayout.CENTER);
		
		setSize(260, 300);
		setVisible(true);
	}
	class MyCenterPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		JTextField tf;
		JButton btn;
		JTextArea ta;
		MyCenterPanel() {
			tf=new JTextField(20);
			btn=new JButton("추가");
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ta.append("\n"+tf.getText());
				}
			});
			ta=new JTextArea("hello", 7, 20); // 20글자씩 7줄
			add(new JLabel("아래 창에 문자열을 입력하고 버튼을 클릭하세요"));
			add(tf);
			add(btn);
			add(new JScrollPane(ta));
		}
	}
	public static void main(String[] args) {
		new TextAreaEx();
	}

}
