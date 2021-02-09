package week10;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Test4 extends JFrame {
	private static final long serialVersionUID = 1L;
	JLabel jl=new JLabel("거리를 마일 단위로 입력하시오");
	JTextField tf1=new JTextField(5);
	JButton b1=new JButton("변환");
	JButton b2=new JButton("종료");
	JTextField tf2=new JTextField(25);
	Test4() {
		setTitle("마일을 킬로미터로 변환");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		
		MyActionListener4 listener=new MyActionListener4();
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		tf1.setText("1");
		
		p1.add(jl);
		p1.add(tf1);
		p2.add(b1);
		p2.add(b2);
		p3.add(tf2);
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test4();
	}
	class MyActionListener4 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b=(JButton)e.getSource();
			if(b.getText().equals("변환")) {
				String s=tf1.getText();
				double result=(Double.parseDouble(s))*1.609344;
				result=Math.round(result*100)/100.0;
				tf2.setText(s+" 마일은 "+result+" 킬로미터입니다.");
			}
			else if(b.getText().equals("종료"))
				System.exit(0);
		}
	}
}
