package week12;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Test4 extends JFrame implements ItemListener {
	private static final long serialVersionUID = 1L;
	int sum=0;
	JCheckBox []cb=new JCheckBox[4];
	String []str= {"엔진오일 교환", "자동변속기 교환", "에어콘필터 교환", "타이어 교환"};
	JLabel lb;
	Test4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		for(int i=0;i<str.length;i++) {
			cb[i]=new JCheckBox(str[i]);
			add(cb[i]);
			cb[i].addItemListener(this);
		}
		lb=new JLabel("현재까지의 가격은 0원 입니다.");
		lb.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, 30));
		add(lb);
		setSize(500, 200);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent e) {
		int select=1;
		if(e.getStateChange()==ItemEvent.SELECTED)
			select=1;
		else
			select=-1;
		if(e.getItem()==cb[0])
			sum+=45000*select;
		else if(e.getItem()==cb[1])
			sum+=80000*select;
		else if(e.getItem()==cb[2])
			sum+=30000*select;
		else
			sum+=100000*select;
		if(sum>0)
			lb.setText("현재까지의 가격은 "+(sum/1000)+","+"000원 입니다.");
		else
			lb.setText("현재까지의 가격은 0원 입니다.");
	}
	public static void main(String[] args) {
		new Test4();
	}

}
