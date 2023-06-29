package test2;

import java.io.File;

public class FileDirTest {
	public static void main(String[] args) {
		String path ="C:\\Users\\kosmo\\eclipse-workspace\\javastudy\\src\\";
//		File src = new File(path);
//		//현재폴더의 하부 파일과 디렉토리를 구분하여 출력
//		File[] list = src.listFiles();
//		
//		for(File flist:list) {
//			System.out.print((flist.isFile()?"파일":">폴더"));
//			System.out.println(flist.getName()+" \t"+flist.getPath());
		showHierarchy(path);
		
		}
	static void showHierarchy(String path) {
		File src = new File(path);
		//현재폴더의 하부 파일과 디렉토리를 구분하여 출력
		File[] list = src.listFiles();
		
		for(File flist:list) {
			if(flist.isDirectory()) {
				System.out.println("폴더"+flist.getName()+" \t"+flist.getPath());
				showHierarchy(flist.getPath()); //재귀함수 호출
				
			}
			else {
				System.out.println("파일"+flist.getName()+" \t"+flist.getPath());
			}
			
	}
	
	}
	
	
	
	
	
	
	}

