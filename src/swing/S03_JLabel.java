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
		// JLabel : �ؽ�Ʈ�� ���� �� �ִ� ������Ʈ
		JLabel label01 = new JLabel("Hello, java gui!!");
		
		JLabel label02 = new JLabel(
				new ImageIcon(
						ImageIO.read(
								new File("D:\\10�� �ڹ� sw������ �缺���� ������\\1.png")
						).getScaledInstance(100, 100, Image.SCALE_SMOOTH)
				)
		);
		
		label01.setBounds(50, 50, 400, 50);
		label02.setBounds(50, 120, 300, 300);
		
		// ������Ʈ��(JFrame ��)�� �۲� ����
		label01.setFont(new Font("�ü�ü", Font.BOLD, 35));
		
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
















