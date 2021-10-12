package ex1;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class ListFillup extends Applet implements ActionListener {

	Choice chcolors = new Choice();
	Label lbl = new Label("Enter a color");
	TextField txtColor = new TextField(10);
	Button btnadd = new Button("Add");

	public void init() {
		chcolors.addItem("Colors");
		add(lbl);
		add(txtColor);
		add(btnadd);
		add(chcolors);
		btnadd.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnadd) {
			String text = txtColor.getText();
			txtColor.setText("");
			chcolors.addItem(text);
		}
	}

};