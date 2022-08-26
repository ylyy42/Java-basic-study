
public class cardTest {

	public static void main(String[] args) {
		Deck d = new Deck();
		Card c = d.pick(0);
		System.out.println(c);
//		for(int i = 0; i < Deck.CARD_NUM; i++) {
//			System.out.println(d.c[i]);
//		}
		d.shuffle();
//		for(int i = 0; i < Deck.CARD_NUM; i++) {
//			System.out.println(d.c[i]);
//		}
		c = d.pick(0);
		System.out.println(c);
	}

}
