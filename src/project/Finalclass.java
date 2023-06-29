package project;
import java.io.IOException;
import java.util.Scanner;


public class Finalclass {
    public static void main(String[] args) throws IOException {
       onlyMember om = new onlyMember();
       NoneMember nm = new NoneMember();
        System.out.println("-----------------------------------------");
        System.out.println("            음악          정보             ");
        System.out.println("-----------------------------------------");
        System.out.print("1.로그인        2.회원가입        3.비회원으로 이용");
        Scanner menu = new Scanner(System.in);
        int menuNum = menu.nextInt();
        if(menuNum==1) {
          om.membership();
        }
        else if(menuNum==2) {
        	om.newmembership();
        }
        else {
        	nm.nonememberinfo();
        	
        }
        

    }
}