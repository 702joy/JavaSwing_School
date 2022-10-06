package EventExam;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBoxItemEventEx extends JFrame implements ItemListener{
	int price=0;
	JLabel lb = new JLabel("���100��,��500��,ü��2000��");
	JCheckBox fruit1 = new JCheckBox("���");
	JCheckBox fruit2 = new JCheckBox("��");
	JCheckBox fruit3 = new JCheckBox("ü��");
	JLabel lb_result = new JLabel("���� 0���Դϴ�.");

	
	CheckBoxItemEventEx() {
		JPanel p = new JPanel();
		add(p);
		
		p.add(lb);
		p.add(fruit1);
		p.add(fruit2);
		p.add(fruit3);
		p.add(lb_result);
		
		fruit1.addItemListener(this);
		fruit2.addItemListener(this);
		fruit3.addItemListener(this);
		setTitle("üũ�ڽ� �̺�Ʈ ����");
		setSize(250,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);	
	}
	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			if(e.getItem() == fruit1) {
				price+=100;
			}
			else if(e.getItem() == fruit2) {
				price+=500;
			}
			else if(e.getItem() == fruit3) {
				price+=2000;
			}
			lb_result.setText("���� "+ price +"���Դϴ�.");
		}
		else if (e.getStateChange() == ItemEvent.DESELECTED) {
			if(e.getItem() == fruit1) {
				price-=100;
			}
			else if(e.getItem() == fruit2) {
				price-=500;
			}
			else if(e.getItem() == fruit3) {
				price-=2000;
			}
			lb_result.setText("���� "+ price +"���Դϴ�.");
			}
		}
}