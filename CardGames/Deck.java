package homework1;

import java.util.Random;

public class Deck {

    private Card [] yama = new Card[52];
    private int sp;

    public Deck() {
    	
    	int mark , num;
    	int idx = 0;
    	
    	for(mark = 1; mark <= 4; mark++) {
    		for(num = 1; num <= 13; num++) {
    			yama[idx] = new Card(mark,num);
    			idx++;
    		}
    	}
    	sp = 52;
    }
    
    public Card getCard() {
    	if(sp > 0) {
    		sp--;
    		return yama[sp];
    	}else {
    		System.out.println("山札にカードがありません");
    		return null;
    	}
    }
    
    public void shuffle() {
    	
    	Random r = new Random();
    	Card wk;
    	int i , x;
    	for(i = sp-1; i > 0; i--) {
    		x = r.nextInt(i + 1);
    		wk = yama[i];
    		yama[i] = yama[x];
    		yama[x] = wk;
    	}
    }
    
    public int remainNum() {
    	return sp;
    }
    
}
