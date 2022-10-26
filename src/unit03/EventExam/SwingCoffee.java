package EventExam;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;


public class SwingCoffee extends JFrame implements ItemListener{
	JRadioButton [] bg = new JRadioButton[3];
	String [] names = {"에스프레소","아메리카노","라떼"}; 
	JTextArea ta = new JTextArea();
	JScrollPane sp = new JScrollPane(ta);
	ButtonGroup rg = new ButtonGroup();
	public SwingCoffee() {
		JPanel p = new JPanel();
		
		
		add(p,BorderLayout.NORTH);
		
		
		
		for(int i = 0;i<bg.length;i++) {
			bg[i]= new JRadioButton(names[i]);
			rg.add(bg[i]);
			p.add(bg[i]);
			bg[i].addItemListener(this);
		}
		
		
		add(sp, BorderLayout.CENTER);
		
		setTitle("커피주문");
		setSize(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new SwingCoffee();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange()==ItemEvent.SELECTED) ta.append(((AbstractButton)e.getItem()).getText()+"가 선택되었습니다.\n");
		else if(e.getStateChange()==ItemEvent.DESELECTED) ta.append(((AbstractButton)e.getItem()).getText()+"가 해제되었습니다.\n");
	}

}
