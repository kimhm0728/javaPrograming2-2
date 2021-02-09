package week13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test1 extends JFrame {
	Test1() {
		setTitle("콤보박스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JTextField tf=new JTextField(13);
		JComboBox cb=new JComboBox();
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=e.getActionCommand();
				cb.addItem(str); 
				// cb.addItem(tf.getText())와 동일
			}
		});
		add(tf);
		add(cb);
		
		setSize(250,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test1();
	}
}
