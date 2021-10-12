package myquestions;

//<applet code=myQuestions width=200 height=200></applet>
import java.awt.*;
import java.applet.*;

public class MyQuestions extends Applet {
	Label lbl1 = new Label("ONLINE QUIZ ");
	Label lbl2 = new Label("Who painted MonaLisa ?");
	Checkbox chkbook1 = new Checkbox("Jackson Pollock", false);
	Checkbox chkbook2 = new Checkbox("Leonardo da Vinci", false);
	Checkbox chkbook3 = new Checkbox("Michael Angelo", false);
	Checkbox chkbook4 = new Checkbox("Andy Warhol", false);
	Button btnNext = new Button("Next");
	Button btnPrev = new Button("Previous");
	Button btnFinish = new Button("Finish");
	Panel pnlTop = new Panel();
	Panel pnlCenter = new Panel();
	Panel pnlBottom = new Panel();

	public void init() {
		setLayout(new BorderLayout());
		pnlTop.setLayout(new GridLayout(2, 1));
		pnlTop.add(lbl1);
		pnlTop.add(lbl2);
		pnlCenter.setLayout(new GridLayout(5, 1));
		pnlCenter.add(chkbook1);
		pnlCenter.add(chkbook2);
		pnlCenter.add(chkbook3);
		pnlCenter.add(chkbook4);
		pnlBottom.add(btnNext);
		pnlBottom.add(btnPrev);
		pnlBottom.add(btnFinish);
		btnPrev.setEnabled(false);
		add(pnlTop, BorderLayout.PAGE_START);
		add(pnlCenter, BorderLayout.CENTER);
		add(pnlBottom, BorderLayout.PAGE_END);
	}
}
