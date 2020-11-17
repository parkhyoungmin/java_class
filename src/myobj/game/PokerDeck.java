package myobj.game;

import java.util.Collections;
import java.util.LinkedList;

public class PokerDeck {
	LinkedList<PokerCard> deck;
	
	public PokerDeck() {
		deck = new LinkedList<PokerCard>();
		
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				deck.add(new PokerCard(rank, suit));
			}
		}
		Collections.shuffle(deck);
	}
	
	public PokerCard draw() {
		// ArrayList�� remove()�� pop�� ��ɵ� �Ѵ�
		return deck.pop();
	}
	
	public static void main(String[] args) {
		new PokerDeck();
	}
	
	
}





















