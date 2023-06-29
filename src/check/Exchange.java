package check;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		//유로 달러 두번 입력
		//한화로 얼마인지
		//환율 검색
		Scanner input = new Scanner(System.in);
		System.out.println("환전");
		
		while(true) {
			System.out.println("유로->달러: 1번    달러->한화: 2번    유로->한화: 3번    종료: 4번");
			int choose = input.nextInt();
			switch(choose) {
			case 1:
				System.out.print("유로 입력: ");
				int euro = input.nextInt();
				euroTodoll(euro);
				break;
			case 2:
				System.out.print("달러 입력: ");
				int doll = input.nextInt();
				dollToKRW(doll);
				break;
			case 3:
				System.out.print("유로 입력: ");
				int euro2 = input.nextInt();
				euroToKRW(euro2);
				break;
			case 4:
				break;
				
			default :
				System.out.println("다시 입력해주세요");
				continue;
		
			}

			System.out.print("더 하실거면: Y 그만하시겠으면: N 입력");
			
			char yOrn =input.next().charAt(0);
			if(yOrn== 'Y'||yOrn == 'y') {
					continue;
					
				}
			else if (yOrn == 'N'||yOrn == 'n') {
				break;
				
			}
			else {
				System.out.print("다시 입력");
				continue;
			}
			
			
		}
		System.out.println("수고하세욥");

	}

	
	
	
	
	
	
	
	public static void euroTodoll(int euro) {
		double usd = euro * 1.09;
		DecimalFormat df1 = new DecimalFormat("#");
		df1 = new DecimalFormat("###,###,###");
		System.out.println(euro+"유로는 " +df1.format(usd)+"달러입니다");
		
	}
	public static void dollToKRW(int doll) {
		double KRW = doll *1228.70;
		DecimalFormat df2 = new DecimalFormat("#");
		df2 = new DecimalFormat("###,###,###");
		System.out.println(doll+"달러는 "+df2.format(KRW)+"원 입니다");
	}
	public static void euroToKRW(int euro) {
		double KRW = euro*1337.38;
		DecimalFormat df3 = new DecimalFormat("#");
		df3 = new DecimalFormat("###,###,###");
		System.out.println(euro+" 유로는 "+df3.format(KRW)+"원 입니다");
	}
	
}
