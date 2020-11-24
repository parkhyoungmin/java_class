package jdbc.quiz;

import java.util.Random;

public class RandomString {
	
	static char[] chars;
	
	static {
		StringBuilder str = new StringBuilder();
		
		for (char ch = '0'; ch <= '9'; ch++) {
			str.append(ch);
		}
		chars = str.toString().toCharArray();
	}
	
	
	public static String random_plate(int len) {
		StringBuilder str = new StringBuilder();
		Random ran = new Random();
		
		for (int i = 0; i < len; i++) {
			str.append(chars[ran.nextInt(chars.length)]);
		}
		return str.toString();
	}
	
	// 테스트용
	public static void main(String[] args) {
		System.out.println(random_plate(3));
	}
	
}

















