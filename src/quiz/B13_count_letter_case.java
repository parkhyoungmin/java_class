package quiz;

public class B13_count_letter_case {

	public static void main(String[] args) {
		
		/*
		 사용자로부터 문장을 하나 입력받았다 치고
		 해당 문장에 어떤 문자가 몇번 등자 했는디 세어서 출력해보세요
		 (대문자, 소문자, 숫자만 집계됩니다.)
		 */
		
		String msg = "Hello, Aorld! 123";
		
		int[] u_eng = new int[26];
		int[] l_eng = new int[26];
		int[] number = new int[10];
		
		// 대문자
		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				u_eng[ch - 'A'] += 1;
			}
		}
		for (int e = 0; e < 26; e++) {
			if (u_eng[e] > 0) {
				System.out.printf("%c대문자 : %d번\n", e + 'A', u_eng[e]);
			}
		}
		
		// 소문자
		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				l_eng[ch - 'a'] += 1;
			}
		}
		for (int e = 0; e < 26; e++) {
			if (l_eng[e] > 0) {
				System.out.printf("%c소문자 : %d번\n", e + 'a', l_eng[e]);
			}
		}
		
		// 숫자
		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			if (ch >= '0' && ch <= '9') {
				number[ch - '0'] += 1;
			}
		}
		for (int m = 0; m < 10; m++) {
			if (number[m] > 0) {
				System.out.printf("%c숫자 : %d번\n", m + '0', number[m]);
			}
		}
		
		
		
		
		
		/*
		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				u_eng[ch - 'A'] += 1;
			} else if (ch >= 'a' && ch <= 'z') {
				l_eng[ch - 'a'] += 1;
			} else if (ch >= '0' && ch <= '9') {
				number[ch - '0'] += 1;
			}
		*/
		
		int[][] count = {u_eng, l_eng, number};
		
		// # 2차원 배열을 반복문으로 조회하기
		for (int i = 0; i < u_eng.length; i++) {
			if (u_eng[i] > 0) {
				System.out.printf(" %c대 : %d번", i + 'A', u_eng[i]);
			}
		}
		for (int i = 0; i < l_eng.length; i++) {
			if (l_eng[i] > 0) {
				System.out.printf(" %c소 : %d번", i + 'a', l_eng[i]);
			}
		}
		for (int i = 0; i < number.length; i++) {
			if (number[i] > 0) {
				System.out.printf(" %c숫 : %d번", i + '0', number[i]);
			}
		}
		
		
		
		
		
		
		

	}
}












