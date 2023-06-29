package project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class FavoritesSong {
	Login login = new Login();
	SearchSong song = new SearchSong();
	SongRecommendation srd = new SongRecommendation();
	public void selectFavorite() throws IOException{
		login.showInfo();
		while(true) {
			
		System.out.println("-----------------------------------------");
		System.out.println("1.노래 검색                   2.노래 추천     "); 
		System.out.println("-----------------------------------------");
		Scanner sm = new Scanner(System.in);
		int selectmenu = sm.nextInt();
		if(selectmenu == 1) {	
		while(true) {
		
		song.search();
		File selectmember = login.getCheckFile();
		File selectFile  = song.getSelectedFile();
		String selectedsong = selectFile.getName();
			String line = "";
			BufferedWriter bw = new BufferedWriter(new FileWriter(selectmember,true));
			BufferedReader br = new BufferedReader(new FileReader(selectmember));
			boolean isSong = false;
            while ((line = br.readLine()) != null) {
                if(line.equals(selectedsong)) {
                	System.out.println("이미 즐겨찾기 한 노래입니다.");
                	System.out.print("즐겨찾기에서 삭제 하시겠습니까?(y/n)");
                	String delselect = sm.next();
                	if(delselect.equals("y")||delselect.equals("Y")) {
                		deleteSong(selectmember, selectedsong);
                	}
                	else {
                		
                	}
                	isSong = true;
                	break;
                }
            }
            br.close();
            
            if(!isSong) {
            	System.out.print("즐겨찾기로 등록하시곘습니까?(y/n):");
            	String yesOrno = sm.next();
            	if(yesOrno.equals("y")||yesOrno.equals("Y")) {
                	bw.write(selectedsong);
                	bw.newLine();
                	bw.flush();
                	bw.close();             
            }
            else if(yesOrno.equals("n")||yesOrno.equals("N")) {
            }
		}
			
		System.out.print("다른 노래 검색하시겠습니까?(y/n):");
		String more = sm.next();
		if(more.equals("y")||more.equals("Y")) {
			continue;
		}
		else if(more.equals("n")||more.equals("N")) {
			System.out.print("메뉴로 돌아가시겠습니까?(y/n)");
			String gotomenu = sm.next();
			if(gotomenu.equals("y")||gotomenu.equals("Y"))
			{
				break;
			}
			else {
				System.out.println("이용해주셔서 감사합니다.");
				return;
			}
		}
		
		}
		
	}
		else if(selectmenu==2) {
			System.out.println("회원님의 이 노래는 어떠세요?^^");
			File selectmember = login.getCheckFile();
			srd.songRecommend(selectmember);
			System.out.println("메뉴로 돌아가시겠습니까?(y/n)");
			String gotomenu = sm.next();
			if(gotomenu.equals("y")||gotomenu.equals("Y"))
			{
				continue;
			}
			else {
				
				break;
			}
			
			
		}
	}
		System.out.println("이용해 주셔서 감사합니다.");
}

		public void deleteSong(File file, String song) throws IOException {
		    List<String> lines = new ArrayList<>();
		    BufferedReader br = new BufferedReader(new FileReader(file));
		    String line;
		    while ((line = br.readLine()) != null) {
		        if (!line.equals(song)) {
		            lines.add(line);
		        }
		    }
		    br.close();
		    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		    for (String s : lines) {
		        bw.write(s);
		        bw.newLine();
		    }
		    bw.flush();
		    bw.close();
		}
		
}
	


