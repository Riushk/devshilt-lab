package daalgavar1;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class daalgavar1 extends Applet{
	
	//components
	Label lbl1 = new Label("Name");
	TextField txtColor = new TextField(1);
	CheckboxGroup chboxgroup = new CheckboxGroup();
	Checkbox checkMale = new Checkbox("Male", chboxgroup, false);
	Checkbox checkFemale = new Checkbox("Female", chboxgroup, false);
	TextArea tarea = new TextArea();
	Choice choice1 = new Choice();
	TextField txtchoice1 = new TextField();
	List list = new List(5);
	
	//panels
	Panel panel1, panel2, panel3;
	
	public void init() {
		choice1.addItem("IT");
		
		panel1 = new Panel();
		panel2 = new Panel();
		panel3 = new Panel();
		
		list.add("Java");
		list.add("Math");
		list.add("OOP");
		list.add("C++");
		list.add("Database");
		
		// sets Layout
		setLayout(new BorderLayout());
		
		//rightPanel
		panel1.setLayout(new GridLayout(3,2));
		panel1.add(lbl1);
		panel1.add(txtColor);
		panel1.add(checkMale);
		panel1.add(checkFemale);
		panel1.add(choice1);
		add(panel1, BorderLayout.NORTH);
		
		//panel2
		panel2.setLayout(new GridLayout(2,1));
		panel2.add(list);
		add(panel2, BorderLayout.WEST);
		
		
		//panel3
		panel3.setLayout(new GridLayout(1,1));
		panel3.add(tarea);
		add(panel3, BorderLayout.EAST);

		
		
	}

	
	
}
