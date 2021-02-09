package week10;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Test6 extends JFrame {
	private static final long serialVersionUID = 1L;
	JLabel l1=new JLabel("첫 번째 수 : ");
	JLabel l2=new JLabel("두 번째 수 : ");
	JLabel l3=new JLabel("연산식 : ");
	JLabel l4=new JLabel("수식 결과 : ");
	JButton b[]=new JButton[4];
	String s[]= {"+","-","*","/"};
	JTextField f1=new JTextField(10);
	JTextField f2=new JTextField(10);
	JTextField f3=new JTextField(20);
	Test6() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel(new GridLayout(1,5));
		JPanel p4=new JPanel();
		JPanel p5=new JPanel(new GridLayout(2,1));
		JPanel p6=new JPanel(new GridLayout(2,1));
		
		p1.add(l1);
		p1.add(f1);
		p2.add(l2);
		p2.add(f2);
		p3.add(l3);
		MyActionListener6 listener=new MyActionListener6();
		for(int i=0;i<s.length;i++) {
			b[i]=new JButton(s[i]);
			b[i].addActionListener(listener);
			p3.add(b[i]);
		}
		p4.add(l4);
		p4.add(f3);
		p5.add(p1);
		p5.add(p2);
		p6.add(p3);
		p6.add(p4);
		add(p5, BorderLayout.NORTH);
		add(p6, BorderLayout.SOUTH);
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test6();
	}
	class MyActionListener6 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int num1=Integer.parseInt(f1.getText());
			int num2=Integer.parseInt(f2.getText());
			int result=0;
			JButton b=(JButton)e.getSource();
			String s=b.getText();
			if(s.equals("+"))
				result=num1+num2;
			else if(s.equals("-"))
				result=num1-num2;
			else if(s.equals("*"))
				result=num1*num2;
			else if(s.equals("/"))
				result=num1/num2;
			f3.setText(num1+" "+s+" "+num2+" = "+result);
		}
	}
}
