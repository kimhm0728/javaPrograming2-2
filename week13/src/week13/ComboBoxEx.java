package week13;
import javax.swing.*;
import java.awt.*;

public class ComboBoxEx extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container contentPane;
	String [] fruits= {"apple", "banana", "kiwi", "mango",
			"pear", "berry", "stawberry", "blackberry"};
	String [] names= {"kitae", "jaemoon", "hyosoo", "namyun"};
	ComboBoxEx() {
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JComboBox strCombo=new JComboBox(fruits);
		contentPane.add(strCombo);
		
		JComboBox nameCombo=new JComboBox();
		for(int i=0;i<names.length;i++)
			nameCombo.addItem(names[i]);
		// new JComboBox(names) 와 동일
		contentPane.add(nameCombo);
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ComboBoxEx();
	}

}
