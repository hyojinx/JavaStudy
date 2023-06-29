package check;

import java.util.Scanner;

public class Food {

	public static void main(String[] args) {	
		//치킨34마리, 왕만두 10인분, 쌀국수 12인분
		//가격 치킨:25000원, 왕만두: 5000원, 쌀국수:8500원
		/*
		  치킨 x 34 = 850000
		  완만두 x 10 = 50000
		  쌀국수 x 12 = 102000
		  ==================
		  총합: 10020000
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("음식을 입력해주세요: ");
		String food_name = sc.next();
		System.out.print("음식 가격을 입력해주세요: ");
		int food_price = sc.nextInt();
		System.out.print("음식 수량을 입력해주세요: ");
		int food_count = sc.nextInt();

		int chicken_price = 25000;
		int chicken_count = 34;
		int mandu_price = 5000;
		int mandu_count = 10;
		int riceNoodel_price = 8500;
		int riceNoodel_count = 12;
		int total=0;
		
		System.out.println(food_name+" "+food_count+"개 "+(food_count*food_price)+"원");
		System.out.println("치킨 "+chicken_count+"마리 "+(chicken_count*chicken_price)+"원");
		System.out.println("왕만두 "+mandu_count+"개 "+(mandu_count*mandu_price)+"원");
		System.out.println("쌀국수 "+riceNoodel_count+"그릇 "+(riceNoodel_count*riceNoodel_price)+"원");
		System.out.println("========================");
		total = (food_count*food_price)+(chicken_count*chicken_price)+(mandu_count*mandu_price)+(riceNoodel_count*riceNoodel_price);
		System.out.println("총합: "+total+"원");
		
		

	}

}
