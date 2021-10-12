package ex2;

/*
<applet code=Painting width=400 height=400>
</applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Painting extends Applet implements ActionListener, MouseListener, MouseMotionListener {
	Button[] btnColors;
	Button btnRect, btnCircle, btnLine, btnFilledRect;
	int shape = 0, x1, y1, x2, y2;
	Panel pnlColors, pnlShape;
	Color cl;
	Color[] arrColors = { Color.red, Color.green, Color.cyan, Color.blue, Color.black, Color.orange, Color.yellow,
			Color.blue };

	public void init() {
		setBackground(Color.white);
		//creates two panels
		pnlColors = new Panel();
		pnlShape = new Panel();

		// sets the layout
		setLayout(new BorderLayout());
		//sets the layout of the panel
		pnlShape.setLayout(new GridLayout(1, 4));
		//creates the button and adds it to the panel
		btnRect = new Button("Rect");
		btnRect.addActionListener(this);
		pnlShape.add(btnRect);
		btnCircle = new Button("Circle");
		btnCircle.addActionListener(this);
		pnlShape.add(btnCircle);
		btnLine = new Button("Line");
		btnLine.addActionListener(this);
		pnlShape.add(btnLine);
		btnFilledRect = new Button("Filled rect");
		btnFilledRect.addActionListener(this);
		pnlShape.add(btnFilledRect);
		//adds the panel to the south
		add(pnlShape, BorderLayout.PAGE_END);
		//creates an array of button
		btnColors = new Button[8];
		//sets the layout to GridLayout
		pnlColors.setLayout(new GridLayout(8, 2));
		//initializes the array of button and adds listener
		for (int i = 0; i < 8; i++) {
			btnColors[i] = new Button(" ");
			btnColors[i].addActionListener(this);
			btnColors[i].setBackground(arrColors[i]);
			//adds to the panel
			pnlColors.add(btnColors[i]);
		}
		//adds the panel to the left or west
		add(pnlColors, BorderLayout.LINE_START);
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void mousePressed(MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();
		repaint();
	}

	public void mouseReleased(MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();
		repaint();
	}

	public void mouseDragged(MouseEvent e)

	{
		x2 = e.getX();
		y2 = e.getY();
		repaint();
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseMoved(MouseEvent e) {
	}

	public void actionPerformed(ActionEvent e) {
		cl = ((Button) e.getSource()).getBackground();
		String str = e.getActionCommand();

		if ("Rect".equals(str)) {
			shape = 1;
		} else if ("Circle".equals(str)) {
			shape = 2;
		} else if ("Line".equals(str)) {
			shape = 3;
			x1 = y1 = x2 = y2 = 0;

		} else if ("Filled rect".equals(str)) {
			shape = 4;
		}
		repaint();
	}

	public void paint(Graphics g) {
		// the color is set
		g.setColor(cl);
		// checking which shape to be drawn
		if (shape == 1) {
			g.drawRect(x1, y1, (x2 - x1), (y2 - y1));
			x2 = y2 = 0;
		} else if (shape == 2) {
			g.drawOval(x1, y1, (x2 - x1), (y2 - y1));
			x2 = y2 = 0;
		}

		else if (shape == 3) {
			g.drawLine(x1, y1, x2, y2);
			x2 = y2 = 0;
		} else if (shape == 4) {
			g.fillRect(x1, y1, (x2 - x1), (y2 - y1));
			x2 = y2 = 0;
		}
	}
}