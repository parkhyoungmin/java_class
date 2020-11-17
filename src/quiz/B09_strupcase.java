package quiz;

import java.util.Scanner;

public class B09_strupcase {

	public static void main(String[] args) {
		
		/*
		 입력받은 문자열의 모든 알파벳을 대문자로 만들어보세요
		 ※ 원본이 훼손되지 않고, 새로운 문자열이 생성되어야 함
		 */
		
//		System.out.println("abc".toUpperCase()); -> 쓰지 않고
//		System.out.println("ABC".toLowerCase());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 -> ");
		String num = sc.nextLine();
		
		StringBuilder str = new StringBuilder();
		
		System.out.print("수정 후 문장 -> ");
		for (int i = 0; i <= num.length()-1; i++) {
			char ch = num.charAt(i);
			
			if (ch >= 'a' && ch <= 'z' ) {
				// Math.abs 활용, 표
//				ch -= Math.abs('a' - 'A');  
//				ch -= Math.abs('A' - 'a');
				ch = (char)(ch - 'A' + 'a');
//				ch -= 32;
			}
			str.append(ch);
		}
		System.out.print(str);
		


		
	}

}














