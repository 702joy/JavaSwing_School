package EventExam;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class HelloKeyMove extends JFrame implements KeyListener {
	JPanel p = new JPanel();
	JLabel lb = new JLabel("Hello");

	
	HelloKeyMove() {

		add(p);
		p.setLayout(null);
		p.add(lb);
		lb.setLocation(50, 50);
		lb.setSize(300, 250);

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
		new HelloKeyMove();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keycode = e.getKeyCode();
		switch(keycode) {
		case KeyEvent.VK_UP:
			lb.setLocation(lb.getX(),lb.getY()-10);
			break;
		case KeyEvent.VK_DOWN:
			lb.setLocation(lb.getX(),lb.getY()+10);
			break;
		case KeyEvent.VK_RIGHT:
			lb.setLocation(lb.getX()+10,lb.getY());
			break;
		case KeyEvent.VK_LEFT:
			lb.setLocation(lb.getX()-10,lb.getY());
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
