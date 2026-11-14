package homework1;

public class Card{
	
	private int mark;
	private int num;
	
	public Card(int mark , int num) {
		
		if(mark >= 1 && mark <= 4) {
			this.mark = mark;
		}else {
			this.num = 1;
		}
		this.num = num;
	}
	
	public int getMark() {
		return mark;
	}
	
	public  int getNum() {
		return num;
	}
	
	@Override
	public String toString() {
		String [] markStr = {"?","♠","♥","♦","♣"};
		String [] numStr = {"?","Ａ","２","３","４","５","６","７","８","９","10","Ｊ","Q","Ｋ"};
		return "[" + markStr[mark] + numStr[num] + "]";
	}

}
