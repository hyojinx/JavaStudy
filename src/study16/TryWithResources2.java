package study16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResources2 {
	public static void main(String[] args) {
		String path ="C:\\Users\\kosmo\\eclipse-workspace\\javastudy\\src\\study16\\";
		try(
			Scanner sc = new Scanner(new File(path+"input.txt"));
				PrintWriter pw = new PrintWriter(new File(path+"output.txt"));
			){
			String inputContent = sc.nextLine();
			System.out.println(inputContent);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
