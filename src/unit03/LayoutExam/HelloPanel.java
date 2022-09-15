package unit03.LayoutExam;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloPanel extends JFrame {

	HelloPanel() {
		JPanel p = new JPanel();
		p.setBackground(Color.ORANGE);
		add(p);
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		btn1.setBackground(Color.yellow);
		btn2.setBackground(Color.pink);
		p.add(btn1);
		p.add(btn2);
		
		setTitle("안녕 패널");
		setSize(300,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new HelloPanel();

	}

}
