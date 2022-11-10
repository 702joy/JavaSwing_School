package EventExam;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuActionEventEx extends JFrame implements ActionListener {

	JMenuBar mb = new JMenuBar();

	JMenu m_Screen = new JMenu("Screen");
	JMenuItem[] screenItem = new JMenuItem[4];
	String[] screennames = { "불러오기", "숨기기", "다시보여주기", "끝내기" };

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
		case "불러오기" :
			imglb.setIcon(new ImageIcon("img/img.jpg"));
			break;
		case "숨기기" :
			if(imglb.getIcon() != null)
				imglb.setVisible(false);
			break;
		case "다시보여주기" :
			imglb.setVisible(true);
			break;
		case "끝내기" :
			System.exit(0);
			break;
		}
	}

}
