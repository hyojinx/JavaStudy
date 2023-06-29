package study01;

public class Variable {

	public static void main(String[] args) {
		// 변수 선언
		int num = 10;
		System.out.println(num);
		// 진수 표현
		int binNum = 0B1010;		// 2진법
		System.out.println(binNum);
		int octNum = 013;			// 8진법
		System.out.println(octNum);
		int hexNum = 0x1A;			// 16진법
		System.out.println(hexNum);

		// 변수명 가독성
		// 변수명이 길 땐 자동완성 기능 사용
		int mp;	// membership point
		int membershipPoint;
		
		byte byteData = 127;
		System.out.println(byteData);
		byteData = (byte) -129;	
		// byte 범위 -128 ~ 127
		// 범위를 넘어서면 오류 -> 캐스팅
		System.out.println(byteData);
		
		int integerNum = 1234567;
		long longNum = 1234567L;
		System.out.println(integerNum);
		System.out.println(longNum);
		
		System.out.println("----------------");
		
		char ch = 'A';
		System.out.println(ch);
		ch = 66;
		System.out.println(ch);
		ch = 'a';
		System.out.println(ch);
		
		int chin = 'A';
		System.out.println(chin);
		
		double doubleNum = 3.14;
		float floatNum = 3.14f;
		System.out.println(doubleNum + "  " + floatNum);
		
		
		final double PI = 3.1419; // 실수
		// PI - 234.1;		// 상수는 재할당 불가
		
		
		int iNum = binNum;
		System.out.println(iNum);
		iNum = (int) longNum;
		System.out.println(iNum);
		System.out.println(longNum + " " + iNum);
		iNum = (int) floatNum;
		System.out.println(floatNum + " " + iNum);
		doubleNum = floatNum + iNum;
		System.out.println(" * " + doubleNum);
		
		floatNum = 8.9f;	// doubleNum = 6.14 // floatNum = 8.9
		int iNum1 = (int)(doubleNum + floatNum);		// 6.14 + 8.9 = 15.04의 형변환 = 15
		int iNum2 = (int)(doubleNum) + (int)(floatNum); // 6 + 8 = 14
		System.out.println(iNum1);
		System.out.println(iNum2);
		System.out.println(iNum1 + " " + iNum2);
		System.out.println(6.14+8.9);
		
	}	
}
