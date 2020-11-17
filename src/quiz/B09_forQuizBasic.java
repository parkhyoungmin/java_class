package quiz;

import java.util.Scanner;

public class B09_forQuizBasic {

	public static void main(String[] args) {
		
		/*
		 사용자가 숫자를 입력했을 때
		 1. 10부터 입력한 숫자까지의 총 합을 구해보세요
		 2. 1부터 입력한 숫자 사이의 3의 배수만 모두 출력하고
		 몇 개 있는지도 출력해보세요
		 */
		
		// 1. 10부터 입력한 숫자까지의 총 합을 구해보세요
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. ");
		System.out.print("숫자를 입력하세요 >");
		int num1 = sc.nextInt();
		int sum = 0;
			
		if (10 <= num1) {
			for (int i = 10; i <= num1; i++) {
				sum += i;
			}
			System.out.printf("10부터 %d까지의 합 > %d\n", num1, sum);
		} else if (num1 < 10) {
			for (int i = 10; num1 <= i; i--) {
				sum += i;
			}
			System.out.printf("10부터 %d까지의 합 > %d\n", num1, sum);
		}
		
//		int end = user # user값 보존을 위해
//		if (start > end) {
//			int temp = start; 10 10
//			start = end; -1 -1
//			end = temp; 10 10         start -1 end 10 temp 10
//		}
		
		System.out.println("-------------------------------------------------------");
		//2. 1부터 입력한 숫자 사이의 3의 배수만 모두 출력하고 몇 개 있는지도 출력해보세요
		System.out.println("2. ");
		
		System.out.print("숫자를 입력하세요 >");
		int num2 = sc.nextInt();
		
		int cnt = 0;
		
		if (0 <= num2) {
			for (int i = 0; i <= num2; i++) {
				if (i % 3 != 0)
					continue;
				cnt++;
				System.out.printf("%5d", i);
			}
			System.out.println("");
			System.out.printf("3의 배수 갯수: %d개\n", cnt);
		} else if (num2 <= 0) {
			for (int i = 0; num2 <= i; i--) {
				if (i % 3 != 0)
					continue;
				cnt++;
				System.out.printf("%5d", i);
			}
			System.out.println("");
			System.out.printf("3의 배수 갯수: %d개\n", cnt);
		}
		
		System.out.println("------------------------------------------------------");
		
		
		
		
		
	}

}










