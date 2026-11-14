package homework1;

public class Stack {
	
	String [] wk = new String [10];
	int sp = 0;
	
	//値の追加
	public void push(String str) {
		wk[sp] = str;
		sp += 1;
	}
	//値の取り出し
	public String  pop () {
		if(sp == 0) {
			return null;
		}
		sp--;
		return wk[sp];
	}
	//値のサイズ表示
	public int size() {
		return sp;
	}
	//リセット
	public void reset() {
		sp = 0;
	}
	//プリント
	public void print() {
		for(int i = 0; i < sp; i++) {
			System.out.printf("%10s%n",wk[i]);
		}
	}

}
