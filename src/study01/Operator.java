package study01;

public class Operator {

	public static void main(String[] args) {
		int num1 = 8, num2 = 4;
		System.out.println("+ : " + (num1+num2));
		System.out.println("- : " + (num1-num2));
		System.out.println("* : " + (num1*num2));
		System.out.println("/ : " + (num1/num2));
		System.out.println("% : " + (num1%num2));
		
		int num3 = 7, num4 = 7, num5 = 7;
		num3 -= 3;
		num4 = num4 - 3;
		// =- =+ 연산자는 없음
		// num5 =- 3;					
		System.out.println(num3);
		System.out.println(num4);
		// System.out.println(num5);
		
		System.out.println("-----------------");
		
		int y = 0, x = 10;
		y = x -- + 5 + -- x;
		System.out.println(x);
		System.out.println(y);
		
		char ch1 = 'a';	// 97
		char ch2 = 'b';	// 98
		System.out.println(ch1 < ch2);
		
		ch1 = 'v';
		ch2 = 'B';
		boolean res1, res2;
		System.out.println(ch1 > 'c');
		System.out.println(ch2 < 'z');
		res1 = (ch1 > 'c') && (ch2 < 'z');
		res2 = (ch1 < 'A') || (ch2 > 'Z');
		System.out.println("&& : " + res1);
		System.out.println("|| : " + res1);
//		System.out.println("! : " + res1);
		
		
		
		int day = 6;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuseday");
			break;
		case 3:
			System.out.println("Wendsday");
			break;
		case 4:
			System.out.println("Thurthday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			break;
		}
	}

}
