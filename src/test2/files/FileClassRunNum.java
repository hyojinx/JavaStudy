//1:     package study17;
//2:     
//3:     import java.io.File;
//4:     import java.io.IOException;
//5:     import java.nio.charset.Charset;
//6:     
//7:     public class FileClassRun {
//8:     	public static void main(String[] args) throws IOException {
//9:     		String path = "C:\\Users\\kosmo\\eclipse-workspace\\javastudy\\src\\study17\\files";
//10:     		File dir = new File(path);
//11:     		if(!dir.exists()) {
//12:     			dir.mkdir();
//13:     		}
//14:     		System.out.println(dir.exists());
//15:     		
//16:     		File file = new File(path+"\\TestFile.txt");
//17:     		if(!file.exists()) {
//18:     			file.createNewFile();
//19:     		}
//20:     		System.out.println(file.exists());
//21:     		
//22:     		File file2 = new File("C:\\Users\\kosmo\\eclipse-workspace\\javastudy\\src\\study17\\files\\TestFile.txt");
//23:     		File file3 = new File("C:/Users/kosmo/eclipse-workspace/javastudy/src/study17/files/TestFile.txt");
//24:     		File file4 = new File("C:"+File.separator+"workspace01"+File.separator+"src"+File.separator+"study17"+File.separator+"files"
//25:     				+File.separator+"TestFile.txt");
//26:     		System.out.println(file2.exists()+" "+file2.getAbsolutePath());
//27:     		System.out.println(file3.exists()+" "+file3.getAbsolutePath());
//28:     		System.out.println(file4.exists()+" "+file4.getAbsolutePath());
//29:     		
//30:     		System.out.println(System.getProperty("user.dir"));
//31:     		File file5 = new File("src/study17/files/TestFile.txt");
//32:     		File file6 = new File("src/study17/files/temp/TestFile.txt");
//33:     		System.out.println(file5.exists()+" "+file5.getAbsolutePath());
//34:     		System.out.println(file6.exists()+" "+file6.getAbsolutePath());
//35:     		
//36:     		
//37:     		System.out.println(dir.getName()+" "+dir.isDirectory()+" "+file.getParent());
//38:     		System.out.println(file.getName()+" "+file.isDirectory()+" "+file.getParent());
//39:     		
//40:     		File dir2 = new File(path+"\\temp");
//41:     		System.out.println(dir2.mkdir());
//42:     		
//43:     		File[] files = dir.listFiles();
//44:     		for(File file7:files) {
//45:     			System.out.println(file7.getName()+" "+(file7.isFile()?"파일":">디렉토리"));
//46:     		
//47:     		}
//48:     		
//49:     		Charset cs = Charset.forName("UTF-8");
//50:     		Charset cs2 = Charset.defaultCharset();
//51:     		System.out.println(cs2);
//52:     		System.out.println(Charset.isSupported("EUC-KR"));
//53:     		
//54:     		byte[] arr1 = "재승".getBytes();
//55:     		byte[] arr2 = "현명".getBytes(Charset.defaultCharset());
//56:     		byte[] arr3 = "종호".getBytes(Charset.forName("MS949"));
//57:     		byte[] arr4 = "만수".getBytes("UTF-8");
//58:     		
//59:     		System.out.println(arr1.length);
//60:     		System.out.println(arr2.length);
//61:     		System.out.println(arr3.length);
//62:     		System.out.println(arr4.length);
//63:     		
//64:     		String str1 = new String(arr1);
//65:     		String str2 = new String(arr2,Charset.defaultCharset());
//66:     		String str3 = new String(arr3,Charset.forName("MS949"));
//67:     		String str4 = new String(arr4,"UTF-8");
//68:     		String str5 = new String(arr3,"UTF-8");
//69:     		String str6 = new String(arr4,"MS949");
//70:     		
//71:     		System.out.println(str1);
//72:     		System.out.println(str2);
//73:     		System.out.println(str3);
//74:     		System.out.println(str4);
//75:     		System.out.println(str5);
//76:     		System.out.println(str6);
//77:     		
//78:     		
//79:     	}
//80:     }
