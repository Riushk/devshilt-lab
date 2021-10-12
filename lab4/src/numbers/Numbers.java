package numbers;

//<applet code=Numbers width=200 height=200></applet>
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Numbers extends Applet implements ActionListener {
	Button btnNumbers[] = new Button[15];
	TextField txtNumber = new TextField(10);

	public void init() {
		for (int index = 0; index <= 14; index++) {
			btnNumbers[index] = new Button("" + (index + 1));
			btnNumbers[index].addActionListener(this);
			add(btnNumbers[index]);
		}
		add(txtNumber);
	}

	public void actionPerformed(ActionEvent e) {
		// get the label of clicked button
		String label = ((Button) e.getSource()).getLabel();
		txtNumber.setText(label);
	}
}
