package quiz;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class S02_ImageButtonQuiz extends JFrame {

	// kakao1.png를 이용해 12개의 버튼을 생성해보세요
	
	public S02_ImageButtonQuiz() {
       
        JButton button1 = new JButton(new ImageIcon("D:\\10월 자바 sw개발자 양성과정 박형민\\1.png"));
        JButton button3 = new JButton(new ImageIcon("D:\\10월 자바 sw개발자 양성과정 박형민\\2.png")); 
        JButton button5 = new JButton(new ImageIcon("D:\\10월 자바 sw개발자 양성과정 박형민\\3.png")); 
        JButton button6 = new JButton(new ImageIcon("D:\\10월 자바 sw개발자 양성과정 박형민\\4.png")); 
        JButton button9 = new JButton(new ImageIcon("D:\\10월 자바 sw개발자 양성과정 박형민\\5.png")); 
        JButton button10 = new JButton(new ImageIcon("D:\\10월 자바 sw개발자 양성과정 박형민\\6.png")); 
        JButton button4 = new JButton(new ImageIcon("D:\\10월 자바 sw개발자 양성과정 박형민\\7.png"));
        JButton button2 = new JButton(new ImageIcon("D:\\10월 자바 sw개발자 양성과정 박형민\\8.png"));                        
        JButton button7 = new JButton(new ImageIcon("D:\\10월 자바 sw개발자 양성과정 박형민\\9.png"));      
        JButton button8 = new JButton(new ImageIcon("D:\\10월 자바 sw개발자 양성과정 박형민\\10.png"));                
        JButton button11 = new JButton(new ImageIcon("D:\\10월 자바 sw개발자 양성과정 박형민\\11.png"));      
        JButton button12 = new JButton(new ImageIcon("D:\\10월 자바 sw개발자 양성과정 박형민\\12.png"));      
        
        button1.setBounds(0, 0, 100, 100);
        button3.setBounds(100, 0, 100, 100);
        button5.setBounds(200, 0, 100, 100);
        button6.setBounds(300, 0, 100, 100);
        button9.setBounds(400, 0, 100, 100);
        button10.setBounds(500, 0, 100, 100);
        button4.setBounds(0, 100, 100, 100);
        button2.setBounds(100, 100, 100, 100);
        button7.setBounds(200, 100, 100, 100);
        button8.setBounds(300, 100, 100, 100);
        button11.setBounds(400, 100, 100, 100);
        button12.setBounds(500, 100, 100, 100);
       
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(button10);
        add(button11);
        add(button12);
        
        setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(1000, 100);
		setSize(700, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new S02_ImageButtonQuiz();
		
	}

}
