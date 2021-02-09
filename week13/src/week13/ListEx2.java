package week13;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class ListEx2 extends JFrame implements ListSelectionListener {
	private static final long serialVersionUID = 1L;
	Container contentPane;
	String [] fruits= {"apple", "banana", "kiwi", "mango",
			"pear", "berry", "stawberry", "blackberry"};
	ImageIcon [] images= {new ImageIcon("images/icon1.png"),
			new ImageIcon("images/icon2.png"),
			new ImageIcon("images/icon3.png"),
			new ImageIcon("images/icon4.png")
			};
	JList<String> strList;
	JList<ImageIcon> imageList;
	ListEx2() {
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		strList=new JList<String>(fruits);
		contentPane.add(strList);
		strList.addListSelectionListener(this);
		
		imageList=new JList<ImageIcon>();
		imageList.setListData(images);
		contentPane.add(imageList);
		imageList.addListSelectionListener(this);
		
		JList <String>scrollList=new JList<String>(fruits);
		contentPane.add(new JScrollPane(scrollList));
		
		setSize(300, 300);
		setVisible(true);
	}
	public void valueChanged(ListSelectionEvent e) {
		if(!e.getValueIsAdjusting()) { // 이 부분 적지 않으면 버튼 눌렀다 뗄 때 연속으로 이벤트 처리
			if(e.getSource()==strList) {
				String ss=(String)strList.getSelectedValue();
				System.out.println("1st = "+ss);
			}
			else if(e.getSource()==imageList) {
				ImageIcon s1=(ImageIcon)imageList.getSelectedValue();
				System.out.println("2nd = "+s1);
			}
			System.out.println(e.getLastIndex());
		}
	}
	public static void main(String[] args) {
		new ListEx2();
	}

}
