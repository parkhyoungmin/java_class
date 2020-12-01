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
		 - 프레임 위에 추가로 붙일 수 있는 컨테이너
		 - 컨테이너 역할을 하는 컴포넌트
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
		 # MVC 패턴
		 1. Model
			 데이터를 꺼내거나 저장할 때 사용하는 클래스들을 따로 지칭하는 말.
			 주로, 데이터의 형태를 정의하는 클래스를 말한다
		 2. view
		 	사용자에게 제공할 화면을 구성하는 클래스들을 따로 지칭하는 말.
		 3. Controller
			 사용자의 입력을 처리하는데 필요한 클래스들을 따로 지칭하는 말
			 (1) 비즈니스 로직 
			 	- 비즈니스마다 달라지는 처리들을 비즈니스로직이라고 한다.
			 (2) DAO(Data Access Object) 
			 	- 데이터베이스(또는 파일 시스템)의 데이터에 접근하는 기능들
		 */
		
		// 사용자 -> View -> Controller -> Model -> 데이터베이스
		
		/*
			1. lastAction, firstAction, prevAction들이 컨트롤러로 분류 될 수 있다
			2. 현재 소스는 화면을 표현하는 코드(View)와 로직을 담당하는 코드(Controller)가 섞여있다
			3. 만약 여러 화면에 lastAction과 기능이 똑같은 버튼을 추가하는데
				Controller에 해당하는 익명 구현체가 분할되어있지 않다면 복붙을 할것이다
			4. 똑같은 소스가 여러군데에 존재하게 되므로 코드 수정시에 문제가 발생한다
		*/
		
		// 1. center_panal에 이미지를 몇 장 더 추가해보세요
		// 2. south_panal에 first, last, prev 버튼을 추가해보세요
		
		this.setLayout(new BorderLayout());
		this.add(center_panel, BorderLayout.CENTER);
		this.add(south_panel, BorderLayout.SOUTH);
		
		center_panel.add("apple", new JLabel(new ImageIcon("D:\\10월 자바 sw개발자 양성과정 박형민\\apple.jpeg")));		
		center_panel.add("banana", new JLabel(new ImageIcon("D:\\10월 자바 sw개발자 양성과정 박형민\\banana.jpeg")));		
		center_panel.add("banana", new JLabel(new ImageIcon("D:\\10월 자바 sw개발자 양성과정 박형민\\kiwi.jpeg")));		
		center_panel.add("banana", new JLabel(new ImageIcon("D:\\10월 자바 sw개발자 양성과정 박형민\\grape.jpeg")));		
		center_panel.add("banana", new JLabel(new ImageIcon("D:\\10월 자바 sw개발자 양성과정 박형민\\mango.jpeg")));		
		center_panel.add("banana", new JLabel(new ImageIcon("D:\\10월 자바 sw개발자 양성과정 박형민\\flower.png")));		
		center_panel.add("banana", new JLabel(new ImageIcon("D:\\10월 자바 sw개발자 양성과정 박형민\\melon.jpeg")));		
		center_panel.add("banana", new JLabel(new ImageIcon("D:\\10월 자바 sw개발자 양성과정 박형민\\orange.jpeg")));		
		center_panel.add("banana", new JLabel(new ImageIcon("D:\\10월 자바 sw개발자 양성과정 박형민\\pear.jpeg")));		
		
		// south_panel은 flowlayout
		south_panel.add(next_btn);
		south_panel.add(first_btn);
		south_panel.add(last_btn);
		south_panel.add(prev_btn);
	}
	
	public static void main(String[] args) {
		new S05_JPanel();
	}
	
	
}



















