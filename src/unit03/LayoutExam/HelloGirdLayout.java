package unit03.LayoutExam;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class HelloGirdLayout extends JFrame {
	HelloGirdLayout() {
		
		JPanel p = new JPanel();
		add(p);
		
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư4");
		JButton btn5 = new JButton("��ư5");
		JButton btn6 = new JButton("��ư6");
		JButton btn7 = new JButton("��ư7");
		
		p.setLayout(new GridLayout(0, 2, 0, 0));
		//p.setLayout(new GridLayout(0, 3, 10, 10));
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		p.add(btn4);
		p.add(btn5);
		p.add(btn6);
		p.add(btn7);
		setTitle("�׸��� ���̾ƿ�");
		setSize(500,200);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new HelloGirdLayout();
	}

}
