package week13;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Test3 extends JFrame {
	private static final long serialVersionUID = 1L;
	Test3() {
		setTitle("슬라이더 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JSlider slider=new JSlider(JSlider.HORIZONTAL, 0, 100, 50);	
	
		slider.setMajorTickSpacing(20); 
		slider.setMinorTickSpacing(5); 
		slider.setPaintTicks(true); 
		slider.setPaintLabels(true);
		
		JLabel label=new JLabel("    I Love Java    ");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setForeground(Color.orange);
		label.setFont(new Font("TimesRoman", Font.PLAIN, 50));
		
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				JSlider s=(JSlider)e.getSource();
				int size=s.getValue();
				if(size>80)
					label.setFont(new Font("TimesRoman", Font.PLAIN, 80));
				else if(size<20)
					label.setFont(new Font("TimesRoman", Font.PLAIN, 20));
				else
					label.setFont(new Font("TimesRoman", Font.PLAIN, size));
			}
		});
		
		add(slider, BorderLayout.NORTH);
		add(label, BorderLayout.CENTER);
		
		setSize(600, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test3();
	}
}
