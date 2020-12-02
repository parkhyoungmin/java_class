package quiz;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import swing.S08QuizMyframe;

public class S08_PopupMenuQuiz extends JFrame {
	
	final static String[] paths = {
			"D:\\10�� �ڹ� sw������ �缺���� ������\\1�ֻ���.jpg",	
			"D:\\10�� �ڹ� sw������ �缺���� ������\\2�ֻ���.jpg",
			"D:\\10�� �ڹ� sw������ �缺���� ������\\3�ֻ���.jpg",
			"D:\\10�� �ڹ� sw������ �缺���� ������\\4�ֻ���.jpg",
			"D:\\10�� �ڹ� sw������ �缺���� ������\\5�ֻ���.jpg",
			"D:\\10�� �ڹ� sw������ �缺���� ������\\6�ֻ���.jpg"
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
	
	private int dice_image1 = (int) (Math.random() * 6);
	private int dice_image2 = (int) (Math.random() * 6);
	private int dice_image3 = (int) (Math.random() * 6);
	private int dice_image4 = (int) (Math.random() * 6);
	private int dice_image5 = (int) (Math.random() * 6);
	
	// ȭ�鿡 5���� �ֻ����� ����
	// �˾��޴�, �޴���, ��ư�� REROLL ����� �޾ƺ�����
	
	// �������� �ִ� REROLL�� ������ ���� �ֻ����� ���ؾ� �մϴ�
	
	public S08_PopupMenuQuiz() {
		JButton random = new JButton("�̰� �����ֳ�");
		JLabel dice1 = new JLabel(images.get(dice_image1));
		JLabel dice2 = new JLabel(images.get(dice_image2));
		JLabel dice3 = new JLabel(images.get(dice_image3));
		JLabel dice4 = new JLabel(images.get(dice_image4));
		JLabel dice5 = new JLabel(images.get(dice_image5));
		
		dice1.setBounds(0, 0, 200, 200);
		dice2.setBounds(100, 0, 200, 200);
		dice3.setBounds(200, 0, 200, 200);
		dice4.setBounds(300, 0, 200, 200);
		dice5.setBounds(400, 0, 200, 200);
		random.setBounds(0, 0, 0, 0);

		
		random.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dice1.setIcon(images.get(dice_image1));
				dice2.setIcon(images.get(dice_image2));
				dice3.setIcon(images.get(dice_image3));
				dice4.setIcon(images.get(dice_image4));
				dice5.setIcon(images.get(dice_image5));
			}
		});

		add(random);
		add(dice1);
		add(dice2);
		add(dice3);
		add(dice4);
		add(dice5);
		
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(1000, 100);
		setSize(700, 700);
		setVisible(true);
	}

	
	public static void main(String[] args) {
//		new S08QuizMyframe();
		
		JFrame jf = new JFrame();
		
		JPopupMenu pop = new JPopupMenu("Edit");
		JMenuItem reroll = new JMenuItem("�ٽõ�����");
		
		pop.add(reroll);
		
		reroll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new S08_PopupMenuQuiz();
			}
		});
		
		jf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON2) {
					int x = e.getX();
					int y = e.getY();
					pop.show(jf, x, y);
				}
				if (e.getButton() == MouseEvent.BUTTON3) {
					new S08_PopupMenuQuiz();
				}
			}
		});
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocation(1000, 100);
		jf.setSize(300, 300);
		jf.setLayout(null);
		jf.setVisible(true);

	}

}
