package quiz;

import java.util.Scanner;

public class B01_wonToDollar {

	public static void main(String[] args) {
		
		/*
		 한국 돈을 입력하면
		 달러 구매시 얼마를 받게 되는지 계산해주는 프로그램을 만들어보세요
		 환율은 검색, 소수 둘쨰 자리까지 출력, 환전 수수료 1.75%
		 */
		
//		int won = new Scanner(System.in).nextInt();50
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("달러 환전(수수료 1.75%적용)");
		System.out.print("금액 입력: ");
		int won = sc.nextInt();
		System.out.printf("%d￦\n", won);
		double realWon = won - ((won/100) * 1.75);
		double doller = (realWon * 0.00088);
		System.out.printf("%.2f＄로 환전 완료\n", doller);

	}

}




