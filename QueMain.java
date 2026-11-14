package homework1;

import java.util.Scanner;

public class QueMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Queue que = new Queue();
		String  str;
		int n;
		
		System.out.println("↓入力例↓");
		System.out.println("①enq");
		System.out.println("②deq");
		System.out.println("③個数表示");
		System.out.println("④リセット");
		System.out.println("⓪終了");
		
		while(true) {
			
			System.out.println("項番を入力");
			n = sc.nextInt();
			
			if(n == 1) {
				System.out.println("←enq");
				sc.nextLine();
				str = sc.nextLine();
				que.enq(str);
			}else if(n == 2) {
				que.deq();
			}else if(n == 3) {
				System.out.println("queの中身は" + que.size() + "個です");
			}else if(n == 4) {
				que.reset();
			}else if(n == 0) {
				System.out.println("お疲れ様でした");
				break;
			}
			que.print();
		}
		sc.close();
	}
}
