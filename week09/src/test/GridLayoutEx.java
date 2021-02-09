package test;
import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid=new GridLayout(4,2);
		grid.setVgap(5);
		setLayout(grid);

		add(new JLabel(": 이름"));
		add(new JTextField(""));
		add(new JLabel(": 학년"));
		add(new JTextField(""));
		add(new JLabel(": 학과"));
		add(new JTextField(""));
		add(new JLabel(": 과목"));
		add(new JTextField(""));
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
