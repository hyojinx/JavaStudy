package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class SearchSong {
	private File  selectedFile;
    public void search() throws IOException {
        while(true) {
        	
    	Scanner sc = new Scanner(System.in);
        System.out.print("찾고 싶은 가수나 제목을 입력해주세요: ");
        String songName = sc.next();
        File songFile = new File("src/project/song/");
        File[] files = songFile.listFiles((f, name) -> name.contains(songName) && name.endsWith(".txt"));
        if (files.length == 0) {
            System.out.println("해당 노래가 존재하지 않습니다.");
            continue;
        }
        else {
        	System.out.println("검색 내역:");
        	for (int i = 0; i < files.length; i++) {
        		System.out.println(i + 1 + ". " + files[i].getName().replace(".txt", ""));
        	}
        	int selectedIndex = sc.nextInt() - 1;
        	selectedFile = files[selectedIndex];
        	
        	try (BufferedReader br = new BufferedReader(new FileReader(selectedFile))) {
        		String line = "";
        		while ((line = br.readLine()) != null) {
        			System.out.println(line);
        		}
        		break;
        	}
        }
    }
  }
	public File getSelectedFile() {
		return selectedFile;
	}
    
}