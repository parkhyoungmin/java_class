package quiz;

public class B13_count_letter_case {

	public static void main(String[] args) {
		
		/*
		 ����ڷκ��� ������ �ϳ� �Է¹޾Ҵ� ġ��
		 �ش� ���忡 � ���ڰ� ��� ���� �ߴµ� ��� ����غ�����
		 (�빮��, �ҹ���, ���ڸ� ����˴ϴ�.)
		 */
		
		String msg = "Hello, Aorld! 123";
		
		int[] u_eng = new int[26];
		int[] l_eng = new int[26];
		int[] number = new int[10];
		
		// �빮��
		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				u_eng[ch - 'A'] += 1;
			}
		}
		for (int e = 0; e < 26; e++) {
			if (u_eng[e] > 0) {
				System.out.printf("%c�빮�� : %d��\n", e + 'A', u_eng[e]);
			}
		}
		
		// �ҹ���
		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				l_eng[ch - 'a'] += 1;
			}
		}
		for (int e = 0; e < 26; e++) {
			if (l_eng[e] > 0) {
				System.out.printf("%c�ҹ��� : %d��\n", e + 'a', l_eng[e]);
			}
		}
		
		// ����
		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			if (ch >= '0' && ch <= '9') {
				number[ch - '0'] += 1;
			}
		}
		for (int m = 0; m < 10; m++) {
			if (number[m] > 0) {
				System.out.printf("%c���� : %d��\n", m + '0', number[m]);
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
		
		// # 2���� �迭�� �ݺ������� ��ȸ�ϱ�
		for (int i = 0; i < u_eng.length; i++) {
			if (u_eng[i] > 0) {
				System.out.printf(" %c�� : %d��", i + 'A', u_eng[i]);
			}
		}
		for (int i = 0; i < l_eng.length; i++) {
			if (l_eng[i] > 0) {
				System.out.printf(" %c�� : %d��", i + 'a', l_eng[i]);
			}
		}
		for (int i = 0; i < number.length; i++) {
			if (number[i] > 0) {
				System.out.printf(" %c�� : %d��", i + '0', number[i]);
			}
		}
		
		
		
		
		
		
		

	}
}












