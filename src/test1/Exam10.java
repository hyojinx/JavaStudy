package test1;

import java.util.Random;
import java.util.Scanner;

public class Exam10 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] random_num = new int [3];
		int strike=0;
		int ball=0;
		int count=10;
		for(int i=0;i<random_num.length;i++) {
			random_num[i] = random.nextInt(9);
			for(int j=0;j<i-1;j++) {
				if(random_num[i]==random_num[j]) {
					i--;
				}
			}
			
		}
	while(count>0) {	
	int[] num = new int [3];
	Scanner input = new Scanner(System.in);
	System.out.print("숫자 입력:");
	String arr = input.next();
	strike=0;
	ball=0;
	for(int i =0;i<num.length;i++) {
		num[i]=arr.charAt(i)-48;
	}
	for(int i =0; i<num.length;i++) {
		for(int j =0; j<num.length;j++) {
			if(random_num[i]==num[j]) {
				if(i==j) {
					strike++;
				}
				else {
					ball++;
				}
			}
		}
	}
	count--;	
	if(strike==3) {
		System.out.println("홈런!");
		break;
	}
	System.out.println(strike+"스트라이크"+ball+"볼");
	System.out.println("남은 기회:"+count);
	}
	if(count == 0 ) {
	System.out.println("아웃!");
	}
}
}