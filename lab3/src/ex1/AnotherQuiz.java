package ex1;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AnotherQuiz extends Frame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Label lbl = new Label("Дуртай номоо сонгоно уу");
	
	Checkbox chkbook1 = new Checkbox("Сорхугтани - Б.Сарантуяа", false);
	Checkbox chkbook2 = new Checkbox("Ногоон нүдэн лам - Ц.Оюунгэрэл", false);
	Checkbox chkbook3 = new Checkbox("Өөдөө тэмүүл - Шерил Сандберг", false);
	Checkbox chkbook4 = new Checkbox("Ану хатан - Б.Шүүдэрцэцэг", false);
	
	Button btndone = new Button("Done");
	
	TextField txtAnswer = new TextField(20);
	
	String ans;
	Panel books = new Panel();
	
	public AnotherQuiz(String title) {
		super(title);
		setLayout(new GridLayout(7,1));
		add(lbl);
		add(chkbook1);
		add(chkbook2);
		add(chkbook3);
		add(chkbook4);
		books.add(btndone);
		books.add(txtAnswer);
		btndone.addActionListener(this);
		add(books);
		pack();
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				setVisible(false);
				System.exit(0);
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btndone)) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		AnotherQuiz objAnotherQuiz = new AnotherQuiz("Quiz");
		objAnotherQuiz.setSize(550,550);
		objAnotherQuiz.setVisible(true);
	}
}
