package week12;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Test5 extends JFrame implements ItemListener {
	private static final long serialVersionUID = 1L;
	JTextField tf1, tf2;
	JRadioButton []rb=new JRadioButton[4];
	String []str= {"10진수", "2진수", "8진수", "16진수"};
	Test5() {
		setTitle("진법 변환");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		tf1=new JTextField(12);
		tf2=new JTextField(12);
		tf2.setEnabled(false);
		add(tf1);
		add(new Label("==>"));
		add(tf2);
		
		ButtonGroup g=new ButtonGroup();
		for(int i=0;i<str.length;i++) {
			rb[i]=new JRadioButton(str[i]);
			g.add(rb[i]);
			add(rb[i]);
			rb[i].addItemListener(this);
		}
		setSize(300, 150);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent e) {
		int n=Integer.parseInt(tf1.getText());
		if(e.getItem()==rb[0]) 
			tf2.setText(tf1.getText());
		else if(e.getItem()==rb[1])
			tf2.setText(Integer.toBinaryString(n));
		else if(e.getItem()==rb[2])
			tf2.setText(Integer.toOctalString(n));
		else
			tf2.setText(Integer.toHexString(n));
	}
	public static void main(String[] args) {
		new Test5();
	}

}
