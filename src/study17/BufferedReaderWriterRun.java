package study17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderWriterRun {
	public static void main(String[] args) {
		File file  = new File("src\\study17\\files\\FileReadWriter.txt");
		try(
			Writer writer = new FileWriter(file);
			Reader	reader = new FileReader(file);	
			BufferedWriter bw  =new BufferedWriter(writer);
			BufferedReader br = new BufferedReader(reader);
				
			){
			bw.write("Seoul Korea\n".toCharArray());
			bw.write(123);
			bw.write("come to my home",3,8);
			bw.flush();
			
			String data;
			while((data=br.readLine())!=null) {
				System.out.println(data);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
