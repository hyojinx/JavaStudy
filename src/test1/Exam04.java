package test1;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		//System.out.println(Math.random());  //0에서 1사이의 값만 출력됨
		//2개의 주사위를 던졌을 때 눈의 합의 값이 5이면 코드 정지
		//12가 나오면 감탄사 
		//나오는 값은 계속 출력	
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
			
			
			if(i+j==5) {
				System.out.println("5가 나왔네요 아웃!");
				break;
			}
			if(i+j==12) {
				System.out.println("**************");
				System.out.println("빠칭코 성공!!");
				System.out.println("**************");
				break;
			}
		}
			else {
				System.out.println("잘가요");
				continue;
			}
			
			
		}
	}

}
