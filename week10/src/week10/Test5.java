package week10;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Test5 extends JFrame {
	private static final long serialVersionUID = 1L;
	JLabel l1=new JLabel("거리를 입력하시오");
	JLabel l2=new JLabel("마일->미터로 변환 버튼");
	JLabel l3=new JLabel("미터->마일로 변환 버튼");
	JTextField tf1=new JTextField(5);
	JButton b1=new JButton("변환1");
	JButton b2=new JButton("변환2");
	JButton b3=new JButton("종료");
	JTextField tf2=new JTextField(25);
	Test5() {
		setTitle("마일 킬로미터 변환");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4,1));
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		
		MyActionListener5 listener=new MyActionListener5();
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		
		p1.add(l1);
		p1.add(tf1);
		p2.add(l2);
		p2.add(b1);
		p3.add(l3);
		p3.add(b2);
		p4.add(tf2);
		p4.add(b3);
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		setSize(350, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test5();
	}
	class MyActionListener5 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b=(JButton)e.getSource();
			if(b.getText().equals("변환1")) {
				String s=tf1.getText();
				double result=(Double.parseDouble(s))*1.609344;
				result=Math.round(result*100)/100.0;
				tf2.setText(s+" 마일은 "+result+" 킬로미터입니다.");
			}
			else if(b.getText().equals("변환2")) {
				String s=tf1.getText();
				double result=(Double.parseDouble(s))/1.609344;
				result=Math.round(result*100)/100.0;
				tf2.setText(s+" 킬로미터는 "+result+" 마일입니다.");
			}
			else if(b.getText().equals("종료"))
				System.exit(0);
		}
	}
}
