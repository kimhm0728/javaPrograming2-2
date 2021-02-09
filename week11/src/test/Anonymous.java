package test;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Anonymous extends JFrame {
	private static final long serialVersionUID = 1L;
	Anonymous() {
		setTitle("Action 이벤트");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton jb=new JButton("Action");
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b=(JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
			}
		});
		
		add(jb);
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Anonymous();
	}
}