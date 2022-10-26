package EventExam;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.event.AncestorListener;

public class TextAreaEx extends JFrame implements ActionListener{
	JLabel lb = new JLabel("�Է��� <Enter>Ű�� �Է��ϼ���");
	JTextField tf = new JTextField(15);
	JTextArea ta = new JTextArea(7,20);
	JScrollPane sp = new JScrollPane(ta);
	JButton btn = new JButton("��>");
	
	TextAreaEx(){
		JPanel p = new JPanel();
			add(p);
			p.add(lb);
			p.add(sp);
			p.add(tf);
			p.add(btn);
			tf.addActionListener(this);
			btn.addActionListener(this);
			tf.setBackground(Color.LIGHT_GRAY);
			setTitle("�ؽ�Ʈ ���������");
			setSize(300,250);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setVisible(true);
	}
	public static void main(String[] args) {
		new TextAreaEx();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tf) {
			ta.append(tf.getText() + "\n");
			tf.setText("");
		}else if (e.getSource() == btn) {
			ta.append(tf.getText() + "\n");
			tf.setText("");
		}
	}
}