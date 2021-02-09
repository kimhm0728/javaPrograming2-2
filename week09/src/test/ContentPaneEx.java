package test;
import java.awt.*;
import javax.swing.*;

public class ContentPaneEx extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// �ø��� ���̵� �������� ������ warning �߻�
	
	ContentPaneEx() {
		setTitle("ContentPane�� JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� xâ�� ������ ���α׷� ����.
		// �ּ� ó�� �� â�� �Ȱ��� �������� ���α׷��� ��� ���� ����
		
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout()); // ��ư�� ���� �������� �����ؼ� ��ġ��Ŵ
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(350,150); // ���� ����
		setVisible(true);
	}
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
