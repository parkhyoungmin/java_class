package swing;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AppleBananaButtonQuiz extends JFrame {

	// 연습문제: 버튼을 하나 추가 하고, 그 버튼을 누르면 사과 그림이 바나나로 변하도록
	// 만들어보세요. (다시누르면 다시 사과가 됩니다.)
	
	// 경로를 이용해 ArrayList에 미리 ImageIcon들을 만들어 놓는다
	final static String[] paths = {
			"D:\\10월 자바 sw개발자 양성과정 박형민\\apple.jpeg",	
			"D:\\10월 자바 sw개발자 양성과정 박형민\\banana.jpeg"	
	};

	final static ArrayList<ImageIcon> images = new ArrayList<>();
	
	static {
        for (String path : paths) {
                setImageIcon(path);
        }
	}
	
	private static void setImageIcon(String path) {
        try {
                images.add(new ImageIcon(ImageIO
                            .read(new File(path))
                            .getScaledInstance(100, 100, Image.SCALE_FAST)
                               ));
        } catch (IOException e) {
                e.printStackTrace();
        }
	}
	
	private int curr_image = 0;
	
	public AppleBananaButtonQuiz() throws IOException {
		JButton change = new JButton("change");
		JLabel apple = new JLabel(images.get(curr_image));
		
		apple.setBounds(50, 50, 200, 200);
		change.setBounds(50, 250, 100, 50);
		
		change.setEnabled(true);
		
		change.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				apple.setIcon(images.get(curr_image++ % images.size()));
			}
		});
		
		add(change);
		add(apple);
		
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(1000, 100);
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) throws IOException {
		new AppleBananaButtonQuiz();
	}
	
	
	

}














