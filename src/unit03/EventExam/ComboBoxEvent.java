package EventExam;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ComboBoxEvent extends JFrame implements ActionListener {

	String[] coffee = {"아메리카노","라떼","카푸치노","에소프레소"};
	JComboBox<String> combo = new JComboBox<String>(coffee);
	JLabel lb = new JLabel();
	
	ImageIcon [] images = { new ImageIcon("img/ame.jpg"),
							new ImageIcon("img/latte.jpg"),
							new ImageIcon("img/capu.jpg"),
							new ImageIcon("img/es.jpg")};
	ComboBoxEvent() {

		add(combo,BorderLayout.NORTH);
		add(lb,BorderLayout.CENTER);
		
		combo.addActionListener(this);
		
		setTitle("커피메뉴 콤보박스");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ComboBoxEvent();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==combo) {
			int index = combo.getSelectedIndex();
			lb.setIcon(images[index]);
		}
	}
}