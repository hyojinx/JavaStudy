package study01;

import java.time.LocalDate;
import java.util.Iterator;

public class ConditionalPrac {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		String dayOfweek = now.getDayOfWeek().toString();
		int dayOfweekValue = now.getDayOfWeek().getValue();
		System.out.println(dayOfweek + ", " + dayOfweekValue);

		String result = "";
		if (dayOfweekValue == 1 || dayOfweekValue == 2 || dayOfweekValue == 3 || dayOfweekValue == 4) {
			result = "평일";
		} else if (dayOfweekValue == 5) {
			result = "불금";
		} else if (dayOfweekValue == 6 || dayOfweekValue == 7) {
			result = "주말";
		}
		System.out.println(result);
		System.out.println("-------------");

		switch (dayOfweekValue) {
		case 1:
		case 2:
		case 3:
		case 4:
			result = "평일";
			break;
		case 5:
			result = "불금";
			break;
		case 6:
		case 7:
			result = "주말";
			break;
		default:
			result = "없는 요일";
		}
		System.out.println(result);

		int total = 0; // 1부터 100까지의 합의 결과값을 얻기 위한 변수 선언
		for (int i = 1; i <= 100; i++) {
			total = total + i; // 1부터 100까지 반복반복해서 total 변수에 값을 누적
		}
		System.out.println(total);
		System.out.println("-------------");

		// 구구단
		for (int i = 2; i < 10; i++) {
			System.out.println("-" + i + "단-");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j);
			}
		}
		System.out.println("------------");
		System.out.println("5단출력");
		// 구구단 5단 출력 방법1
		for (int i = 1; i < 10; i++) {		
			System.out.println("5x" + i + " = " + (5 * i));
		}System.out.println("------------");
		
		// 구구단 5단 출력 방법2
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if ( i == 5 ) {
					break;
				}
				System.out.println(i + "x" + j + "=" + (i*j));
				
			}

		} System.out.println("------------");

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);

		}
		System.out.println("------------");
		for (int i = 1; i < 10; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println(i);
		}

		// 1부터 100까지 짝수만 나열
		System.out.println("------------");
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.print(" " + i);
			}
		}	
		System.out.println("\n");
		System.out.println("------------");
		
		// 1부터 100까지 짝수끼리 합계
		total = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 1) {
				continue;
			} total += i;
			// total = total + i;
		}
		System.out.println("합계 : " + total );
		System.out.println("------------");
		
		total = 0;
		for (int i = 2; i <= 100; i+=2) {
			total += i;
			// total = total + i;
		}	System.out.println("합계 : " + total );	
		System.out.println("------------");
		
		int sum1 = 0;
		int num1 = 2;
		while ( num1 <= 100 ) {
			sum1 += num1;
			// sum1 = sum1 + num1;
			if (sum1 > 100) {
				break;
			} num1++;
		} System.out.println(sum1 + ", " + num1);
	}
}
