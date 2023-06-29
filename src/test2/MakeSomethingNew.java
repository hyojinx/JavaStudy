package test2;

import java.io.File;
import java.util.Scanner;

public class MakeSomethingNew {
	public static void main(String[] args) {
		//test2.files 아래로 폴더명과 파일명을 입력 받아서 새로 생성
		try{String path="src/test2/files/";
		File file = new File(path);
		Scanner sc = new Scanner(System.in);
		System.out.print("디렉토리 이름:");
		String newdir = sc.next();
		File dir = new File(path+newdir);
		dir.mkdir();
		System.out.println(dir);
		System.out.print("파일 이름ㅣ");
		String newfile = sc.next();
		File file2 = new File(dir+"/"+newfile);
		file2.createNewFile();
	
		System.out.println(file2);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
