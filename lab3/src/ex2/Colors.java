package ex2;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Colors extends Frame implements ItemListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Choice clrs = new Choice();

	public Colors(String title) {
		super(title);
		setLayout(new FlowLayout());
		
		clrs.addItem("Улбар шар");
		clrs.addItem("Хар");
		clrs.addItem("Ногоон");
		clrs.addItem("Шар");
		clrs.addItem("Ягаан");
		add(clrs);
		clrs.addItemListener(this);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				setVisible(false);
				System.exit(0);
			}
		});
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		int index = clrs.getSelectedIndex();
		switch(index) {
		case 0 : this.setBackground(Color.orange);
		break;
		case 1 : this.setBackground(Color.black);
		break;
		case 2 : this.setBackground(Color.green);
		break;
		case 3 : this.setBackground(Color.yellow);
		break;
		case 4 : this.setBackground(Color.pink);
		break;
		default: break; 
		}
	}
	
	public static void main(String[] args) {
		Colors objColors = new Colors("Өнгө сонгох");
		objColors.setVisible(true);
		objColors.setSize(400,400);
	}
}
