package check;

import java.util.Scanner;

public class SumNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("세자리 숫자를 입력해주세요");
		int  num =input.nextInt();
		
		if(num/100>0 && num<1000) {
			Sum(num);
		}
		else {
			System.out.println("다시 입력");
		}

	}
	
	
	public static void Sum(int num) {
		int first = num/100;
		int second = (num%100)/10;
		int last = num%10;
		
		System.out.println("첫번째 숫자: "+first);
		System.out.println("두번째 숫자: "+second);
		System.out.println("세번째 숫자: "+last);
		
		System.out.println("세자리수의 합은: "+(first+second+last));
		
	}

}
// String문 나중에
//	 String str = input.next();
//	 if(ser.length()==3) {
//		 int sum2 = 0;
//		 String[] sarr = str.split(str)
//		?
//	 	?
//	 }