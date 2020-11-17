package quiz;

import java.util.Scanner;

public class B03_charQuiz {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		// 1. charÇü º¯¼ö a°¡ 'q' ¶Ç´Â 'Q'ÀÏ ¶§ true
		System.out.print("1. ");
		char a = 'q';
//		System.out.print("1. ´Ü¾îÀÔ·Â > ");
//		char a = sc.next().charAt(0);
		System.out.println(a == 'q' || a == 'Q');
		
		
		
		// 2. charÇü º¯¼ö b°¡ °ø¹éÀÌ³ª ÅÇÀÌ ¾Æ´Ò ¶§ true
		System.out.print("2. ");
		char b = '5';
//		System.out.print("2. ´Ü¾îÀÔ·Â > ");
//		char b = sc.next().charAt(0);
		System.out.println((int) b != (int) 32 && (int) b != (int) 9);
		
//		System.out.println(b != '\t' && b != ' ');
		
		
		
		
		//3. charÇü º¯¼ö c°¡ ¹®ÀÚ('0' ~ '9')ÀÏ ¶§ true
		System.out.print("3. ");
		char c = '5';
//		System.out.print("3. ´Ü¾îÀÔ·Â > ");
//		char c = sc.next().charAt(0);
		System.out.println((int) c >= (int) '0' && (int) c <= (int) '9');
		
//		System.out.println(c >= '0' && c <= '9');
		
		
		
		//4. charÇü º¯¼ö d°¡ ¿µ¹®ÀÚ(´ë¹®ÀÚ ¶Ç´Â ¼Ò¹®ÀÚ)ÀÏ ¶§ true
		System.out.print("4. ");
		char d = 's';
//		System.out.print("4. ´Ü¾îÀÔ·Â > ");
//		char d = sc.next().charAt(0);
		System.out.println((int) d >= (int) 'A' && (int) d <= (int) 'z');
		
//		System.out.println((d >= 'A' && d <= 'Z') || (d >= 'a' && d <= 'z'));
		
		
		//5. charÇü º¯¼ö e°¡ ÇÑ±ÛÀÏ ¶§ true
		System.out.print("5. ");
		char e = 'f';
//		System.out.print("5. ´Ü¾îÀÔ·Â > ");
//		char e = sc.next().charAt(0);
		System.out.println((int) e >= (int) '°¡' && (int) e <= (int) 'ÆR'
				|| (int) e >= (int) '¤¡' && (int) e <= (int) '¤ü');
		
//		System.out.println((e >= 0xAC00 && e <= 0xD7A3) || 
//				(e >= 0x1100 && e <= 0x11FF));
		
		// Hangul Jamo 0x1100 ~ 0x11FF
		// Hangul syllables 0xAC00 ~ 0xD7A3
		
		
		//6. charÇü º¯¼ö f°¡ ÀÏº»¾îÀÏ¶§ true
		System.out.print("6. ");
		char f = 'd';
//		System.out.print("6. ´Ü¾îÀÔ·Â > ");
//		char f = sc.next().charAt(0);
		System.out.println((int) f >= (int) 'ª¡' && (int) f <= (int) '«ö');
		
		System.out.println((f >= 0x3041 && f <= 0x3093) || 
				(f >= 0x30A0 && f <= 0x30FF));

	}

}
