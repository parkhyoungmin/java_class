package Dice_game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class D02_FiveDice {

	/*
	 랜덤으로 5개의 주사위를 굴린 다음에 (주사위의 눈은 1 ~ 6)
	 
	 풀하우스 (같은 숫자가 2개/3개)
	 스몰 스트레이트 (1234/2345/3456)
	 라지 스트레이트 (12345/23456)
	 4다이스 (같은 숫자가 4개)
	 야추 (같은 숫자가 5개)
	 
	 를 구분하는 클래스를 작성하고 테스트 해보세요
	 
	 ※ 다른 파일에 작성하고 여기서는 갖다 쓰기만 할것
	 */
	
	public static Object dice_game() {
		Random ran = new Random();
		
		Set<Integer> dice = new HashSet<Integer>();
		
		Collections.addAll(dice, 1, 2, 3, 4, 5, 6);
		Object[] dice_list = dice.toArray(); // 배열 변환
		
		return dice_list[ran.nextInt(6)]; //배열 랜덤 출력
	}

	
	public static void main(String[] args) {
		System.out.println("주사위 결과");
		for (int i = 1; i < 6; i++) {
			System.out.print(dice_game() + " ");
		}
		System.out.println();
	}


	static void dice_result() {
		
		
		
	}
	
	
	
	
	
}














