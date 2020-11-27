package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class S02_JButton extends JFrame {

	public S02_JButton() {
		JButton button1 = new JButton("����������!");
		JButton button2 = new JButton("CLICK ME!");
		JButton button3 = new JButton(
				new ImageIcon("D:\\10�� �ڹ� sw������ �缺���� ������\\hat.jpeg")
		);
		
		// setBounds : ��ġ�� ũ�� ������ �ѹ��� �Ѵ�
		button1.setBounds(100, 100, 100, 50);
		button2.setBounds(100, 250, 100, 50);
		button3.setBounds(200, 100, 200, 200);
		
		// setText : ������Ʈ�� �ؽ�Ʈ�� �����Ѵ�
		button1.setText("ABCDEFG!");
		button2.setText("����������!");
		
		// setEnable : ��ư�� Ȱ��ȭ/��Ȱ��ȭ �Ѵ�
		button1.setEnabled(true);
		button2.setEnabled(true);
		
		// ��ư�� �⺻ ���� �׼Ǹ����ʸ� ����
		ActionListener basic_btn_action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// �̺�Ʈ�� �߻����� �� �ش� �̺�Ʈ�� ������ �Ѱܹް� �ȴ�
				System.out.println("��ư�� ���Ƚ��ϴ�!");
				
				System.out.println("������ư�� ��ü ���� : " + e.getSource());
				System.out.println("cmd : " + e.getActionCommand());
				
				JButton clicked_btn = (JButton)e.getSource();
				
				System.out.println("��ư�� �̸� : " + clicked_btn.getText());
			}
		};
		
		// ��ư�� ������ �߰� (������ �ߵ�)
		// - ActionListener �������̽��� ����ü�� ��ư�� �߰��� �� �ִ�
		button1.addActionListener(basic_btn_action);
		button2.addActionListener(basic_btn_action);
		
		add(button1);
		add(button2);
		add(button3);
		
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(1000, 100);
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new S02_JButton();
		
	}

}















