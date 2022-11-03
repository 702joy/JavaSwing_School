package EventExam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Swingjumin extends JFrame implements KeyListener, ActionListener {

	JPanel p = new JPanel();
	JLabel lb = new JLabel("-");
	JTextField tf1 = new JTextField(10);
	JTextField tf2 = new JTextField(10);
	JButton btn = new JButton("버튼");

	Swingjumin() {

		add(p);
		p.add(tf1);
		p.add(lb);
		p.add(tf2);
		p.add(btn);
		//p.addKeyListener(this);

		tf1.addKeyListener(this);
		tf2.addKeyListener(this);
		btn.addActionListener(this);

		setSize(400, 100);
		setTitle("주민등록 분석");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new Swingjumin();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String ye="";
		if (tf2.getText().substring(0,1).equals("1") || tf2.getText().substring(0,1).equals("2") || tf2.getText().substring(0,1).equals("5") || tf2.getText().substring(0,1).equals("6")) {
			ye = "19";
		}else if (tf2.getText().substring(0,1).equals("3") || tf2.getText().substring(0,1).equals("4") || tf2.getText().substring(0,1).equals("7") || tf2.getText().substring(0,1).equals("8")){		
			ye = "20";
		}
		String ar = tf1.getText().substring(0,2);
		String month = tf1.getText().substring(2,4);
		String day = tf1.getText().substring(4,6);
		
		if (e.getActionCommand() == "버튼") {
			JOptionPane.showMessageDialog(null, "당신의 생일은 " +	ye + ar + "년 " + month + "월 " + day + "일입니다");
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource() == tf2 && e.getKeyCode() == KeyEvent.VK_ENTER)
			btn.doClick();
	}
	@Override
	public void keyReleased(KeyEvent e) {
		if (tf1.getText().length()==6) {
			tf2.requestFocus();
		}
	}

}
