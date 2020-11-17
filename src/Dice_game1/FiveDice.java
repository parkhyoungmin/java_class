package Dice_game1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class FiveDice {

	private Random ran;
	private List<Integer> dices; // 5개의 주사위 눈이 저장될 리스트
	private List<Integer> counts; // 각 숫자가 몇번 씩 등장했는지 세어 볼 리스트
	
	private String made;
	
//	private List<Integer> store_dices; // 저장해둘 주사위
	
	private static int NUM_OF_DICE = 5;
	private static int DICE_FACET = 6;
	
	private final static Set<Set<Integer>> LARGE_CASES; //12345 23456
	private final static Set<Set<Integer>> SMALL_CASES; //1234 2345 3456
	
	static {
		LARGE_CASES = new HashSet<Set<Integer>>();
		
		for (int i = 1; i <= 2; i++) {
			Set<Integer> large = new HashSet<Integer>(4);
			Collections.addAll(large, i, i+1, i+2, i+3, i+4);
			LARGE_CASES.add(large);
		}
		
		SMALL_CASES = new HashSet<Set<Integer>>();
		
		for (int i = 1; i <= 3; i++) {
			Set<Integer> small = new HashSet<Integer>(4);
			Collections.addAll(small, i, i+1, i+2, i+3);
			SMALL_CASES.add(small);
		}
	}
	
	public FiveDice() {
		ran = new Random();
		made = "UNCHECKED";
		
		// 주사위는 5개 이상으로 늘어나지 않기 때문에 컬렉션 용량을 5로 설정한다
		// ※ ArrayList는 초기 용량이 가득 차게되면 알아서 용량을 1.5배씩 증가시킨다
		dices = new ArrayList<>(NUM_OF_DICE);
		counts = new ArrayList<>(DICE_FACET);
		Collections.addAll(dices, 0, 0, 0, 0, 0);
		Collections.addAll(counts, 0, 0, 0, 0, 0, 0);
	}
	
	private void count() {
		for (int i = 0; i < DICE_FACET; i++) {
			int dice_num = i + 1;
			
			counts.set(i, Collections.frequency(dices, dice_num)); // dices안에 숫자들 횟수를 계산
		}
	}
	
	private String check() {
		// check by counts
		if (counts.contains(5)) {
			return "YACHU";
		} else if (counts.contains(4)) {
			return "FOUR DICE";
		} else if (counts.contains(2) && counts.contains(3)) {
			return "FULL HOUSE";
		}
		
		// check by dices
		for (Set<Integer> ls : LARGE_CASES) {
			if (dices.containsAll(ls)) {
				return "LARGE STRAIGHT";
			}
		}
		
		for (Set<Integer> ss : SMALL_CASES) {
			if (dices.containsAll(ss)) {
				return "SMALL STRAIGHT";
			}
		}
		return "NO MATCHES";
	}
	
	public void roll() {
		made = "UNCHECKED";
		
		for (int i = 0; i < NUM_OF_DICE; i++) {
			dices.set(i, ran.nextInt(DICE_FACET) + 1);
		}
		count();
		
		System.out.println(dices + " : ");
		System.out.println(check());
	}
	
	
	public void print() {
		System.out.println(dices + " : ");
		
		if (made.equals("UNCHECKED")) {
			made = check();
		}
		System.out.println(made);
	}
	
	
	public void reroll(Set<Integer> rerolls) { // 여기서 목록을 만들려고 하면 힘들다, 기능들은 분리해서 만들기
		
		if (rerolls.size() == 0) {
			System.out.println("NOTHING CHANGES");
			return;
		}
		
		made = "UNCHECKED";
		
		for (int i : rerolls) {
			int to_change = dices.set(i - 1, ran.nextInt(DICE_FACET) + 1);
			dices.set(i - 1, to_change);
			System.out.printf("DICE %d HAS CHANGED : %d", to_change);
		}
		count();
		System.out.println(dices + " : ");
		System.out.println(check());
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		FiveDice dice01 = new FiveDice();
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			dice01.roll();
			System.out.print("바꿀 주사위 -> ");
			
			Set<Integer> rerolls = new HashSet<Integer>();
			int i = -1;
			while ((i = sc.nextInt()) != -1) {
				rerolls.add(i);
			}
			System.out.println("다시 굴릴 인덱스 : " + rerolls);
			dice01.reroll(rerolls);
			
			Thread.sleep(2000); // Exception
		}
	}

}









