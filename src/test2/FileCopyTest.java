package test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileCopyTest {
	public static void main(String[] args) {
		int data;
		int num=1;	//줄번호
		boolean isNewLine = true;
		//불로올 파일 경로+이름
		String target = "src/study17/FileClassRun.java";
		//새로 만들 파일 경로 + 이름
		String dest = "src/test2/files/FileClassRunNum.java";
		try (
			FileInputStream fis = new FileInputStream(target);
			FileOutputStream fos = new FileOutputStream(dest);
			InputStreamReader isr = new InputStreamReader(fis);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			){
			while((data=isr.read())!=-1) {
				if (isNewLine) {    
	                osw.write("//"+num+":     ");
	                isNewLine = false;
	            }
	            osw.write(data);
	            if (data == '\n') { 
	                isNewLine = true;
	                num++;
	            }
	        }
			osw.flush();
			osw.close(); isr.close();
			fos.close();fis.close();
			
			
		}catch(FileNotFoundException e) {
			System.out.println("다음 파일이 없습니다. :"+target);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
