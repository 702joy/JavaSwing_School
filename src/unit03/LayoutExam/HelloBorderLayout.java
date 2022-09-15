package unit03.LayoutExam;

import java.awt.BorderLayout;

import javax.swing.*;

public class HelloBorderLayout extends JFrame {

	HelloBorderLayout() {

		JPanel p = new JPanel();
		add(p);

		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		p.setLayout(new BorderLayout());
		p.add(btn1, BorderLayout.NORTH);
		p.add(btn2, BorderLayout.WEST);
		p.add(btn3, BorderLayout.EAST);
		p.add(btn4, BorderLayout.SOUTH);
		p.add(btn5, BorderLayout.CENTER);

		setTitle("안녕 보더 레이아웃");
		setSize(500, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new HelloBorderLayout();
	}

}
