package study06;

public class VarTestRun {
	
	int k=0;
	
	int localVal(int l) {
		k++;
		return ++l;         //l++는 1로 나옴
	}
	public static void main(String[] args) {
		int a =1;
		VarTestRun res = new VarTestRun();
		a = res.localVal(a);
		System.out.println(a);
		//객체.멤버변수명
		System.out.println(res.k);
	}

}
