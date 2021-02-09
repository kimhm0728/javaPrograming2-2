package week09;
import java.awt.*;

class FirstPanel extends Panel {
	private static final long serialVersionUID = 1L;
	FirstPanel() {
		setBackground(Color.GRAY);
		setLayout(new GridLayout(3,1));
		add(new Button("Open"));
		add(new Button("Read"));
		add(new Button("Close"));
	}
}
class SecondPanel extends Panel {
	private static final long serialVersionUID = 1L;
	SecondPanel() {
		setLayout(new BorderLayout());
		add(new Label("Java",Label.CENTER), BorderLayout.CENTER);
	}
}
public class Test10 extends Frame {
	private static final long serialVersionUID = 1L;
	Test10() {
		setTitle("실습 예제"); 
		setLayout(new GridLayout(1, 2));
		add(new FirstPanel());
		add(new SecondPanel());
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test10();
	}
}
