package study15_2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
public class LottoEx {
	Scanner scan = new Scanner(System.in);	
	public static void main(String[] args) {
		new LottoEx().lottoStart();
	}	
	public void lottoStart() {
		
		while(true) {
			lottoMenu();
			System.out.print("메뉴 선택");
			int menu = scan.nextInt();
			if(menu==2) {
				break;
			}
			else if(menu==1) {
				getLotto();
				
				
			}
			else {
				System.out.println("번호 입력 오류");
				System.out.println("다시 입력 하세요");
				continue;
			}
		}
		System.out.println("안녕히가세욥");
	}
	
	public void lottoMenu() {
		System.out.println("Lotto 판매점");
		System.out.println("====메뉴====");
		System.out.println("1.Lotto 구입");
		System.out.println("2.종료");
		System.out.println("===========");
	}
	public void getLotto() {
		System.out.print("구매 금액 입력(한 줄 당 1000원) :");
		int money = scan.nextInt();
		if(money<1000) {
			System.out.println("1000원이 안됩니다.");
			return;
		}
		else if(money>100000) {
			System.out.println("10만원 초과은 안돼요");
			return;
		}
		makeLotto(money);
		System.out.println(money+"받았습니다. "+money/1000+"장 출력");
		System.out.println("거스름돈:"+(money%1000)+"원");
		
	}
	public void makeLotto(int money) {
		int count = money/1000;
		ArrayList<TreeSet<Integer>> lottoList = new ArrayList<>();
		for(int i =0;i<count;i++) {
			TreeSet<Integer> lottoSet = new TreeSet<>();
			while(lottoSet.size()<6) {
				lottoSet.add((int)(Math.random()*45+1));	
			}
			lottoList.add(lottoSet);
		}
		System.out.println("로또 번호 출력");
		for(int j =0; j<lottoList.size();j++) {
			System.out.println("로또번호"+(j+1)+lottoList.get(j)+" ");
		}
		
	}
}

