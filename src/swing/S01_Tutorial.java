package swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S01_Tutorial {

	/*
	 # Swing
	 - Java�� ������ ���α׷��� ����� �ִ� API
	 */
	
	/*
	 # �����̳�
	 - ������Ʈ�� �߰��ϴ� ��
	 - Frame, Panel, JDialog .. ��
	 - �����̳ʸ��� ���̾ƿ��� ������ �� �ִ�
	 */
	
	/*
	 # ������Ʈ
	 - �����̳ʿ� �߰��ϴ� ��ǰ��
	 - JButton, JTable, JSilder, JMenu ..��
	 */
	
	public static void main(String[] args) {
		
		/*
		 # JFrame
		 - �پ��� ������Ʈ���� �߰��� �� �ִ� �����̳� �� �ϳ�
		 */
		
		/*
		 # JButton
		 - ��ư ������Ʈ
		 - ������ �����Ѵ�
		 */
		
		JFrame frame = new JFrame("����!");
//		JButton b = new JButton("CLICK!");
		
		JButton b = new KakaoButton(KakaoBtnEnum.CAMERA, 80);
		
		b.setLocation(100, 100);
		
		/*
		 JButton���� setsize(int, int)�ۿ� ���
		 JButton�� ��ӹ��� �ڽ� Ŭ�������� setSize(int)�� �߰��ϴ����
		 ��ĳ�����ؼ� ����ϸ� �������� �ȴ�
		 b.setSize(150);
		 */
//		b.setBounds(100, 100, 200, 150);
		
		frame.add(b);
		
		// frame�� �⺻������ �����Ǿ��ִ� ���̾ƿ��� �����Ѵ�
		frame.setLayout(null);
		
		// �ش� �������� x��ư�� ������ ���� ������ �����Ѵ�
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ������ũ�� ����
		frame.setSize(500, 500);
		
		// �������� ���̰� ���� (ȸ�鿡 �׸���)
		// �� GUIȯ�濡���� ȭ�鿡 ��ȭ�� ������� ���� ���� ȭ���� �ٽ� �׷��� �Ѵ�.
		frame.setVisible(true);
		
	}

}











