package quiz;

import java.util.Random;

public class B12_tempPassword {

	public static void main(String[] args) {
		
		/*
		 ���� 4�ڸ��� �ӽ� ��й�ȣ ���ڿ��� �����ϴ� ���α׷��� ��������
		 ��й�ȣ�� �����ϴ� ���� - ���ĺ� �빮��(65 - 90), ����
		 */
		
		// 1.
//		System.out.print("��й�ȣ ���� -> ");
//		for (int i = 0; i <= 3; i++) {
//			int pass = (int) (Math.random() * 2);
//			if (pass == 1) {
//				System.out.print((int) (Math.random() * 10));
//			} else if (pass == 0) {
//				System.out.print((char) (Math.random() * 26 + 65));
//			}
//		}
		
		
		
		// 2.
//		Random ran = new Random();
//		StringBuilder temp_password = new StringBuilder();
//		String charset = "ABCDEFGHIJKLMNOPQRSTUVWxYZ0123456789";
//		
//		for (int i = 0; i < 4; i++) {
//			char ch = charset.charAt(ran.nextInt(charset.length()));
//			temp_password.append(ch);
//		}
//		System.out.println(temp_password);
		
		
		
//		 3. boolean Ȱ��
		Random ran = new Random();
		StringBuilder temp_password = new StringBuilder();
		String charset = "ABCDEFGHIJKLMNOPQRSTUVWxYZ0123456789";
		
		for (int i = 0; i < 4; i++) {
			char ch;
		
//		# int category = ran.nextInt(3); - > ī�װ� �߰� ��ĵ� ����
		
			// true�ϋ� ��� �߰�, �ƴϸ� ���� �߰�
			if (ran.nextBoolean()) {
				ch = charset.charAt(ran.nextInt(26) + 'A');
			} else {
				ch = (char) (ran.nextInt(10) + '0');
			}
			temp_password.append(ch);
		}
		System.out.println(temp_password);
		
		
		
		
	}
}


















