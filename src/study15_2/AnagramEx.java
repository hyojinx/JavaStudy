package study15_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AnagramEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 문자 입력:");
		String a =scan.next();
		System.out.print("두번째 문자 입력:");
		String b =scan.next();
		boolean result = isAnagram(a,b);
		System.out.print("두 단어는");
		System.out.println(result?" Anagram이다.":"Anagram이 아니다.");
	}
	
	static boolean isAnagram(String a, String b) {
		char[] arr1 = a.toCharArray();
		char[] arr2 = b.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);
	
		return Arrays.equals(arr1,arr2); 
	}
}
