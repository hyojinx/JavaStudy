package study08;

import java.util.ArrayList;

public class PriceRun {
	public static void main(String[] args) {
		ArrayList<Customer> cusList = new ArrayList<>();
		Customer lee = new Customer("이순신");
		Customer hong = new Customer("홍길동");
		GoldCustomer sung = new GoldCustomer("성시경");
		VipCustomer kim = new VipCustomer("김정호","대동아");
		VipCustomer Kong = new VipCustomer("공유","와이파이");
		cusList.add(lee);
		cusList.add(hong);
		cusList.add(sung);
		cusList.add(kim);
		cusList.add(Kong);
		
		
		showCustomer(cusList);
		calcPriceAll(cusList,100000);
		
	}
	public static void showCustomer(ArrayList<Customer>cusList) {
		System.out.println("====고객=====");
		for(Customer c :cusList) {
			System.out.println(c.getCustomerInfo());
		}
		
	}
	public static void calcPriceAll(ArrayList<Customer>cusList,int price) {
		System.out.println("====가격계산====");
		System.out.println("가격:"+price);
		for(Customer c : cusList) {
			int cost = c.calcPrice(price);
			System.out.printf("%s 고객님의 구매금액은 %d원입니다.",c.getCustomerName(),cost);
			System.out.println(c.getCustomerInfo());	
		}
	}
}
