package week12;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Test2 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JTextField tf;
	JLabel []money=new JLabel[8];
	int []num= {50000, 10000, 1000, 500, 100, 50, 10, 1};
	String []string= {"오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"};
	JTextField []field=new JTextField[8];
	Test2() {
		setTitle("화폐 교환");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p1=new JPanel(new GridLayout(1,3));
		p1.setBackground(Color.CYAN);
		p1.add(new JLabel("금액"));
		tf=new JTextField(10);
		JButton calculate=new JButton("계산");
		calculate.addActionListener(this);
		p1.add(tf);
		p1.add(calculate);

		JPanel p2=new JPanel(new GridLayout(8,2));
		p2.setBackground(Color.CYAN);
		for(int i=0;i<string.length;i++) {
			money[i]=new JLabel(string[i]);
			p2.add(money[i]);
			field[i]=new JTextField(7);
			p2.add(field[i]);
		}
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		int n=Integer.parseInt(tf.getText());
		int value;
		for(int i=0;i<num.length;i++) {
			value=n/num[i];
			field[i].setText(Integer.toString(value));
			n%=num[i];
		}
	}
	public static void main(String[] args) {
		new Test2();
	}

}
