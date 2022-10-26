package EventExam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingLogin extends JFrame implements ActionListener {
	JLabel idlb = new JLabel("���̵�", JLabel.CENTER);
	JTextField idtf = new JTextField();
	JLabel pslb = new JLabel("��й�ȣ", JLabel.CENTER);
	JPasswordField pstf = new JPasswordField();

	JButton btnLogin = new JButton("�α���");
	JButton btnCancel = new JButton("���");
	JLabel lbResult = new JLabel("��� ���");

	SwingLogin() {
		ImageIcon img = new ImageIcon("img/robot.PNG");
		JLabel lbrobot = new JLabel(img);
		add(lbrobot, BorderLayout.NORTH);

		JPanel p = new JPanel(new GridLayout(0, 2));
		add(p, BorderLayout.CENTER);

		p.add(idlb);
		p.add(idtf);
		
		p.add(pslb);
		p.add(pstf);

		btnLogin.setBackground(Color.YELLOW);
		btnCancel.setBackground(Color.PINK);
		p.add(btnLogin);
		p.add(btnCancel);

		add(lbResult, BorderLayout.SOUTH);
		btnLogin.addActionListener(this);
		btnCancel.addActionListener(this);

		setTitle("�α���");
		setSize(300, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SwingLogin();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	   {
		if (e.getSource() == btnLogin) 
		   {	
			String strid = idtf.getText();
			String strps = new String(pstf.getPassword());
			if (strid.length() == 0) lbResult.setText("���̵� �Է��ϼ���");
			else if (strps.length() == 0) lbResult.setText("��й�ȣ�� �Է��ϼ���");
			else lbResult.setText(strid + " ���� ��й�ȣ�� " + strps + " �Դϴ�");
		   }
			else if (e.getSource() == btnCancel) {
			lbResult.setText("����Ͽ����ϴ�");
			idtf.setText(""); pstf.setText("");
		   }
	   }
}