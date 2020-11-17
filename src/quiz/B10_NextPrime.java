package quiz;

import java.util.Scanner;

public class B10_NextPrime {

	public static void main(String[] args) {
		
		/*
		 사용자로부터 숫자를 입력받으면
		 입력받은 수보다 더 크거나 같은 다음 소수를 찾아서 출력해보세요
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력 > ");
		int num = sc.nextInt();
		
		for (int i = num; ; i++) { 
			int cnt = 0;
			for (int j = 1; j <= i; j++) { 
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.print(i);
				break;
			}
		}
		
		
		

		
	}
}



