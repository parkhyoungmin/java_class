package quiz;

import java.util.Scanner;

public class B06_monthToSeason {

	public static void main(String[] args) {
		
		/*
		 switch-case문을 이용하여
		 사용자로부터 달을 입력 받으면 해당하는 계절을 출력해보세요
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달(월)을 입력해주세요 > ");
		int month = sc.nextInt();
		
		switch (month) {
		case 4 : case 5:
			System.out.println("약한 여름");
			break;
		case 6 : case 7 : case 8:
			System.out.println("걍 여름");
			break;
		case 9: case 10 : 
			System.out.println("약간 가을 ~ 약한 겨울");
			break;
		case 11 : case 12 : case 1 :case 2 : case 3:
			System.out.println("걍 겨울");
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
		} 
		
		
		
	}

}












