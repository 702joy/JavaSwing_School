
package EventExam;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class RadioButtonEventEventEx extends JFrame implements ItemListener {

	JTextField src = new JTextField(8);
	JTextField des = new JTextField(8);
	JLabel lb = new JLabel("ㅡ>");

	JRadioButton[] rb = new JRadioButton[4];
	String[] names = { "Decimal", "Binary", "Octal", "Octal" };
	/*
	 * JRadioButton decimal = new JRadioButton("Decimal"); JRadioButton binary = new
	 * JRadioButton("Binary"); JRadioButton octal = new JRadioButton("Octal");
	 * JRadioButton hex = new JRadioButton("Hex");
	 */
	ButtonGroup bg = new ButtonGroup();

	RadioButtonEventEventEx() {

		JPanel p = new JPanel();
		add(p);
		p.add(src);
		p.add(lb);
		p.add(des);

		for (int i = 0; i < rb.length; i++) {
			rb[i] = new JRadioButton(names[i]);
			bg.add(rb[i]);
			p.add(rb[i]);
			rb[i].addItemListener(this);
		}

		setTitle("진수변환예제");
		setSize(300, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		new RadioButtonEventEventEx();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {

			
			String srcStr = src.getText().trim();

			int num = Integer.parseInt(srcStr);

			if (e.getItem() == rb[0]) {
				des.setText(src.getText());
			} else if (e.getItem() == rb[1]) {
				des.setText(Integer.toBinaryString(num));
			} else if (e.getItem() == rb[2]) {
				des.setText(Integer.toOctalString(num));
			} else if (e.getItem() == rb[3]) {
				des.setText(Integer.toHexString(num));
			}
		}

	}

}
