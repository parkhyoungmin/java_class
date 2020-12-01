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

	// ��������: ��ư�� �ϳ� �߰� �ϰ�, �� ��ư�� ������ ��� �׸��� �ٳ����� ���ϵ���
	// ��������. (�ٽô����� �ٽ� ����� �˴ϴ�.)
	
	// ��θ� �̿��� ArrayList�� �̸� ImageIcon���� ����� ���´�
	final static String[] paths = {
			"D:\\10�� �ڹ� sw������ �缺���� ������\\apple.jpeg",	
			"D:\\10�� �ڹ� sw������ �缺���� ������\\banana.jpeg"	
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














