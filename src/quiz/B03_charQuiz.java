package quiz;

import java.util.Scanner;

public class B03_charQuiz {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		// 1. char�� ���� a�� 'q' �Ǵ� 'Q'�� �� true
		System.out.print("1. ");
		char a = 'q';
//		System.out.print("1. �ܾ��Է� > ");
//		char a = sc.next().charAt(0);
		System.out.println(a == 'q' || a == 'Q');
		
		
		
		// 2. char�� ���� b�� �����̳� ���� �ƴ� �� true
		System.out.print("2. ");
		char b = '5';
//		System.out.print("2. �ܾ��Է� > ");
//		char b = sc.next().charAt(0);
		System.out.println((int) b != (int) 32 && (int) b != (int) 9);
		
//		System.out.println(b != '\t' && b != ' ');
		
		
		
		
		//3. char�� ���� c�� ����('0' ~ '9')�� �� true
		System.out.print("3. ");
		char c = '5';
//		System.out.print("3. �ܾ��Է� > ");
//		char c = sc.next().charAt(0);
		System.out.println((int) c >= (int) '0' && (int) c <= (int) '9');
		
//		System.out.println(c >= '0' && c <= '9');
		
		
		
		//4. char�� ���� d�� ������(�빮�� �Ǵ� �ҹ���)�� �� true
		System.out.print("4. ");
		char d = 's';
//		System.out.print("4. �ܾ��Է� > ");
//		char d = sc.next().charAt(0);
		System.out.println((int) d >= (int) 'A' && (int) d <= (int) 'z');
		
//		System.out.println((d >= 'A' && d <= 'Z') || (d >= 'a' && d <= 'z'));
		
		
		//5. char�� ���� e�� �ѱ��� �� true
		System.out.print("5. ");
		char e = 'f';
//		System.out.print("5. �ܾ��Է� > ");
//		char e = sc.next().charAt(0);
		System.out.println((int) e >= (int) '��' && (int) e <= (int) '�R'
				|| (int) e >= (int) '��' && (int) e <= (int) '��');
		
//		System.out.println((e >= 0xAC00 && e <= 0xD7A3) || 
//				(e >= 0x1100 && e <= 0x11FF));
		
		// Hangul Jamo 0x1100 ~ 0x11FF
		// Hangul syllables 0xAC00 ~ 0xD7A3
		
		
		//6. char�� ���� f�� �Ϻ����϶� true
		System.out.print("6. ");
		char f = 'd';
//		System.out.print("6. �ܾ��Է� > ");
//		char f = sc.next().charAt(0);
		System.out.println((int) f >= (int) '��' && (int) f <= (int) '��');
		
		System.out.println((f >= 0x3041 && f <= 0x3093) || 
				(f >= 0x30A0 && f <= 0x30FF));

	}

}
