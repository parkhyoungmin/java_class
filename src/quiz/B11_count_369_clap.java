package quiz;

import java.util.Scanner;

public class B11_count_369_clap {

	public static void main(String[] args) {
		
		// # ���α׷� ����ð� ����
//		long start_time = System.currentTimeMillis();
		
		/*
		 ����ڷκ��� ���� �ϳ��� �Է¹ް�
		 �ش� ���ڱ��� 369������ ����ȴٸ� �ڼ��� �� ��� �ľ��ϴ��� �������
		 */
		
		// 3 6 9 13 16 19 23 26 29 30 31 32 33 -> 14�� 34 35 36 -> 18�� 37 38 39 -> 22��
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է�-> ");
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
//		System.out.println("�ɸ� �ð� : " + (end_time - start_time)); // �и����� 
		
		
		// # ���ڿ��� ����ϴ� ���
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
//						System.out.print("¦");
//					}
//				}
//				check /= 10;
//			}
//			if (debugMode) {
//				System.out.println();
//			}
//		}
//		System.out.println(clap + "ȸ");
		
		
		
		
		
		
		

	}
}


















