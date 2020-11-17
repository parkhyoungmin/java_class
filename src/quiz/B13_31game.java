package quiz;

import java.util.Random;
import java.util.Scanner;

public class B13_31game {

	public static void main(String[] args) {
		
		/*
		 # 31게임을 만들어보세요
		  1. 컴퓨터와 사람이 번갈아가면서 숫자를 선택한다 (1, 2, 3)
		  2. 컴퓨터는 랜덤으로 숫자를 선택한다
		  3. 마지막에 31을 부르는 사람 혹은 컴퓨터가 패배한다
		  예) 컴퓨터 > 2
		  		현재숫자 : 2
		     사람 > 3
		  		현재숫자 : 5
		 */

		Scanner user = new Scanner(System.in); // 초기화 부분
		Random ran = new Random();
		
		int game_num = 0;
		
		boolean computer_turn = ran.nextBoolean();
		
		System.out.printf("<%s>의 선공입니다!\n", computer_turn ? "컴퓨터" : "사람");
		
		while (true) {
			// 입력 부분
			int num;
			if (computer_turn) {
				num = ran.nextInt(3) + 1;
				System.out.println("컴퓨터 > " + num);
			} else { // 사용자가
				System.out.print("사람 >");
				num = user.nextInt();
				if (num > 3 || num < 1) {
					System.out.println("1 ~ 3만 입력하셔야 합니다.");
					continue;
				}
			}
			// 처리 부분
			game_num += num;
			// 출력 부분
			if (game_num >= 31) {
				break;
			}
			System.out.println("\t현재 상황: " + game_num);			
			computer_turn = !computer_turn;
		}
		System.out.printf("<%s>의 승리!\n", computer_turn ? "인간" : "컴퓨터");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}



















