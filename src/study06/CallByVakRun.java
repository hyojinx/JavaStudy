package study06;


class Upper {
	void Upper(int c) {
		c++;
	}
	void Upper(Counter counter) {
		counter.count++;
	}
}
class Counter {
	int count =0;   // 객체변수 클래스변수 멤버변수
	
}

public class CallByVakRun {
	
	
	
	public static void main(String[] args) {
		Counter mc = new Counter();
		System.out.println(mc.count);
		Upper up = new Upper();
		//up.Upper(mc.count);
		up.Upper(mc);
		System.out.println(mc.count);

	}

}
