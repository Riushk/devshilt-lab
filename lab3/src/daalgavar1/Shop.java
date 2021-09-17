package daalgavar1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Shop extends Frame implements ActionListener {
	
	Label lbl = new Label("Онлайн худалдааны програм");
	
	Button fclothes = new Button("Эмэгтэй хувцас");
	Button mclothes = new Button("Эрэгтэй хувцас");
	Button sportswear = new Button("Спорт хувцас");
	Button accessories = new Button("Гоел чимэглэл");
	Button bag = new Button("Цүнх");
	Button exit = new Button("Гарах");
	
	Panel panel = new Panel();
	Label shopCartLbl = new Label();
	
	public Shop(String title) {
		super(title);
		setLayout(new GridLayout(6, 2));
		add(lbl);
		add(fclothes);
		add(mclothes);
		add(sportswear);
		add(accessories);
		add(bag);
		add(exit);
		panel.add(shopCartLbl);
		add(panel);
		fclothes.addActionListener(this);
		mclothes.addActionListener(this);
		sportswear.addActionListener(this);
		accessories.addActionListener(this);
		exit.addActionListener(this);
		pack();
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				setVisible(false);
				System.exit(0);
			}
		});
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(fclothes)) {
			shopCartLbl.setText("Эмэгтэй хувцас");
		} else if (e.getSource().equals(mclothes)) {
			shopCartLbl.setText("Эрэгтэй хувцас");
		} else if (e.getSource().equals(sportswear)) {
			shopCartLbl.setText("Спорт хувцас");
		} else if (e.getSource().equals(accessories)) {
			shopCartLbl.setText("Гоел чимэглэл");
		} else if (e.getSource().equals(bag)) {
			shopCartLbl.setText("Цүнх");
		} else if (e.getSource().equals(exit)) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		Shop myshop = new Shop("Shop");
		myshop.setSize(500,500);
		myshop.setVisible(true);
	}

}
