package week09;
import java.awt.*;

class NorthPanel1 extends Panel {
	private static final long serialVersionUID = 1L;
	NorthPanel1() {
		setBackground(Color.GRAY);
		add(new Button("Open"));
		add(new Button("Read"));
		add(new Button("Close"));
	}
}
class CenterPanel1 extends Panel {
	private static final long serialVersionUID = 1L;
	CenterPanel1() {
		add(new Label("Java"));
	}
}
public class Test8 extends Frame {
	private static final long serialVersionUID = 1L;
	Test8() {
		setTitle("응용문제 2"); // super("응용문제 2") 와 동일
		add(new NorthPanel1(), BorderLayout.NORTH);
		add(new CenterPanel1(), BorderLayout.CENTER);
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test8();
	}
}
