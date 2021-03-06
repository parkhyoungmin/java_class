package quiz;

import java.util.Scanner;

public class B03_charQuiz {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		// 1. char형 변수 a가 'q' 또는 'Q'일 때 true
		System.out.print("1. ");
		char a = 'q';
//		System.out.print("1. 단어입력 > ");
//		char a = sc.next().charAt(0);
		System.out.println(a == 'q' || a == 'Q');
		
		
		
		// 2. char형 변수 b가 공백이나 탭이 아닐 때 true
		System.out.print("2. ");
		char b = '5';
//		System.out.print("2. 단어입력 > ");
//		char b = sc.next().charAt(0);
		System.out.println((int) b != (int) 32 && (int) b != (int) 9);
		
//		System.out.println(b != '\t' && b != ' ');
		
		
		
		
		//3. char형 변수 c가 문자('0' ~ '9')일 때 true
		System.out.print("3. ");
		char c = '5';
//		System.out.print("3. 단어입력 > ");
//		char c = sc.next().charAt(0);
		System.out.println((int) c >= (int) '0' && (int) c <= (int) '9');
		
//		System.out.println(c >= '0' && c <= '9');
		
		
		
		//4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
		System.out.print("4. ");
		char d = 's';
//		System.out.print("4. 단어입력 > ");
//		char d = sc.next().charAt(0);
		System.out.println((int) d >= (int) 'A' && (int) d <= (int) 'z');
		
//		System.out.println((d >= 'A' && d <= 'Z') || (d >= 'a' && d <= 'z'));
		
		
		//5. char형 변수 e가 한글일 때 true
		System.out.print("5. ");
		char e = 'f';
//		System.out.print("5. 단어입력 > ");
//		char e = sc.next().charAt(0);
		System.out.println((int) e >= (int) '가' && (int) e <= (int) '힣'
				|| (int) e >= (int) 'ㄱ' && (int) e <= (int) 'ㆌ');
		
//		System.out.println((e >= 0xAC00 && e <= 0xD7A3) || 
//				(e >= 0x1100 && e <= 0x11FF));
		
		// Hangul Jamo 0x1100 ~ 0x11FF
		// Hangul syllables 0xAC00 ~ 0xD7A3
		
		
		//6. char형 변수 f가 일본어일때 true
		System.out.print("6. ");
		char f = 'd';
//		System.out.print("6. 단어입력 > ");
//		char f = sc.next().charAt(0);
		System.out.println((int) f >= (int) 'ぁ' && (int) f <= (int) 'ヶ');
		
		System.out.println((f >= 0x3041 && f <= 0x3093) || 
				(f >= 0x30A0 && f <= 0x30FF));

	}

}
