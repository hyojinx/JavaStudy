package study01;

public class Loop {
	public static void main(String[] args) {
		int num = 1; // 초기화
		int sum = 0; // 합계

		while (num <= 10) { // 조건식
			sum += num;
			num++; // 증감식
		}
		System.out.println("합계 : " + sum);

		num = 1; // 초기화
		sum = 0; // 합계
		do {
			sum += num;
			num++; // 증감식
		} while (num <= 10); // 조건식
		System.out.println("합계 : " + sum);

		sum = 0; // 초기화

		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println("합계 : " + sum);

	}

}
