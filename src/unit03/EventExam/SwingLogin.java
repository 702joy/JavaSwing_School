package EventExam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingLogin extends JFrame implements ActionListener {
	JLabel idlb = new JLabel("아이디", JLabel.CENTER);
	JTextField idtf = new JTextField();
	JLabel pslb = new JLabel("비밀번호", JLabel.CENTER);
	JPasswordField pstf = new JPasswordField();

	JButton btnLogin = new JButton("로그인");
	JButton btnCancel = new JButton("취소");
	JLabel lbResult = new JLabel("결과 출력");

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

		setTitle("로그인");
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
			if (strid.length() == 0) lbResult.setText("아이디를 입력하세요");
			else if (strps.length() == 0) lbResult.setText("비밀번호를 입력하세요");
			else lbResult.setText(strid + " 님의 비밀번호는 " + strps + " 입니다");
		   }
			else if (e.getSource() == btnCancel) {
			lbResult.setText("취소하였습니다");
			idtf.setText(""); pstf.setText("");
		   }
	   }
}