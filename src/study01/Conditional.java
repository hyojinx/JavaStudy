package study01;

public class Conditional {

	public static void main(String[] args) {
	
		int age = 19;
		int charge = 0;
		
		if(age < 1) {
			charge = 0;
			System.out.println("영유아");
		} else if (age < 14) {
			charge = 1500;
			System.out.println("초등학생");
		} else if (age < 20) {
			charge = 2500;
			System.out.println("중고등학생");
		} else {
			charge = 3000;
			System.out.println("성인");
		}
		System.out.println("교통비 : " + charge + "원");
		
		System.out.println("---------------");
		
		int rank = 5;
		String medal;
		
		switch (rank) {
		case 1:
			medal = "금메달";
			break;
		case 2:
			medal = "은메달";
			break;
		case 3:
			medal = "동메달";
			break;
		default:
			medal = "없음";
			// break;
	
			
		} System.out.println(medal);
		
		
		
	}

}
