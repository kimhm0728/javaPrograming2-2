package week13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test4 extends JFrame implements ActionListener {
	String [] s= {"10진수", "2진수", "8진수", "16진수"};
	JTextField src=new JTextField(8);
	JTextField dest=new JTextField(8);
	JComboBox cb1=new JComboBox(s);
	JComboBox cb2=new JComboBox(s);
	
	int n, sign=1;
	Test4() {
		setTitle("진법 변환 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,3));
		
		dest.setEditable(false);
		cb1.addActionListener(this);
		cb2.addActionListener(this);
		
		add(cb1);
		add(new JLabel("        =>"));
		add(cb2);
		add(src);
		add(new JLabel("   "));
		add(dest);
		
		setSize(400, 150);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb1) {
			String s1=cb1.getSelectedItem().toString();
			switch(s1) {
			case "10진수":
				n=Integer.parseInt(src.getText());
				break;
			case "2진수":
				n=Integer.parseInt(src.getText(), 2);
				break;
			case "8진수":
				n=Integer.parseInt(src.getText(), 8);
				break;
			case "16진수":
				n=Integer.parseInt(src.getText(), 16);
				break;
			}
			System.out.println(n);
			if(n<0) {
				sign=-1;
				n*=sign;
			}
		}
		else if(e.getSource()==cb2) {
			String s2=cb2.getSelectedItem().toString();
			switch(s2) {
			case "10진수":
				if(sign<0) dest.setText("-"+Integer.toString(n));
				else dest.setText(Integer.toString(n));
				break;
			case "2진수":
				if(sign<0) dest.setText("-"+Integer.toBinaryString(n));
				else dest.setText(Integer.toBinaryString(n));
				break;
			case "8진수":
				if(sign<0) dest.setText("-"+Integer.toOctalString(n));
				else dest.setText(Integer.toOctalString(n));
				break;
			case "16진수":
				if(sign<0) dest.setText("-"+Integer.toHexString(n));
				else dest.setText(Integer.toHexString(n));
				break;
			}
		}
	}
	public static void main(String[] args) {
		new Test4();
	}
}
