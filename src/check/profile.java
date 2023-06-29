package check;


public class profile {
	/* 개인 프로필 출력
	   이름: 홍길동
	   학번: 2018122101
	   신장: 1.78m
	   남자인가요? true
	   */
	public static void main(String[] args) {
		String name = "홍길동";
		Long studentId = 2018122104L;
		double tall = 1.78;
		String gender ="남자";
		
		System.out.println("이름: "+name);
		System.out.println("학번: "+studentId);
		System.out.println("신장: "+tall+"m");
		System.out.println("남자인가요? "+ (gender=="남자"?true:false));
	
	
	}
}
