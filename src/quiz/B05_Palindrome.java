package quiz;

import java.util.Scanner;

public class B05_Palindrome {

	public static void main(String[] args) {
		
		/*
		 ����ڷκ��� �ܾ �ϳ� �Է¹ް�
		 �ش� �ܾ ȸ���̶�� "PALINDROME"�� ���
		 ȸ���� �ƴ϶�� "NOT PALINDROME"�� ����غ�����
		 
		 �� ABBA, MADAM, BORROWORROB ó�� �¿��Ī�� �ܾ ȸ���̶�� �Ѵ�
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ܾ �Է����ּ���(����� �Է����ּ���) >");
		String word = sc.nextLine();
		
//		if (pal.length() % 2 == 0) {
//			for (int i = 0; 0 <= pal.length(); i++) {
//				if (pal.charAt(i) == pal.charAt(pal.length()-1)) {
//					System.out.println("PALINDROME");
//				} else {
//					System.out.println("NOT PALINDROME");
//				}
//			}
//		} 
//		else {
//			for (int i = 0; ((pal.length() / 2) + 1) <= pal.length(); i++) {
//				if (pal.charAt(i) == pal.charAt(pal.length()-1)) {
//					System.out.println("PALINDROME");
//				} else {
//					System.out.println("NOT PALINDROME");
//				}
//			}
//		}
		
		// 1.
		
//		boolean palin = true;
//		
//		for(int i = 0, len = word.length(); 0 <= len / 2; i++) {
//			
//			char ch1 = word.charAt(i);
//			char ch2 = word.charAt(len - 1 - i);
//			
//			if (ch1 != ch2) {
//				palin = false;
//				break;
//			}
//		}
//		
//		if (palin) {
//			System.out.println("PALINDROME");
//		} else {
//			System.out.println("NOT PALINDROME");
//		}
		
		
		
		// 2.
		// # StringBuilder.reverse()
		// ���±��� ������ ���ڿ��� �������ش�
		StringBuilder str = new StringBuilder(word);
		String reverse = str.reverse().toString();
		
		int half = word.length() / 2;
		
		boolean palin = true;
		
		for (int i = 0; i < half; i++) {
			if (word.charAt(i) != reverse.charAt(i)) {
				palin = false;
				break;
			}
		}
		System.out.println(palin ? "PALINDROME" : "NOT PALINDROME");
		
		
		
		
	}
}







