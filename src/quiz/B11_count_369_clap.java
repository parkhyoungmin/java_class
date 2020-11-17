package quiz;

import java.util.Scanner;

public class B11_count_369_clap {

	public static void main(String[] args) {
		
		// # 프로그램 실행시간 측정
//		long start_time = System.currentTimeMillis();
		
		/*
		 사용자로부터 정수 하나를 입력받고
		 해단 숫자까지 369게임이 진행된다면 박수를 총 몇번 쳐야하는지 세어보세요
		 */
		
		// 3 6 9 13 16 19 23 26 29 30 31 32 33 -> 14번 34 35 36 -> 18번 37 38 39 -> 22번
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력-> ");
		int num = sc.nextInt();
		
//		int user = 333;
		
		int game = 1;
		int clap = 0;
		
		while (game <= num) {
			int i = game;
			while (i > 0) {
				if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
					clap++;
				}
				i /= 10;
			}
			game++;
		}
		System.out.printf("%d\n", clap);
		
	
//		long end_time = System.currentTimeMillis();
//		
//		System.out.println("걸린 시간 : " + (end_time - start_time)); // 밀리세컨 
		
		
		// # 문자열을 사용하는 방법
//		for (int i = 1; i <= user; ++i) {
//			String check = "" + i;
//			int len = check.length();
//			
//			for (int j = 0; j < len; ++j) {
//				if (check.charAt(j) % 3 == 0 || check.charAt(j) % 6 == 0 || check.charAt(j) % 9 == 0) {
//					++clap;
//				}
//			}
//		}
		
		
		
		//# debugMode 
//		boolean debugMode = true;
//		
//		for (int i = 1; i <= user; ++i) {
//			int check = i;
//			
//			System.out.printf("%d : ", i);
//			
//			while (check != 0) {
//				int digit = check % 10;
//				
//				if (digit % 3 == 0 && digit != 0) {
//					clap++;
//					if (debugMode) {
//						System.out.print("짝");
//					}
//				}
//				check /= 10;
//			}
//			if (debugMode) {
//				System.out.println();
//			}
//		}
//		System.out.println(clap + "회");
		
		
		
		
		
		
		

	}
}


















