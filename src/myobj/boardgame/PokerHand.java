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
	
	private String[] shape = {"���̾�", "��Ʈ", "�����̵�", "Ŭ�ι�"};
	private String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
			"J", "Q", "K"};
	
	
	private List<Integer> number_count; // ���� ��� ��������
	private List<String> shape_count; // ���� ��� ��������
	private List<Integer> com_card; // ��ǻ��ī�� ����Ʈ
	private List<Integer> player_card; // ��ī�� ����Ʈ
	
	private int[] deck;
	
	private int deck_num = 52;
//	private List<String> index;
	
	public static int game_index;
	/*
	 PokerHand Ŭ������ �����غ�����
	 1. �ټ����� PokerCard�� ������ �־�� ��
	 2. �ټ����� PokerCard�� ����/���̸� ���� ������ �ϼ��ؾ� ��
	 3. �ٸ� PokerHand �ν��Ͻ��� ������ ���� ũ��񱳰� �����ؾ� ��
	 4. �ټ��� �� ���ϴ� ī�常 �����ϴ� ����� �־�� ��
	 5. ī�带 ���徿 �߰��ϴ� ����� �־�� ��
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
		System.out.println("��ǻ�� ī�� ->");
		for (int i = 0; i < com_card.size() ; i++) {
			System.out.println(com_card);
		}
		System.out.println("�� ī�� ->");
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
		// �� ����
		deck = shuffle();
		// ���� ī�� 3�徿 ����
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
		// ī�� 1�徿 �̰� ������ �ȹ����� ������
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
















