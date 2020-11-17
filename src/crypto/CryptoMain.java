package crypto;

import java.util.Scanner;

/*
사용자가 메세지와 키값을 설정하여 원하는 암호 알고림즘으로
암호화/복호화 작업을 할 수 있는 프로그램을 만들어보세요
*/

public class CryptoMain {
	
	public static void main(String[] args) {
		
		String user_input = "Caesar";
		int user_input_key = 8;
		
		// 상속은 여러 클래스를 일반화(업캐스팅) 시키는 용도로 주로 많이 사용한다
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
			System.out.println("1. 입력");
			System.out.println("종료");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.print("키값입력: ");
				int key = sc.nextInt();
				Caesar caesar_key = new Caesar(key);
				break;
			case 2:
				System.out.print("입력: ");
				String message = sc.nextLine();
//			case 3:
//				String code = caesar_key.encryption(message);
//				System.out.println("암호화 된 메세지 : " + code);
//			case 4:
//				System.out.println("원래 메세지 : " + caesar_key.decryption(code));
			default:
				System.exit(0);
				break;
			}
		}
	}
	
	
	
	
	
}











