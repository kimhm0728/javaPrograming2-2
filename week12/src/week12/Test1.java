package week12;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Test1 extends JFrame {
	private static final long serialVersionUID = 1L;
	Container contentPane;
	JCheckBox b1, b2;
	JButton btn;
	Test1() {
		setTitle("ChechBox Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		b1=new JCheckBox("버튼 비활성화");
		b1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.DESELECTED)
					btn.setEnabled(true);
				else
					btn.setEnabled(false);
			}
		});
		contentPane.add(b1);
		
		b2=new JCheckBox("버튼 감추기");
		b2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.DESELECTED)
					btn.setVisible(true);
				else
					btn.setVisible(false);
			}
		});
		contentPane.add(b2);
		
		btn=new JButton("test button");
		contentPane.add(btn);
		
		setSize(250, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test1();
	}

}
