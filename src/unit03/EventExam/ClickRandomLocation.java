package EventExam;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.TimerTask;

import javax.swing.*;

public class ClickRandomLocation extends JFrame implements MouseListener{
	
	JPanel p = new JPanel();
	JLabel lb = new JLabel("[O]");
	int count = 0;
	ClickRandomLocation(){
		
		add(p);
		p.add(lb);
		p.setLayout(null);
		lb.setBounds(50,50,100,40);
		lb.addMouseListener(this);
		setTitle("클릭연습");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ClickRandomLocation();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		int xBound = p.getWidth() - lb.getWidth();
		int yBound = p.getHeight() - lb.getHeight();
		
		int X = (int)(Math.random() * xBound);
		int Y = (int)(Math.random() * yBound);
		lb.setLocation(X, Y);
		count++;
		setTitle(""+count);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
