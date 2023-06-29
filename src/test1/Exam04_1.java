package test1;

import java.util.Scanner;

public class Exam04_1 {

	public static void main(String[] args) {
		//System.out.println(Math.random());  //0에서 1사이의 값만 출력됨
		//2개의 주사위를 던졌을 때 눈의 합의 값이 5이면 코드 정지
		//12가 나오면 감탄사 
		//나오는 값은 계속 출력
		System.out.print("돈 넣어주세요:");
		Scanner money = new Scanner(System.in);
		int price = money.nextInt();
		System.out.println("빠칭코 돌리기");
		System.out.println("1누르면 시작");
		System.out.println("1말고 아무키 누르면 종료");
		
		
		while(true) {		
			Scanner aa = new Scanner(System.in);
			int a = aa.nextInt();
			if(a == 1) {
			int i = (int)(Math.random()*6)+1;
			int j = (int)(Math.random()*6)+1;
			System.out.printf("Rolling...[%d,%d]\n",i,j);

			
			if(i+j<4) {
				System.out.println("탕진");
				price =0;
				System.out.println("현재돈: "+price);

				break;
			}
			else if(i+j>=4&&i+j<9) {
				System.out.println("2배!");
				price*=2;
				System.out.println("현재돈: "+price);

				continue;
			}
			else if(i+j>=9&&i+j<12) {
				System.out.println("3배!");
				price*=3;
				System.out.println("현재돈: "+price);

				continue;
			}
			else if(i+j==12) {
				System.out.println("10배!");
				System.out.println("빠칭코 성공!!");
				System.out.println("**************");
				price*=10;
				System.out.println("현재돈: "+price);

				continue;
		}		}
			else {
				System.out.println("잘가요");
				System.out.println("현재돈: "+price);
				break;
			}
			
			
		}
	}

}
