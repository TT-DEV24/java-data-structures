package homework1;

import java.util.Scanner;

public class SrackMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack sk = new Stack();
		int n;
		String str;
		
		System.out.println("①stack");
		System.out.println("②pop");
		System.out.println("③入力数の表示");
		System.out.println("④リセット");
		System.out.println("⓪終了");
		
		while(true) {
			
			System.out.println("項番を入力");

			if (sc.hasNextInt()) {
			    n = sc.nextInt();
			    sc.nextLine();
			} else {
			    System.out.println("数字を入力してください");
			    sc.nextLine();
			    continue;
			}
			
		    if(n == 1) {
		    	
		    	System.out.println("push=");
		    	str = sc.nextLine();
		    	sk.push(str);
		    	
		    }
		    
		    else  if(n == 2) {
		    	
		    	 str = sk.pop();
		    	 if(str == null) {
		    		 System.out.println("配列はからです");
		    	 }else {
		    		 System.out.println("pop→" + str);
		    	 }
		    	
		    }
		    
		    else if(n == 3) {
		    	
		    	System.out.println("入力数は" + sk.size() + "です");
		    	
		    }
		    
		    else if(n == 4) {
		    	
		    	sk.reset();
		    	
		    }
		    
		    else if(n == 0) {
		    	
		    	System.out.println("お疲れ様でした");
		    	break;
		    	
		    }
		    System.out.println("------現在のStack--------");
		    sk.print();
		    System.out.println("-------------------------------");
		}
		sc.close();
	}
}
