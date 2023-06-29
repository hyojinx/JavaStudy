package study17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedTimeTestRun {
	public static void main(String[] args) {
		
	File fileOrigen = new File("src\\study17\\files\\hype boy.png");
	File copyFile1 = new File("src\\study17\\files\\hype boy_c1.png");
	File copyFile2 = new File("src\\study17\\files\\hype boy_c2.png");
	
	long t1,t2;
	t1=System.nanoTime();
	try (
		InputStream is =new FileInputStream(fileOrigen);
		OutputStream os = new FileOutputStream(copyFile1);
		
	){
		int data;
		while((data=is.read())!=-1) {
			os.write(data);
		}
	}catch(IOException e) {
		e.printStackTrace();
	}
	t1 = System.nanoTime() -t1;
	System.out.println("버퍼없이 실행"+t1);
	t2=System.nanoTime();
	try (
			InputStream is =new FileInputStream(fileOrigen);
			OutputStream os = new FileOutputStream(copyFile2);
			BufferedInputStream bis = new BufferedInputStream(is);
			BufferedOutputStream bos = new BufferedOutputStream(os)
			
		){
			int data;
			while((data=bis.read())!=-1) {
				bos.write(data);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	t2=System.nanoTime() -t2;
	System.out.println("버퍼사용 싫행"+t2);
	System.out.println(t1/t2);
	
	}
}
