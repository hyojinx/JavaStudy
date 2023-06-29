package project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Login {
   private String id;
   private String password;
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public String getPassword() {
      return password;
   }
   public void setPassword(String password) {
      this.password = password;
   }
   private File checkFile;
   private File file;
   public void showInfo() throws IOException {
	   int wrongIdCount =0;
	   int wrongPwCount =0;
	   System.out.println("-----------------------------------------");
       while(true) {
          
       Scanner login = new Scanner(System.in);
         System.out.print("아이디를 입력하세요:");
         String memberId = login.next();
         String checkId = "src/project/member/"+memberId+".txt";
         Path path = Paths.get(checkId);
         checkFile = new File(checkId);
         if(checkFile.exists()) {
            while(true) {
            System.out.print("비밀번호를 입력하세요:");
            String memberPw = login.next();
            Stream<String> lookPw=Files.lines(path);
            String checkPw = lookPw.skip(1).findFirst().get();
            if(memberPw.equals(checkPw)) {
               System.out.println(memberId+"님 어서오세요");
               break;
            }
            else {
               System.out.println("비밀번호가 틀렸습니다. 틀린횟수:"+ ++wrongPwCount);
               if(wrongPwCount==5) {
            	   System.out.println("비밀번호 5회 이상 오류입니다. 잠시 후에 이용해 주세요.");
            	   System.exit(0);
               }
               continue;
            }
            
            }
            break;
         }
         else {
            System.out.println("아이디가 틀렸습니다. 틀린 횟수:"+ ++wrongIdCount);
            if(wrongIdCount==5) {
            	System.out.println("아이디 5회 이상 오류입니다. 잠시 후에 이용해 주세요");
            	System.exit(0);
            }
            continue;
         }
       }
   }
   public void Sign_up() throws IOException{
      System.out.println("------------------------------------");
      System.out.println("            회원 가입 창               ");
      System.out.println("------------------------------------");
      while(true) {   
      System.out.print("사용하실 아이디를 입력하세요:");
      Scanner signup = new Scanner(System.in);
      String newId = signup.next();
      String filename = "src/project/member/"+newId+".txt";
      file = new File(filename);
      if(!file.exists()) {         
      BufferedWriter fw = new BufferedWriter(new FileWriter(file,true));
      fw.write(newId);
      fw.newLine();
      System.out.print("사용하실 비밀번호를 입력하세요:");
      String newpw = signup.next();
      fw.write(newpw);
      fw.newLine();
      fw.flush();
      fw.close();
      System.out.println("로그인 해주세요");
      break;
      }
      else {
         System.out.println("중복된 아이디 입니다.");
         continue;
         
      }
   }
      
   
      
   }
public File getCheckFile() {
	return checkFile;
}
public File getFile() {
	return file;
}
	
   
}