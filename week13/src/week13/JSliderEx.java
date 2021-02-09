package week13;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class JSliderEx extends JFrame {
	private static final long serialVersionUID = 1L;
	JSlider red=new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JSlider green=new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JSlider blue=new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JLabel rgb=new JLabel("RGB(0,0,0)", JLabel.CENTER);
	
	JPanel p1=new JPanel(new BorderLayout());
	JPanel west=new JPanel(new GridLayout(0,1));
	JPanel cen=new JPanel(new GridLayout(0,1));
	JPanel p2=new JPanel();
	
	int r,g,b;
	JSliderEx() {
		super("JSlider 테스트"); // setTitle()
		
		red.setMajorTickSpacing(50); // 큰 눈금 간격
		red.setMinorTickSpacing(5); // 작은 눈금 간격
		red.setPaintTicks(true); // 눈금 보이게
		red.setPaintLabels(true); // 숫자 보이게
		
		green.setMajorTickSpacing(50); 
		green.setMinorTickSpacing(5); 
		green.setPaintTicks(true); 
		green.setPaintLabels(true); 
		
		blue.setMajorTickSpacing(50); 
		blue.setMinorTickSpacing(5); 
		blue.setPaintTicks(true);
		blue.setPaintLabels(true);
		
		JLabel rlabel=new JLabel("RED");
		JLabel glabel=new JLabel("GREEN");
		JLabel blabel=new JLabel("BLUE");
		
		rlabel.setForeground(Color.red);
		glabel.setForeground(Color.green);
		blabel.setForeground(Color.blue);
		
		rgb.setFont(new Font("돋음체", Font.BOLD, 24));
		
		west.add(rlabel);
		west.add(glabel);
		west.add(blabel);
		cen.add(red);
		cen.add(green);
		cen.add(blue);
		
		p1.add("West", west);
		p1.add("Center", cen);
		
		add("North", rgb);
		add("South", p1);
		add("Center", p2);
		
		setBounds(300, 200, 400, 300);
		// x시작위치, y시작위치, 가로길이, 세로길이
		setVisible(true);
		
		red.addChangeListener(new Sevent());
		green.addChangeListener(new Sevent());
		blue.addChangeListener(new Sevent());
	}
	class Sevent implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			JSlider source=(JSlider)e.getSource();
			if(e.getSource()==red) {
				r=source.getValue();
			}
			if(e.getSource()==green) {
				g=source.getValue();
			}
			if(e.getSource()==blue) {
				b=source.getValue();
			}
			p2.setBackground(new Color(r, g, b));
			rgb.setText("RGB("+r+","+g+","+b+")");
		}
	}
	public static void main(String[] args) {
		new JSliderEx();
	}

}
