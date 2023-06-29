package study05;

import java.util.Scanner;

public class CharCheck {
	//String 자음 모음 개수
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("단어를 입력해주세여: ");
		String keywords = input.next();
		int com = 0; //자음
		String check = keywords.toLowerCase();
		int vow = 0; //모음
		for(int i =0; i<check.length();i++) {
			
			char c = check.charAt(i);
			
			if(c>='a'&&c<='z') {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					vow++;
					
				}
				else {
					com++;
				}
			}
			System.out.println(c);
		}
		System.out.println("모음 개수: "+ vow);
		System.out.println("자음 개수: "+com);
		
		
	}

}
