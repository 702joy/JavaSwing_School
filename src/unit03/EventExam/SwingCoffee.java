package EventExam;

import javax.swing.*;

public class SwingCoffee extends JFrame{
	public SwingCoffee() {
		JPanel p = new JPanel();
		add(p);
		
		
		setTitle("Ŀ���ֹ�");
		setSize(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new SwingCoffee();
	}

}
