
package homework1;

import java.util.Scanner;

public class BrackJack {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Deck dk = new Deck();
		Card cd;
		int num;
		int sum = 0;
		boolean flag = false;
		
		dk.shuffle();
		
		/**
		 * 二回足した合計を表示
		 */
		cd = dk.getCard();
		System.out.println(cd);
		
		if(cd.getNum() == 1 && sum + 11 <= 21) {
			sum += 11;
		}else if(cd.getNum() == 11 ||cd.getNum() == 12||cd.getNum() == 13) {
			sum += 10;
		}else {
			sum += cd.getNum();
		}
		
		cd = dk.getCard();
		System.out.println(cd);
		if(cd.getNum() == 1 && sum + 11 <= 21) {
			sum += 11;
		}else if(cd.getNum() == 11 ||cd.getNum() == 12||cd.getNum() == 13) {
			sum += 10;
		}else {
			sum += cd.getNum();
		}		
		
		System.out.println("合計" + sum);
		
		System.out.println("カードを引く？ YES = 1 NO = 2");
		num = sc.nextInt();
		
		while(num == 1) {
			cd = dk.getCard();
			System.out.println(cd);
			if(cd.getNum() == 1 && sum + 11 <= 21) {
				sum += 11;
			}else if(cd.getNum() == 11 ||cd.getNum() == 12||cd.getNum() == 13) {
				sum += 10;
			}else {
				sum += cd.getNum();
			}			
			
			if(sum > 21) {
				flag = true;
				break;
			}
			System.out.println("合計" + sum);
			System.out.println("カードを引く？ YES = 1 NO = 2");
			num = sc.nextInt();
		}
		
		if(num == 2) {
			System.out.println("合計" + sum);
		}
		
		if(flag) {
			System.out.println("バースト");
			System.out.println("合計" + sum);
		}
	}
}
