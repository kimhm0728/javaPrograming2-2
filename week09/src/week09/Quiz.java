package week09;
import java.awt.*;

public class Quiz {
	public static void main(String[] args) {
		Container c=new Container();
		c.setLayout(new BorderLayout(5, 10));
		c.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 10));
		c.setLayout(new GridLayout(5, 2, 5, 10));
		c.setLayout(null);
	}
}
