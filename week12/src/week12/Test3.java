package week12;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Test3 extends JFrame implements ActionListener, ItemListener {
	private static final long serialVersionUID = 1L;
	JTextField tf;
	JLabel []money=new JLabel[8];
	int []num= {50000, 10000, 1000, 500, 100, 50, 10, 1};
	String []string= {"������", "����", "õ��", "500��", "100��", "50��", "10��", "1��"};
	JTextField []field=new JTextField[8];
	JCheckBox [] cb=new JCheckBox[7];
	int []num2= {0, 0, 0, 0, 0, 0, 0, 1};
	Test3() {
		setTitle("ȭ�� ��ȯ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p1=new JPanel(new GridLayout(1,3));
		p1.setBackground(Color.CYAN);
		p1.add(new JLabel("�ݾ�"));
		tf=new JTextField(10);
		JButton calculate=new JButton("���");
		calculate.addActionListener(this);
		p1.add(tf);
		p1.add(calculate);
		
		JPanel p2=new JPanel(new GridLayout(8,3));
		p2.setBackground(Color.CYAN);
		for(int i=0;i<7;i++) {
			money[i]=new JLabel(string[i]);
			p2.add(money[i]);
			field[i]=new JTextField(7);
			p2.add(field[i]);
			cb[i]=new JCheckBox();
			cb[i].setBackground(Color.CYAN);
			p2.add(cb[i]);
			cb[i].addItemListener(this);
		}
		money[7]=new JLabel(string[7]);
		p2.add(money[7]);
		field[7]=new JTextField(7);
		p2.add(field[7]);
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		int n=Integer.parseInt(tf.getText());
		int value;
		for(int i=0;i<num2.length;i++) {
			if(num2[i]==0)
				field[i].setText("0");
			else {
				value=n/num2[i];
				field[i].setText(Integer.toString(value));
				n%=num2[i];
			}
		}
	}
	public void itemStateChanged(ItemEvent e) {
		if(e.getItem()==cb[0])
			num2[0]=num[0];
		else if(e.getItem()==cb[1])
			num2[1]=num[1];
		else if(e.getItem()==cb[2])
			num2[2]=num[2];
		else if(e.getItem()==cb[3])
			num2[3]=num[3];
		else if(e.getItem()==cb[4])
			num2[4]=num[4];
		else if(e.getItem()==cb[5])
			num2[5]=num[5];
		else if(e.getItem()==cb[6])
			num2[6]=num[6];
	}
	public static void main(String[] args) {
		new Test3();
	}

}