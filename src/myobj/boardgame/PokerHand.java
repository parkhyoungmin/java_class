package myobj.boardgame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import quiz.B13_31game;

public class PokerHand {
	
	private Random ran;
	
	private String[] shape = {"다이아", "하트", "스페이드", "클로버"};
	private String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
			"J", "Q", "K"};
	
	
	private List<Integer> number_count; // 숫자 몇번 나오는지
	private List<String> shape_count; // 문양 몇번 나오는지
	private List<Integer> com_card; // 컴퓨터카드 리스트
	private List<Integer> player_card; // 내카드 리스트
	
	private int[] deck;
	
	private int deck_num = 52;
//	private List<String> index;
	
	public static int game_index;
	/*
	 PokerHand 클래스를 구현해보세요
	 1. 다섯장의 PokerCard를 가지고 있어야 함
	 2. 다섯장의 PokerCard의 숫자/무늬를 통해 족보를 완성해야 함
	 3. 다른 PokerHand 인스턴스와 족보를 통한 크기비교가 가능해야 함
	 4. 다섯장 중 원하는 카드만 공개하는 기능이 있어야 함
	 5. 카드를 한장씩 추가하는 기능이 있어야 함
	 */

	public void count() { 
		for (int i = 0; i < deck_num; i++) {
			int card_num = i + 1;
			number_count.set(i, Collections.frequency(com_card, card_num));
			number_count.set(i, Collections.frequency(player_card, card_num));
		}
	}
	
	
	private String score_rule() {
		if (number_count.contains(5)) {
			return "Flush";
		}
		if (number_count.contains(4)) {
			return "Four Card";
		} 
		if (number_count.contains(3) && number_count.contains(2)) {
			return "Full House";
		}
		if (number_count.contains(3)) {
			return "Triple";
		} 
		if (number_count.contains(2)) {
			return "Two Pair";
		} 
		if (number_count.contains(1)) {
			return "One Pair";
		}
		return "High Card";
	}
	
	
	public String card_list(int card) {
		int s_index = card / 13;
		int n_index = card % 13;
		String cardshape = shape[s_index] + number[n_index];
		return cardshape;
	}
	
	
	public static int[] shuffle() {
		int[] deck = new int[52];
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		for (int i = 0; i < 200; i++) {
			int ran = (int) (Math.random() * 51 + 1);
			int temp = deck[0];
			deck[0] = deck[ran];
			deck[ran] = temp;
		}
		return deck;
	}
	
	
	public void draw(int turn) {
		int[] deck = new int[52];
		for (int i = 0; i < 6; i++) {
			int temp = deck[i];
			deck[i] = deck[ran.nextInt(52)];
			deck[ran.nextInt(52)] = temp;
		}
		Collections.addAll(com_card, deck[0], deck[1], deck[2]);
		Collections.addAll(player_card, deck[3], deck[4], deck[5]);
	}
	
	
	public void card_hand() {
		System.out.println("컴퓨터 카드 ->");
		for (int i = 0; i < com_card.size() ; i++) {
			System.out.println(com_card);
		}
		System.out.println("내 카드 ->");
		for (int i = 0; i < player_card.size() ; i++) {
			System.out.println(player_card);
		}
	}
	
	
//	public void card_release(Set<Integer> other_card) {
//		for (int i : other_card) {
//			
//		}
//	}
	
	
	public void game_start() {
		// 덱 섞기
		deck = shuffle();
		// 각자 카드 3장씩 뽑음
		draw(0);
		draw(0);
		draw(0);
		draw(0);
		draw(0);
		draw(1);
		draw(1);
		draw(1);
		draw(1);
		draw(1);
		// 카드 1장씩 뽑고 버릴지 안버릴지 결정함
//		while (com_card.size() <= 5 && player_card.size() <= 5) {
//			if (com_card.size() < 5) {
//				draw(0);
//				card_release(null);
//			}
//			if (player_card.size() < 5) {
//				draw(1);
//				card_release(null);
//			}
//		}
		card_hand();
		result();
	}
	
	
	public void result() {
		if (score_rule().equals("Flush")) {
			
		}
	}
	
	
	
	
}
















