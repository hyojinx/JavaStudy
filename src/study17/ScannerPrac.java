package study17;

import java.io.*;
import java.util.Scanner;

public class ScannerPrac {
	public static void main(String[] args) {
		File file = new File("src/study17/files/input.txt");
		int sum = 0 ;
		try(Scanner sc = new Scanner(file)){
			while(sc.hasNextInt()) {
				sum+=sc.nextInt();
			}
			System.out.println("전체값:"+sum);
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	}
}
