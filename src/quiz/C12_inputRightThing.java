package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C12_inputRightThing {

	public static void main(String[] args) {
		
		/*
		 사용자로부터 int타입의 데이터를 출력해보세요
		 잘못된 타입의 데이터가 들어오더라도 프로그램이 종료되지 않아야 합니다.
		 (올바르게 int가 입력된 경우 프로그램이 종료됩니다.
		 */

		Scanner sc = new Scanner(System.in);
		
		
		
		while (true) {
			System.out.print("입력 > ");
			try {
				int num = sc.nextInt();
				break;
			} catch(InputMismatchException e) {
				System.out.println("에러 : " + e.getMessage());
				System.out.print("입력 > ");
				
			} catch(ArithmeticException e) {
				System.out.println("에러 : " + e.getMessage());
				System.out.print("입력 > ");
				
			}
		}
		
		// InputMismatchException -> int 아닐떄
		// ArithmeticException -> 0으로 나눌때
		
		
		
	}
}




