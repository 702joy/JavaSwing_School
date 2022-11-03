package EventExam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class SwingGB extends JFrame implements KeyListener{
	
	JPanel p = new JPanel();
	JLabel lb1 = new JLabel("0", JLabel.CENTER);
	JLabel lb2 = new JLabel("0", JLabel.CENTER);
	JLabel lb3 = new JLabel("0", JLabel.CENTER);
	JLabel lb4 = new JLabel("시작합니다", JLabel.CENTER);
	
	SwingGB() {
		
		add(lb4, BorderLayout.SOUTH);
		
		add(p, BorderLayout.CENTER);
		p.setLayout(null);
		p.addKeyListener(this);
		
		p.add(lb1);
		p.add(lb2);
		p.add(lb3);
	
		
		lb1.setBounds(30,50,60,30);
		lb2.setBounds(110,50,60,30);
		lb3.setBounds(190,50,60,30);
		
		
		lb1.setOpaque(true);
		lb2.setOpaque(true);
		lb3.setOpaque(true);
		
		lb1.setBackground(Color.pink);
		lb2.setBackground(Color.pink);
		lb3.setBackground(Color.pink);

		
		setSize(300, 200);
		setTitle("겜블링 게임");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		p.setFocusable(true);
		p.requestFocus();
		
	}
	public static void main(String[] args) {
		new SwingGB();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyChar()) {
		case '\n':
			int A = (int)(Math.random() * 4); 
			int B = (int)(Math.random() * 4);
			int C = (int)(Math.random() * 4);
			lb1.setText(""+A);
			lb2.setText(""+B);
			lb3.setText(""+C);
			if (lb1.getText() == lb2.getText() && lb2.getText() == lb3.getText())
				lb4.setText("축하합니다!");
			else
				lb4.setText("아쉽군요~");
			break;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
