package quiz;

import java.util.Scanner;

public class B10_Prime {

	public static void main(String[] args) {
	/*
	 ����ڷκ��� ���ڸ� �Է¹����� 1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����غ�����
	 �� �Ҽ� : ����� 1�� �ڱ��ڽ� �ۿ� ���� ����
	 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Է� -> ");
		int num = sc.nextInt();
		
		
		
//		for (int i = 2; i <= num; i++) { 
//			int cnt = 0;
//			for (int j = 1; j <= i; j++) { 
//				if (i % j == 0) {
//					cnt++;
//				}
//			}
//			if (cnt == 2) {
//				System.out.println(i);
//			}
//		}
		
		
		
//		// i :�Ҽ����� �׽�Ʈ �غ� ����
//		for (int i = 2; i <= num; i++) {
//			int cnt = 0;
//			// j: 1���� i���� �ѹ��� �� ������ ����
//			for (int j = 1; j <= i; j++) {
//				if (i % j == 0) {
//					cnt++;
//				}
//			}
//			if (cnt == 2) {
//				System.out.print(" " + i);
//			}
//		}
		
		
		
//				// i :�Ҽ����� �׽�Ʈ �غ� ����
//				for (int i = 2; i <= num; i++) {
//					int cnt = 0;
//					// j: 1���� i���� �ѹ��� �� ������ ����
//					for (int j = 2; j < i; j++) {
//						if (i % j == 0) {
//							cnt++;
//						}
//					}
//					if (cnt == 0) {
//						System.out.print(" " + i);
//					}
//				}
		
		
				
				// i :�Ҽ����� �׽�Ʈ �غ� ����
				for (int i = 2; i <= num; i++) {
					int cnt = 0;
					// j: 1���� i���� �ѹ��� �� ������ ����
					int sqrt = (int) Math.sqrt(i);
					for (int j = 2; j <= sqrt; j++) {
						if (i % j == 0) {
							cnt++;
						}
					}
					if (cnt == 0) {
						System.out.print(" " + i);
					}
				}
		
	
		
		
	}
}


