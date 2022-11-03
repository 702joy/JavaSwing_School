package EventExam;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class HelloKeyEnter extends JFrame implements KeyListener{
	
	JPanel p = new JPanel();
	JLabel lb = new JLabel("<Enter>키로 배경색이 바뀝니다");
	
	HelloKeyEnter(){
		
		add(p);
		p.add(lb);
		p.addKeyListener(this);
		
		setSize(350, 250);
		setTitle("키이벤트 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		p.setFocusable(true);
		p.requestFocus();
	}
	public static void main(String[] args) {
		new HelloKeyEnter();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		int R = (int)(Math.random() * 256);
		int G = (int)(Math.random() * 256);
		int B = (int)(Math.random() * 256);
		
		switch(e.getKeyChar()) {
		case '\n':
			lb.setText("R = " + R + ", G = " + G + ", B = " + B );
			p.setBackground(new Color(R,G,B));
			break;
		case  'q':
			System.exit(0);
			break;
			
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
