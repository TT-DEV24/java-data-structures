package homework1;

public class List {

	Element top; //単方向リストの先頭
	int num; //リストの要素数
	Element tail; //リストの末尾

	public List() {
		top = null;
		tail = null;
		num = 0;
	}
	//リストの先頭に値を追加
	public void addTop(String val) {
		Element wk = new Element(val);
		wk.next = top;
		top = wk;
		if (tail == null) {
			tail = wk;
		}
		num++;
	}
	//リストの末尾に値を追加
	public void addTail(String val) {
		Element wk = new Element(val);
		if (tail != null) {
			tail.next = wk;
			tail = wk;
		} else {
			top = wk;
			tail = wk;
		}
		num++;
	}
	//リストの中を表示
	public void print() {
		Element cur;
		cur = top;
		while (cur != null) {
			System.out.println(cur.val);
			cur = cur.next;
		}
	}
	//リストのサイズ表示
	public int size() {
		System.out.println(num);
		return num;
	}
	//リストをリセット
	public void reset() {
		top = null;
		tail = null;
		num = 0;
	}
	//指定した位置に値を挿入
	public void insert(int idx, String val) {
		Element wk = new Element(val);
		Element cur;
		cur = top;
		int i;
		for (i = 0; i < idx; i++) {
			cur = cur.next;
		}
		wk.next = cur.next;
		cur.next = wk;
		num++;
	}
	//指定した位置の値を取り出す
	public String get(int idx) {
		Element cur;
		cur = top;
		for (int i = 0; i < idx; i++) {
			cur = cur.next;
		}
		return cur.val;
	}
	//指定した位置に値を追加する
	public String set(int idx, String val) {
		Element cur;
		cur = top;
		for (int i = 0; i < idx; i++) {
			cur = cur.next;
		}
		cur.val = val;
		return cur.val;
	}
	//指定した位置の削除
	public void delete(int idx) {
		Element cur;
		cur = top;
		for (int i = 0; i < idx - 1; i++) {
			cur = cur.next;
		}
		cur.next = cur.next.next;
		num--;
	}
	//指定した位置の値を確認、なければ-1を返す
	public String search(int idx) {
		Element cur;
		cur = top;
		for(int i = 0; i < idx; i++) {
			cur = cur.next;
		}
		if (top == null) {
			return "-1";
		}else if(idx >= num) {
			return "-1";
		}else {
			return cur.val;
		}
	}

}
