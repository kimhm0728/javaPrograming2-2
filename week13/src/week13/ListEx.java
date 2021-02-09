package week13;
import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame {
	private static final long serialVersionUID = 1L;
	Container contentPane;
	String [] fruits= {"apple", "banana", "kiwi", "mango",
			"pear", "berry", "stawberry", "blackberry"};
	ImageIcon [] images= {new ImageIcon("images/icon1.png"),
			new ImageIcon("images/icon2.png"),
			new ImageIcon("images/icon3.png"),
			new ImageIcon("images/icon4.png")
			};
	ListEx() {
		setTitle("����Ʈ ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JList strList=new JList(fruits);
		contentPane.add(strList);
		
		JList imageList=new JList();
		imageList.setListData(images);
		contentPane.add(imageList);
		
		JList scrollList=new JList(fruits);
		contentPane.add(new JScrollPane(scrollList));
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListEx();
	}

}
