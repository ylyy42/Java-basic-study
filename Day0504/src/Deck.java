import java.awt.CardLayout;

public class Deck {
	final static int CARD_NUM = 52;
	Card c[] = new Card[CARD_NUM];
	
	Deck() {
		int i = 0;
		for(int k = Card.KIND_MAX; k > 0; k--) {
			for(int n = 1; n < Card.NUM_MAX + 1; n++) {
				c[i++] = new Card(k,n);
			}
		}
	}
	Card pick(int index) {
		return c[index];
	}
	Card pick() {
		int index = (int)(Math.random() * CARD_NUM);
		return c[index];
	}
	void shuffle() {
		for(int i = 0; i < c.length; i++) {
			int r = (int)(Math.random() * CARD_NUM);
			Card temp = c[i];
			c[i] = c[r];
			c[r] = temp;
		}
	}
}
