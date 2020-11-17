package quiz;

import java.util.Random;

public class B12_tempPassword {

	public static void main(String[] args) {
		
		/*
		 랜덤 4자리의 임시 비밀번호 문자열을 생성하는 프로그램을 만들어보세요
		 비밀번호를 구성하는 문자 - 알파벳 대문자(65 - 90), 숫자
		 */
		
		// 1.
//		System.out.print("비밀번호 생성 -> ");
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
		
		
		
//		 3. boolean 활용
		Random ran = new Random();
		StringBuilder temp_password = new StringBuilder();
		String charset = "ABCDEFGHIJKLMNOPQRSTUVWxYZ0123456789";
		
		for (int i = 0; i < 4; i++) {
			char ch;
		
//		# int category = ran.nextInt(3); - > 카테고리 추가 방식도 가능
		
			// true일떄 영어를 추가, 아니면 숫자 추가
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


















