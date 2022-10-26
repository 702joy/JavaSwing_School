package EventExam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleCalculator extends JFrame implements ActionListener {
	JButton[] btn = new JButton[16];
	String[] names = { "0", "1", "2", "3",
					   "4", "5", "6", "7",
					   "8", "9", "CE", "계산", 
					   "+", "-", "x", "/" };
	JLabel lb_Src = new JLabel("수식");
	JTextField tf_Src = new JTextField(8);
	JLabel lb_des = new JLabel("결과");
	JTextField tf_des = new JTextField(8);
	
	int index = 0;
	char operator = ' ';

	SimpleCalculator() {
		JPanel p = new JPanel();
		JPanel p2 = new JPanel(new GridLayout(0, 4, 5, 5));
		add(p, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		p.setBackground(Color.GRAY);
		p.add(lb_Src);
		p.add(tf_Src);
		p.add(lb_des);
		p.add(tf_des);
		

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(names[i]);
			p2.add(btn[i]);
			btn[i].addActionListener(this);
		}
		setSize(350, 300);
		setTitle("간단한 계산기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		tf_Src.setText("");
		tf_des.setText("");
	}

	public static void main(String[] args) {
		new SimpleCalculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "CE") {
			tf_Src.setText("");
			tf_des.setText("");
		} else if (e.getActionCommand() == "계산") {
			String str = tf_Src.getText();
			char ch;
			for (int i = 0;i<str.length();i++) {
				ch = str.charAt(i);
				if(ch == '+' || ch =='-' || ch =='x' || ch =='/') {
					index = i;
					operator = ch;
				}
			}
			
			switch(operator) {
			
			case'+': 
				tf_des.setText((Integer.parseInt(str.substring(0, index))+Integer.parseInt(str.substring(index+1)))+"");
				break;
			case'-': 
				tf_des.setText((Integer.parseInt(str.substring(0, index))-Integer.parseInt(str.substring(index+1)))+"");
				break;
			case'x': 
				tf_des.setText((Integer.parseInt(str.substring(0, index))*Integer.parseInt(str.substring(index+1)))+"");
				break;
			case'/': 
				tf_des.setText((Integer.parseInt(str.substring(0, index))/Integer.parseInt(str.substring(index+1)))+"");
				break;
			}
			
			
			
		} else {
			tf_Src.setText(tf_Src.getText() + e.getActionCommand());
		}
	}
}
