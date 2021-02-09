package week10;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Test7 extends JFrame {
	private static final long serialVersionUID = 1L;
	JLabel l1=new JLabel("Ű��?");
	JLabel l2=new JLabel("cm");
	JLabel l3=new JLabel("ü����?");
	JLabel l4=new JLabel("kg");
	JLabel l5=new JLabel("��� ���");
	JTextField f1=new JTextField(10);
	JTextField f2=new JTextField(10);
	JButton b=new JButton("ü�� ���");
	Test7() {
		setTitle("ü�� ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1=new JPanel(new GridLayout(2,3));
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		p1.add(l1);
		p1.add(f1);
		p1.add(l2);
		p1.add(l3);
		p1.add(f2);
		p1.add(l4);
		p2.add(b);
		p3.add(l5);

		MyActionListener7 listener=new MyActionListener7();
		b.addActionListener(listener);
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test7();
	}
	class MyActionListener7 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b) {
				int cm=Integer.parseInt(f1.getText());
				int kg=Integer.parseInt(f2.getText());
				int normal=(int)((cm-100)*0.9);
				l5.setOpaque(true); // ���̺� ��׶��� ���� �� �ۼ�
				if(normal==kg) {
					l5.setBackground(Color.GREEN);
					l5.setText("ǥ��ü���Դϴ�.");
				}
				else if(normal>kg) {
					l5.setBackground(Color.YELLOW);
					l5.setText("��ü���Դϴ�.");
				}
				else if(normal<kg) {
					l5.setBackground(Color.RED);
					l5.setText("��ü���Դϴ�.");
				}
			}
		}
	}
}
