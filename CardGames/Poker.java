package homework1;

import java.util.Scanner;

public class Poker {

	public static void main(String[] args) {

		Deck dk = new Deck();
		Card[] cd = new Card[5];
		Scanner sc = new Scanner(System.in);
		int i, j, k;
		Card wk;
		int cnt = 0;
		int num;

		dk.shuffle();
		for (i = 0; i < 5; i++) {
			cd[i] = dk.getCard();
		}

		//				cd[0] = new Card(2,9);
		//				cd[1] = new Card(1,10);
		//				cd[2] = new Card(1,11);
		//				cd[3] = new Card(1,12);
		//				cd[4] = new Card(1,13);

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5 - 1 - i; j++) {
				if (cd[j].getNum() > cd[j + 1].getNum()) {
					wk = cd[j];
					cd[j] = cd[j + 1];
					cd[j + 1] = wk;
				}
			}
		}

		System.out.println("1" + cd[0]);
		System.out.println("2" + cd[1]);
		System.out.println("3" + cd[2]);
		System.out.println("4" + cd[3]);
		System.out.println("5" + cd[4]);

		System.out.println("3回交換可能");

		for (i = 0; i < 3; i++) {
			System.out.println("交換するカードは何番目かな?");
			System.out.println("終わる場合は0");
			num = sc.nextInt();

			if (num == 0) {
				break;
			}
			if (num == 1) {
				cd[0] = dk.getCard();
			} else if (num == 2) {
				cd[1] = dk.getCard();
			} else if (num == 3) {
				cd[2] = dk.getCard();
			} else if (num == 4) {
				cd[3] = dk.getCard();
			} else if (num == 5) {
				cd[4] = dk.getCard();
			}
			System.out.println(num + "番目を交換しました");
			for (j = 0; j < cd.length; j++) {
				System.out.println(cd[j]);
			}
		}

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5 - 1 - i; j++) {
				if (cd[j].getNum() > cd[j + 1].getNum()) {
					wk = cd[j];
					cd[j] = cd[j + 1];
					cd[j + 1] = wk;
				}
			}
		}

		for (i = 0; i < 4; i++) {
			for (j = i + 1; j < 5; j++) {
				if (cd[i].getNum() == cd[j].getNum()) {
					cnt++;
				}
			}
		}
		
		System.out.println();
		System.out.println();
		for (j = 0; j < cd.length; j++) {
			System.out.print(cd[j]);
		}

		if (cnt == 1) {
			System.out.println("１ペア");
		} else if (cnt == 2) {
			System.out.println("２ペア");
		} else if (cnt == 3) {
			System.out.println("３カード");
		} else if (cnt == 4) {
			System.out.println("フルハウス");
		} else if (cnt == 6) {
			System.out.println("４カード");
		} else if (cnt == 0 &&
				cd[0].getNum() == 1 &&
				cd[1].getNum() == 10 &&
				cd[2].getNum() == 11 &&
				cd[3].getNum() == 12 &&
				cd[4].getNum() == 13 &&
				cd[0].getMark() == cd[1].getMark() &&
				cd[1].getMark() == cd[2].getMark() &&
				cd[2].getMark() == cd[3].getMark() &&
				cd[3].getMark() == cd[4].getMark()) {
			System.out.println("ロイヤルストレートフラッシュ!");
		} else if (cnt == 0 &&
				cd[0].getMark() == cd[1].getMark() &&
				cd[1].getMark() == cd[2].getMark() &&
				cd[2].getMark() == cd[3].getMark() &&
				cd[3].getMark() == cd[4].getMark() &&
				cd[4].getNum() - cd[0].getNum() == 4) {
			System.out.println("ストレートフラッシュ!");
		} else if (cnt == 0 &&
				cd[0].getMark() == cd[1].getMark() &&
				cd[1].getMark() == cd[2].getMark() &&
				cd[2].getMark() == cd[3].getMark() &&
				cd[3].getMark() == cd[4].getMark()) {
			System.out.println("フラッシュ");
		} else if (cnt == 0 && cd[4].getNum() - cd[0].getNum() == 4) {
			System.out.println("ストレート");
		} else {
			System.out.println("ハイカード");
		}

	}
}
/**
 * cd[0] に何度も代入すると、最後の1枚しか残らない
 * 配列は 0 番目から始まる
 * wk に一時保存しないと、カードを正しく入れ替えられない
 * = と == は意味が違う
 * 2重ループでカード同士を比較できる
 */
