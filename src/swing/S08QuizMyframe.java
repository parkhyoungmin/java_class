package swing;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import quiz.S08_PopupMenuQuiz;

public class S08QuizMyframe extends JFrame {

	public S08QuizMyframe() {
		this.setTitle("Menu");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		createMenu();
		
		this.setVisible(true);
	}

	public void createMenu() {
		JMenuBar bar = new JMenuBar();
		JMenu filemenu = new JMenu("Menu");
		JMenuItem menuitem = new JMenuItem("reroll");
		
		bar.add(filemenu);
		filemenu.add(menuitem);
		
		this.setJMenuBar(bar);
	}
	
}
