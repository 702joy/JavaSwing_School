package unit03.EventExam;

import javax.swing.*;

public class LabelButtonEx extends JFrame{
	
	
	LabelButtonEx() {
		JPanel p = new JPanel();
		add(p);
		
		JLabel lb = new JLabel("제임스 고슬링 입니다");
		p.add(lb);
		
		ImageIcon img = new ImageIcon("img/gosling.jpg");
		JLabel lbImage = new JLabel(img);
		p.add(lbImage);
		
		ImageIcon normalIcon = new ImageIcon("img/noramalIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("img/pressedIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("img/rolloverIcon.gif");
		
		JButton btn = new JButton("call~",normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		p.add(btn);
		
		setTitle("라벨과 버튼 예제");
		setSize(300,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
			
		}
	public static void main(String[] args) {
		new LabelButtonEx();
		
	}

}
