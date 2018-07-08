package blackjack;

public class Card {
	public String Mark;
	public int Number;

	public int score() {
		if(Number>10) {
			return 10;
		}else {
			return Number;
		}
	}

}
