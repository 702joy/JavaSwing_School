package EventExam;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class MouseEventALLEx extends JFrame implements MouseListener, MouseMotionListener{
	
	JPanel p = new JPanel();
	JLabel lb = new JLabel("��������");
	
	MouseEventALLEx() {
		
		add(p);
		p.add(lb);
		p.setLayout(null);
		
		p.addMouseListener(this);
		p.addMouseMotionListener(this);
		
		setTitle("���콺 �̺�Ʈ");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseEventALLEx();

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		lb.setLocation(e.getX(),e.getY());
		setTitle("���콺�� �巡���� ��ġ  (" +e.getX() + "," + e.getY() + ")");// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		lb.setLocation(e.getX(),e.getY());
		setTitle("���콺�� ������ ��ġ  (" +e.getX() + "," + e.getY() + ")");// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getClickCount()==2) {
			lb.setLocation(e.getX(),e.getY());
			setTitle("���콺��  ����Ŭ���� ��ġ  (" +e.getX() + "," + e.getY() + ")");
		}else {
			lb.setLocation(e.getX(),e.getY());
			setTitle("���콺�� Ŭ���� ��ġ  (" +e.getX() + "," + e.getY() + ")");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
			lb.setLocation(e.getX(),e.getY());
			setTitle("���콺�� ������ ��ġ  (" +e.getX() + "," + e.getY() + ")");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		lb.setLocation(e.getX(),e.getY());
		setTitle("���콺�� ������ ��ġ  (" +e.getX() + "," + e.getY() + ")");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		p.setBackground(Color.gray);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		p.setBackground(Color.black);
		
	}

}
