package test2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


public class IOTest {
	public static void main(String[] args) throws IOException {
		//FileOutputStream OutputStreamWriter를 활용 a.txt 파일 출력
		//자바공부 열심히.
		File file = new File("src/test2/files/a.txt");
		OutputStream fio = new FileOutputStream(file);
		OutputStreamWriter osw = new OutputStreamWriter(fio);
		osw.write("자바공부 열심히.");
		osw.flush();
		osw.close();
		fio.close();
		
//		FileReader fr = new FileReader(file);
//		 int ch;
//	        while ((ch = fr.read()) != -1) {
//	            System.out.print((char) ch);
//		
//	
//	        }
		
		
		
	}
}
