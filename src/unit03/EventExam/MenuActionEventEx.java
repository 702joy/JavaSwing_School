package EventExam;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuActionEventEx extends JFrame implements ActionListener {

	JMenuBar mb = new JMenuBar();

	JMenu m_Screen = new JMenu("Screen");
	JMenuItem[] screenItem = new JMenuItem[4];
	String[] screennames = { "�ҷ�����", "�����", "�ٽú����ֱ�", "������" };

	JLabel imglb = new JLabel();

	MenuActionEventEx() {

		add(imglb, BorderLayout.CENTER);

		setJMenuBar(mb);
		mb.add(m_Screen);

		for (int i = 0; i < screenItem.length; i++) {
			screenItem[i] = new JMenuItem(screennames[i]);
			m_Screen.add(screenItem[i]);
			screenItem[i].addActionListener(this);
		}

		setTitle("MEUN");
		setSize(250, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MenuActionEventEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "�ҷ�����" :
			imglb.setIcon(new ImageIcon("img/img.jpg"));
			break;
		case "�����" :
			if(imglb.getIcon() != null)
				imglb.setVisible(false);
			break;
		case "�ٽú����ֱ�" :
			imglb.setVisible(true);
			break;
		case "������" :
			System.exit(0);
			break;
		}
	}

}
