package EventExam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingCounter extends JFrame implements ActionListener{
	
	JLabel lb = new JLabel("카운터값");
	JTextField tf = new JTextField("0",5);
	JButton btn1  = new JButton("증가");
	JButton btn2  = new JButton("감소");
	JButton btn3  = new JButton("초기화");
	SwingCounter(){
		
		JPanel p = new JPanel();
		add(p);
		
		p.add(lb);
		p.add(tf);
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		
		setTitle("간단카운터");
		setSize(400,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args){
		new SwingCounter();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			int num = Integer.parseInt(tf.getText().trim());
			num+=1;
			tf.setText(num+"");
		}
		else if(e.getSource() == btn2) {
			int num = Integer.parseInt(tf.getText().trim());
			num-=1;
			tf.setText(num+"");
		}else if(e.getSource() == btn3) {
			tf.setText("0");
		}
	}
}