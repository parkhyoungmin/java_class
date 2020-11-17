package myobj.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PokerHand implements Comparable<PokerHand> {

	ArrayList<PokerCard> hands;
	
	boolean[] opens;
	
	public PokerHand(int handsize) {
		hands = new ArrayList<PokerCard>(handsize);
		opens = new boolean[handsize];
		
		for (int i = 0; i < handsize; i++) {
			if (i < 2) {
				opens[i] = false;
			} else {
				opens[i] = true;
			}
		}
	}
	
	public void add(PokerCard card) {
		hands.add(card);
	}
	
	public void show() {
		for (int i = 0, size = hands.size(); i < size; i++) {
			System.out.print((i + 1) + "번째 카드 : ");
			if (opens[i]) {
				System.out.print(hands.get(i));
			} else {
				System.out.print(hands.get(i));//System.out.print("NOT OPENED");
			}
			System.out.println();
		}
	}
	
	public void open(int hand_index) {
		opens[hand_index] = !opens[hand_index];
	}
	
	public void openAllCard() {
		Arrays.fill(opens, true);
	}
	
	Set<Rank> getRankSet() { // rank만 따로 뺀 set만들어서 쓰기 위해
		Set<Rank> ranks = new HashSet<Rank>();
		
		for (PokerCard hand : hands) {
			ranks.add(hand.rank);
		}
		return ranks;
	}
	
	public static void main(String[] args) {
		int round = 0;
		
		while (true) {
			round++;
			
			PokerDeck deck = new PokerDeck();
			PokerHand player01 = new PokerHand(5);
			
			player01.add(deck.draw());
			player01.add(deck.draw());
			player01.add(deck.draw());
			player01.add(deck.draw());
			player01.add(deck.draw());
			
			
			PokerHand player02 = new PokerHand(5);
			
			player02.add(deck.draw());
			player02.add(deck.draw());
			player02.add(deck.draw());
			player02.add(deck.draw());
			player02.add(deck.draw());
			
			System.out.println("players1 deck");
			player01.show();
			System.out.println("players2 deck");
			player02.show();
			
			ArrayList<PokerHand> players = new ArrayList<PokerHand>();
			players.add(player01);
			players.add(player02);
			
			System.out.println("이긴사람 : " + Collections.max(players).hands);
			break;

		}
	}

	@Override
	public int compareTo(PokerHand o) {
		PokerHandRanking rank1 = new PokerHandRanking(this);
		PokerHandRanking rank2 = new PokerHandRanking(o);
		
		System.out.println("플레이어1 : " + rank1.getHandRank());
		System.out.println("플레이어2 : " + rank2.getHandRank());
		
		return rank1.getHandRank().compareTo(rank2.getHandRank());
	}
	
	
}
















