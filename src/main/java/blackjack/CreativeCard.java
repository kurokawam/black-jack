package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CreativeCard {
	public static void main(String[] args) {
		List<Card> cardList = new ArrayList<Card>();
		for (int i = 0; i < 13; i++) {
			Card creativeCard = new Card();
			creativeCard.Mark = "♠";
			creativeCard.Number = i + 1;
			cardList.add(creativeCard);
		}
		for (int i = 0; i < 13; i++) {
			Card creativeCard = new Card();
			creativeCard.Mark = "♥";
			creativeCard.Number = i + 1;
			cardList.add(creativeCard);
		}
		for (int i = 0; i < 13; i++) {
			Card creativeCard = new Card();
			creativeCard.Mark = "♣";
			creativeCard.Number = i + 1;
			cardList.add(creativeCard);
		}
		for (int i = 0; i < 13; i++) {
			Card creativeCard = new Card();
			creativeCard.Mark = "♦";
			creativeCard.Number = i + 1;
			cardList.add(creativeCard);
		}

		int total = 0;

		Collections.shuffle(cardList);
		System.out.println("あなたのカードです");
		System.out.println(cardList.get(0).Mark + cardList.get(0).Number);
		System.out.println(cardList.get(1).Mark + cardList.get(1).Number);
		total += cardList.get(0).score();
		total += cardList.get(1).score();
		System.out.println("カードの合計は" + total + "です");

		Scanner scanner = new Scanner(System.in);
		System.out.println("もう一枚カードを引きますか？");
		System.out.println("Y/N");

		String input = scanner.nextLine(); 

		if (input.toUpperCase().equals("Y")) {
			System.out.println("あなたのカードです");
			System.out.println(cardList.get(0).Mark + cardList.get(0).Number);
			System.out.println(cardList.get(1).Mark + cardList.get(1).Number);
			System.out.println(cardList.get(4).Mark + cardList.get(4).Number);
		    total += cardList.get(4).score();
		    System.out.println("カードの合計は" + total + "です");
			
		} else {
			System.out.println("あなたのカードです");
			System.out.println(cardList.get(0).Mark + cardList.get(0).Number);
			System.out.println(cardList.get(1).Mark + cardList.get(1).Number);
		}
	}
}
