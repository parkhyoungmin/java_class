package quiz;

import java.util.Scanner;

public class B04_appleQuiz {

	public static void main(String[] args) {
		
		/* 
		 사과를 10개씩 담을 수 있는 바구니가 있다
		 사용자가 사과의 개수를 입력하면 사과를 모두 담기위해 필요한
		 바구니의 개수를 출력해보세요
		*/
		
		// 변수 앞에 final : 수정이 불가능한 변수가 된다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과 갯수 입력 > " );
		int apple = sc.nextInt();
		
		if (apple > 0) {
			if (apple % 10 == 0) {
				int A_basket = apple / 10;
				System.out.printf("%d개의 바구니가 필요합니다.", A_basket);
			} else if (apple % 10 != 0) {
				int B_basket = (apple / 10) + 1;
				System.out.printf("%d개의 바구니가 필요합니다.", B_basket);
			}
			// (int) Math.ceil(사과갯수 / 바구니)
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		
		
		sc.close();
	}

}













