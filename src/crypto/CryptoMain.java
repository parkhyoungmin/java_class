package crypto;

import java.util.Scanner;

/*
����ڰ� �޼����� Ű���� �����Ͽ� ���ϴ� ��ȣ �˰�������
��ȣȭ/��ȣȭ �۾��� �� �� �ִ� ���α׷��� ��������
*/

public class CryptoMain {
	
	public static void main(String[] args) {
		
		String user_input = "Caesar";
		int user_input_key = 8;
		
		// ����� ���� Ŭ������ �Ϲ�ȭ(��ĳ����) ��Ű�� �뵵�� �ַ� ���� ����Ѵ�
		Cipher cipher = null;
		
		if (user_input.equals("Caesar")) {
			cipher = new Caesar(user_input_key);
		} else if (user_input.equals("TranspositionCipher")) {
			cipher = new TranspositionCipher(user_input_key);
		}
		
		String result = cipher.encryption("adfs gdh gfs gdf");
		
		System.out.println(result);
		
		
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("1. �Է�");
			System.out.println("����");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.print("Ű���Է�: ");
				int key = sc.nextInt();
				Caesar caesar_key = new Caesar(key);
				break;
			case 2:
				System.out.print("�Է�: ");
				String message = sc.nextLine();
//			case 3:
//				String code = caesar_key.encryption(message);
//				System.out.println("��ȣȭ �� �޼��� : " + code);
//			case 4:
//				System.out.println("���� �޼��� : " + caesar_key.decryption(code));
			default:
				System.exit(0);
				break;
			}
		}
	}
	
	
	
	
	
}











