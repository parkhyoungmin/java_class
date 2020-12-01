package swing;

import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class S03_JLabel extends JFrame {

	public S03_JLabel() throws IOException {
		// JLabel : 텍스트를 적을 수 있는 컴포넌트
		JLabel label01 = new JLabel("Hello, java gui!!");
		
		JLabel label02 = new JLabel(
				new ImageIcon(
						ImageIO.read(
								new File("D:\\10월 자바 sw개발자 양성과정 박형민\\1.png")
						).getScaledInstance(100, 100, Image.SCALE_SMOOTH)
				)
		);
		
		label01.setBounds(50, 50, 400, 50);
		label02.setBounds(50, 120, 300, 300);
		
		// 컴포넌트들(JFrame 등)의 글꼴 설정
		label01.setFont(new Font("궁서체", Font.BOLD, 35));
		
		add(label01);
		add(label02);
		
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocation(1000, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) throws IOException {
		new S03_JLabel();
	}

}
















