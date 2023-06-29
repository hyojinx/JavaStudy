package project;

import java.io.IOException;
import java.util.Scanner;

public class NoneMember {
	public void nonememberinfo() throws IOException {
		SearchSong ss = new SearchSong();
		while(true) {
			ss.search();
			System.out.print("다른 노래를 검색하시겠습니까?(y/n)");
			Scanner sc = new Scanner(System.in);
			String yesOrno = sc.next();
			if(yesOrno.equals("y")||yesOrno.equals("Y")) {
				continue;
			}
			else if(yesOrno.equals("n")||yesOrno.equals("N")) {
				break;
			}
		}
		System.out.println("이용해 주셔서 감사합니다.");
		
	}

}
