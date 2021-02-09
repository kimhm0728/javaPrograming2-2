package week12;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxItemEventEx extends JFrame {
	private static final long serialVersionUID = 1L;
	Container contentPane;
	JCheckBox []fruits=new JCheckBox [3];
	String [] names= {"사과", "배", "체리"};
	JLabel sumLabel;
	int sum=0;
	CheckBoxItemEventEx() {
		setTitle("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());

		contentPane.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		for(int i=0;i<fruits.length;i++) {
			fruits[i]=new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			contentPane.add(fruits[i]);
			fruits[i].addItemListener(new MyItemListener());
		}
		sumLabel=new JLabel("현재 0원 입니다.");
		contentPane.add(sumLabel);
		setSize(250,200);
		setVisible(true);
	}
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			int selected=1;
			if(e.getStateChange()==ItemEvent.SELECTED) // 선택 됐을 때
				selected=1;
			else // 선택되지 않았을 때
				selected=-1;
			if(e.getItem()==fruits[0])
				sum+=selected*100;
			else if(e.getItem()==fruits[1])
				sum+=selected*500;
			else
				sum+=selected*20000;
			sumLabel.setText("현재 "+sum+"원 입니다.");
		}
	}
	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}

}
