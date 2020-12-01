package swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import swing.btn.actions.NextBtnAction;

public class S05_JPanel extends JFrame {
	
	ArrayList<JButton> btns = new ArrayList<>();
	
	{
		for (int i = 1; i<= 10; i++) {
			btns.add(new JButton("button" + i));
		}
	}
	
	public S05_JPanel() {
		SwingTools.initTestFrame(this);
		
		/*
		 # JPanel
		 - ������ ���� �߰��� ���� �� �ִ� �����̳�
		 - �����̳� ������ �ϴ� ������Ʈ
		 */
		Container c = this.getContentPane();
		
		JPanel south_panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
		JPanel center_panel = new JPanel(new CardLayout(10, 10));
//		JPanel center_panel1 = new JPanel(new CardLayout(10, 11));
		
		JButton next_btn = new JButton("next");
		next_btn.addActionListener(new NextBtnAction(center_panel));
		
		JButton first_btn = new JButton("first");
		first_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				((CardLayout) center_panel.getLayout()).first(center_panel);
			}
		});
		
		JButton last_btn = new JButton("last");
		last_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				((CardLayout) center_panel.getLayout()).last(center_panel);
			}
		});
		
		JButton prev_btn = new JButton("prev");
		prev_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				((CardLayout) center_panel.getLayout()).previous(center_panel);
			}
		});
		
		/*
		 # MVC ����
		 1. Model
			 �����͸� �����ų� ������ �� ����ϴ� Ŭ�������� ���� ��Ī�ϴ� ��.
			 �ַ�, �������� ���¸� �����ϴ� Ŭ������ ���Ѵ�
		 2. view
		 	����ڿ��� ������ ȭ���� �����ϴ� Ŭ�������� ���� ��Ī�ϴ� ��.
		 3. Controller
			 ������� �Է��� ó���ϴµ� �ʿ��� Ŭ�������� ���� ��Ī�ϴ� ��
			 (1) ����Ͻ� ���� 
			 	- ����Ͻ����� �޶����� ó������ ����Ͻ������̶�� �Ѵ�.
			 (2) DAO(Data Access Object) 
			 	- �����ͺ��̽�(�Ǵ� ���� �ý���)�� �����Ϳ� �����ϴ� ��ɵ�
		 */
		
		// ����� -> View -> Controller -> Model -> �����ͺ��̽�
		
		/*
			1. lastAction, firstAction, prevAction���� ��Ʈ�ѷ��� �з� �� �� �ִ�
			2. ���� �ҽ��� ȭ���� ǥ���ϴ� �ڵ�(View)�� ������ ����ϴ� �ڵ�(Controller)�� �����ִ�
			3. ���� ���� ȭ�鿡 lastAction�� ����� �Ȱ��� ��ư�� �߰��ϴµ�
				Controller�� �ش��ϴ� �͸� ����ü�� ���ҵǾ����� �ʴٸ� ������ �Ұ��̴�
			4. �Ȱ��� �ҽ��� ���������� �����ϰ� �ǹǷ� �ڵ� �����ÿ� ������ �߻��Ѵ�
		*/
		
		// 1. center_panal�� �̹����� �� �� �� �߰��غ�����
		// 2. south_panal�� first, last, prev ��ư�� �߰��غ�����
		
		this.setLayout(new BorderLayout());
		this.add(center_panel, BorderLayout.CENTER);
		this.add(south_panel, BorderLayout.SOUTH);
		
		center_panel.add("apple", new JLabel(new ImageIcon("D:\\10�� �ڹ� sw������ �缺���� ������\\apple.jpeg")));		
		center_panel.add("banana", new JLabel(new ImageIcon("D:\\10�� �ڹ� sw������ �缺���� ������\\banana.jpeg")));		
		center_panel.add("banana", new JLabel(new ImageIcon("D:\\10�� �ڹ� sw������ �缺���� ������\\kiwi.jpeg")));		
		center_panel.add("banana", new JLabel(new ImageIcon("D:\\10�� �ڹ� sw������ �缺���� ������\\grape.jpeg")));		
		center_panel.add("banana", new JLabel(new ImageIcon("D:\\10�� �ڹ� sw������ �缺���� ������\\mango.jpeg")));		
		center_panel.add("banana", new JLabel(new ImageIcon("D:\\10�� �ڹ� sw������ �缺���� ������\\flower.png")));		
		center_panel.add("banana", new JLabel(new ImageIcon("D:\\10�� �ڹ� sw������ �缺���� ������\\melon.jpeg")));		
		center_panel.add("banana", new JLabel(new ImageIcon("D:\\10�� �ڹ� sw������ �缺���� ������\\orange.jpeg")));		
		center_panel.add("banana", new JLabel(new ImageIcon("D:\\10�� �ڹ� sw������ �缺���� ������\\pear.jpeg")));		
		
		// south_panel�� flowlayout
		south_panel.add(next_btn);
		south_panel.add(first_btn);
		south_panel.add(last_btn);
		south_panel.add(prev_btn);
	}
	
	public static void main(String[] args) {
		new S05_JPanel();
	}
	
	
}



















