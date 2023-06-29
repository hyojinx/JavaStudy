package test02_10;


public class SerialNum {	
	public static void main(String[] args) {
		String serial = "990927-1184510";
		String num[] = serial.split("-");
		String front = num[0];
		String back = num[1];
		
		int year = Integer.parseInt(front.substring(0, 2));
		int month = Integer.parseInt(front.substring(2, 4));
		int day = Integer.parseInt(front.substring(4, 6));

		System.out.printf("%d년 %d월 %d일\n",year,month,day);
		if(num[1].charAt(0)=='1'||num[1].charAt(0)=='3') {
			System.out.println("성별: 남");
		}
		else {
			System.out.println("성별: 여");
			
		}
		
	}
}