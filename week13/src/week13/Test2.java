package week13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test2 extends JFrame {
	ImageIcon [] images= {new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/banana.jpg"),
			new ImageIcon("images/kiwi.jpg"),
			new ImageIcon("images/mango.jpg"),
			new ImageIcon("images/error.jpg")};
	Test2() {
		setTitle("콤보박스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JTextField tf=new JTextField(13);
		JComboBox cb=new JComboBox();
		JLabel imgLabel=new JLabel();
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=e.getActionCommand();
				cb.addItem(str);
			}
		});
		cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb=(JComboBox)e.getSource();
				String str=cb.getSelectedItem().toString();
				if(str.equals("사과"))
					imgLabel.setIcon(images[0]);
				else if(str.equals("바나나"))
					imgLabel.setIcon(images[1]);
				else if(str.equals("키위"))
					imgLabel.setIcon(images[2]);
				else if(str.equals("망고"))
					imgLabel.setIcon(images[3]);
				else 				
					imgLabel.setIcon(images[4]);
			}
		});
		add(tf);
		add(cb);
		add(imgLabel);
		
		setSize(250,250);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test2();
	}
}
