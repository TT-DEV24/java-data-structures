package homework1;

public class Queue {

	String[] queue = new String[5];

	int n = queue.length;
	int head = 0;
	int tail = -1;
	int cnt = 0;

	public void enq(String data) {
		
		if (cnt < n) {
			tail = (tail + 1) % n;
			queue[tail] = data;
			cnt++;
		} else {
			System.out.println("いっぱいです");
			
		}
	}
	
	public void deq () {
		
		String data;
		if(cnt > 0) {
			data = queue[head];
			queue[head] = "空";
			head = (head + 1) % n;
			cnt--;
			System.out.println(data);
		}else {
			System.out.println("queに何も入ってません");
			data = null;
		}
		
	}

	public int size() {
		
		return cnt;

	}
	
	public void reset () {
		
		cnt = 0;
		head = 0;
		tail = -1;
		
	}
	
	public void print () {
		
		int i;
		int h = head;
		System.out.println("┓　↑　┏");
		System.out.println("│　　　│");
		
		for(i = 0; i < cnt; i++) {
			System.out.print("│");
			System.out.printf("%6s" , queue[h]);
			System.out.print("│");
			System.out.println();
			h = (h + 1) % n;
		}
		System.out.println("│　　　│");
		System.out.println("┛　↑　┗");
		
		/*for(i = 0; i < queue.length; i++) {
			System.out.print(queue[i]);
		    if(i == head) {
			    System.out.print("←head");
		    }
		    if(i == tail) {
			    System.out.print("←tail");
		    }
		    System.out.println();
		}*/
		
	}
}
