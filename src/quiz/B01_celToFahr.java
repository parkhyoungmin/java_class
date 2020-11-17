package quiz;

import java.util.Scanner;

public class B01_celToFahr {

	public static void main(String[] args) {
	
		/*
		 사용자로부터 섭씨 온도를 입력받으면
		 화씨 온도로 변환하여 출력해주는 프로그램을 만들어보세요
		 변환공식은 알아서 검색, 출력은 소수 첫째 자리까지
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("섭씨 온도 입력: ");
		double celsius = sc.nextDouble();
		System.out.printf("섭씨 온도: %.1f℃\n", celsius);
		
		double fahrenheit = (celsius * 1.8) + 32;
		System.out.printf("화씨 온도: %.1f℉\n", fahrenheit);
		
		// sc를 다시 사용하지 않을 예정이기 때문에 따로 저장하지 않는다
//		System.out.print("오늘의 온도 > ");
//		int cel = new Scanner(System.in).nextInt();
//		double fahr = (new Scanner(System.in).nextDouble() * 1.8) + 32;
		
		

	}

}















