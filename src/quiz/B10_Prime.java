package quiz;

import java.util.Scanner;

public class B10_Prime {

	public static void main(String[] args) {
	/*
	 사용자로부터 숫자를 입력받으면 1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력해보세요
	 ※ 소수 : 약수가 1과 자기자신 밖에 없는 숫자
	 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력 -> ");
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
		
		
		
//		// i :소수인지 테스트 해볼 숫자
//		for (int i = 2; i <= num; i++) {
//			int cnt = 0;
//			// j: 1부터 i까지 한번씩 다 나눠볼 숫자
//			for (int j = 1; j <= i; j++) {
//				if (i % j == 0) {
//					cnt++;
//				}
//			}
//			if (cnt == 2) {
//				System.out.print(" " + i);
//			}
//		}
		
		
		
//				// i :소수인지 테스트 해볼 숫자
//				for (int i = 2; i <= num; i++) {
//					int cnt = 0;
//					// j: 1부터 i까지 한번씩 다 나눠볼 숫자
//					for (int j = 2; j < i; j++) {
//						if (i % j == 0) {
//							cnt++;
//						}
//					}
//					if (cnt == 0) {
//						System.out.print(" " + i);
//					}
//				}
		
		
				
				// i :소수인지 테스트 해볼 숫자
				for (int i = 2; i <= num; i++) {
					int cnt = 0;
					// j: 1부터 i까지 한번씩 다 나눠볼 숫자
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


