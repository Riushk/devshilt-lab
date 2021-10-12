package calculator;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Calculator extends Applet implements ActionListener {
	Button[] operators = new Button[4];
	Button[] digits = new Button[9];
	Button[] misc = new Button[3];
	String sdigits = "789456123";
	String soperators = "/*-+";
	String smisc = "0.=";
	TextField tf;
	boolean flagtf = true;// true= tf is empty
	// false=tf contains one or more digits or a dot
	boolean flagdot = true;// true '.' button not clicked
	// false '.' button clicked
	byte flagoper = 0; // 1= '/' operator button clicked
	// 2= '*' operator button clicked
	// 3= '-' operator button clicked
	// 4= '+' operator button clicked
	double val1, val2, ans;

	public void init() {
		Panel top = new Panel(new GridLayout(2, 1, 5, 5));
		Panel center = new Panel(new GridLayout(3, 3, 5, 5));
		Panel bottom = new Panel(new GridLayout(1, 3, 5, 5));
		Panel right = new Panel(new GridLayout(4, 1, 5, 5));
		tf = new TextField(20);
		tf.setEditable(false);
		top.add(tf);
		// click event code for digit keys 1-9
		for (int index = 0; index < digits.length; index++) {
			digits[index] = new Button("" + sdigits.charAt(index));
			digits[index].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (flagtf) {
						tf.setText(((Button) e.getSource()).getLabel());
						// tf contains one or more digits,
						// so set it to false
						flagtf = false;
					} else {
						tf.setText(tf.getText() + ((Button) e.getSource()).getLabel());
					}
				}
			});
			center.add(digits[index]);
		}
		for (int index = 0; index < misc.length; index++) {
			misc[index] = new Button("" + smisc.charAt(index));
			misc[index].addActionListener(this);
			bottom.add(misc[index]);
		}
		// click event code for operator keys
		for (int index = 0; index < operators.length; index++) {
			operators[index] = new Button("" + soperators.charAt(index));
			operators[index].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					val1 = Double.parseDouble(tf.getText());
					// set flagtf to true to accept new value
					flagtf = true;
					// set flagdot to true to accept dot for new value
					flagdot = true;
					String temp = ((Button) e.getSource()).getLabel();
					if (temp.equals("/"))
						flagoper = 1;
					else if (temp.equals("*"))
						flagoper = 2;
					else if (temp.equals("-"))
						flagoper = 3;
					else if (temp.equals("+"))
						flagoper = 4;
				}
			});
			right.add(operators[index]);
		}
		Panel child = new Panel(new BorderLayout());
		child.add(center, BorderLayout.NORTH);
		child.add(bottom, BorderLayout.SOUTH);
		Panel parent = new Panel(new BorderLayout());
		parent.add(tf, BorderLayout.NORTH);
		parent.add(child, BorderLayout.CENTER);
		parent.add(right, BorderLayout.EAST);
		add(parent);
	}

	public void actionPerformed(ActionEvent e) {
		// code for click event of '0' button
		if (((Button) e.getSource()) == misc[0]) {
			if (!flagtf)
				tf.setText(tf.getText() + "0");
			else
				tf.setText("0");
		}
		// code for click event of '.' button
		else if (((Button) e.getSource()) == misc[1]) {
			if (flagdot) {
				flagdot = false;
				if (flagtf) {
					tf.setText("0.");
					flagtf = false;
				} else
					tf.setText(tf.getText() + ".");
			}
		}
		// code for click event of '=' button
		else if (((Button) e.getSource()) == misc[2]) {
			if (tf.getText() != null) {
				ans = Double.parseDouble(tf.getText());
				switch (flagoper) {
				case 1:
					ans = val1 / ans;
					break;
				case 2:
					ans = val1 * ans;
					break;
				case 3:
					ans = val1 - ans;
					break;
				case 4:
					ans = val1 + ans;
					break;
				}
				tf.setText("" + ans);
				flagtf = true;
				flagdot = true;
			}
		}
	}
}
