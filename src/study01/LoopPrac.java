package study01;

import java.util.Iterator;

public class LoopPrac {

	public static void main(String[] args) {

		int line = 4;
		/*
		 
		 *****
		 *****
		 *****
		 *****
		 ﻿
		 */
		System.out.println("1번 그림");
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("-----------------");
		/*
		 
		 *
		 **
		 ***
		 ****
		 ﻿
		 */
		System.out.println("2번 그림");
		for (int i = 0; i < line; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("-----------------");

		/*
		 
		 ****
		 ***
		 **
		 *	
		 
		 */
		System.out.println("3번 그림");
		for (int i = 0; i < line; i++) {
			for (int j = 1; j <= line - i; j++) {
				System.out.print("*");
			}
			System.out.println("");

		}
		System.out.println("-----------------");

		/*
		 
		 *
		 **
		 ***
		 ****
		 ***
		 **
		 *
		 
		 */
		System.out.println("4번 그림");
		line = 7;
		int star = 1;
		for (int i = 0; i < line; i++) {
			for (int k = 0; k < star; k++) {
				System.out.print("*");
			}
			if (i < line / 2) {
				star++;
			} else {
				star--;
			}
			System.out.println("");
		}
		System.out.println("-----------------");		
		
		/*
		 * 공백 이용하여 라인 만들기
		 */
		
		System.out.println("5번 그림");
		line = 4;
		int space = 3;
		star = 1;

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < star; k++) {
				System.out.print("*");
			}
			space--;
			star++;
			System.out.println("");
			
		}
		System.out.println("-----------------");
		
		System.out.println("6번 그림");
		line = 4;
		
		for (int i = 0; i < line; i++) {
			for (int j = 0; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < star; k++) {
				System.out.print("*");
			}
			space++;
			star--;
			System.out.println("");
		}
		System.out.println("-----------------");
		System.out.println("7번 그림");
		line = 7;
		star = 1;
		space = line/2;
		
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < star; k++) {
				System.out.print("*");
			}
				if ( i < line/2 ) {
					space--;
					star+=1;
				} else {
					space++;
					star-=1;
				}
			System.out.println("");
		}
		
		/*
		 
		     *
		    ***
		   *****
		  *******
		  
		 */
		System.out.println("8번 그림");
		line = 4;
		space = line -1;
		star = 1;

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < star; k++) {
				System.out.print("*");
			}
			space--;
			star+=2;
			// star = star + 2;
			System.out.println("");
		}
		System.out.println("-----------------");

		System.out.println("9번 그림");
		line = 7;
		star = 1;
		space = line/2;
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < star; k++) {
				System.out.print("*");
			}
			if (i < line/2) {
				space--;
				star+=2;
			} else {
				space++;
				star-=2;
			}
			System.out.println("");
		}

	}
}
