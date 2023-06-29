package project;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SongRecommendation {
    
	public void songRecommend(File file) throws IOException {
	    BufferedReader br = new BufferedReader(new FileReader(file));
	    int lineNum = 2;
	    String line;
	    String line2;
	    for (int i = 0; i < lineNum; i++) {
	        br.readLine();
	    } 
	    List<String> bookmarkedSongs = new ArrayList<>();
	    while ((line = br.readLine()) != null) {
	        String membersSong = "src/project/song/" + line;
	        String songFileName = line.trim();
	        if (!songFileName.isEmpty()) {
	            bookmarkedSongs.add(songFileName);
	        }
	        
	    }
	        File allSongsDir = new File("src/project/song/");
	        for (File songFile : allSongsDir.listFiles()) {
	        	String songFileName2 = songFile.getName();
	        	if (!bookmarkedSongs.contains(songFileName2)) {
	        		BufferedReader br2 = new BufferedReader(new FileReader(songFile));
	        		String artist = "";
	        		String genre = "";
	        		List<String> codeArr = new ArrayList<>();
	        		int lineCount = 0;
	        		while ((line2 = br2.readLine()) != null) {
	        			String[] parts2 = line2.split(":");
	        			if (parts2[0].equals("가수")) {
	        				artist = parts2[1];
	        			} else if (parts2[0].equals("장르")) {
	        				genre = parts2[1];
	        			} else if (lineCount == 3) {
	        				codeArr.add(parts2[1]);
	        			} else if (lineCount > 3) {
	        				codeArr.set(lineCount - 4, codeArr.get(lineCount - 4) + "\n" + line2);
	        			}
	        			lineCount++;
	        		}
	        		br2.close();		        		
	        		
	        double score = 0;
	        for (String bookmarkedSong : bookmarkedSongs) {
	            BufferedReader br3 = new BufferedReader(new FileReader("src/project/song/" + bookmarkedSong));
	            String bookmarkedArtist = "";
	            String bookmarkedGenre = "";
	            List<String> bookmarkedCodeArr = new ArrayList<>();
	            int bookmarkedLineCount = 0;
	            while ((line2 = br3.readLine()) != null) {
	                String[] parts2 = line2.split(":");
	                if (parts2[0].equals("가수")) {
	                    bookmarkedArtist = parts2[1];
	                } else if (parts2[0].equals("장르")) {
	                    bookmarkedGenre = parts2[1];
	                } else if (bookmarkedLineCount == 3) {
	                    bookmarkedCodeArr.add(parts2[1]);
	                } else if (bookmarkedLineCount > 3) {
	                    bookmarkedCodeArr.set(bookmarkedLineCount - 4, bookmarkedCodeArr.get(bookmarkedLineCount - 4) + "\n" + line2);
	                }
	                bookmarkedLineCount++;
	            }
	            br3.close();
	            
	            if (bookmarkedArtist.equals(artist)) {
	                score += 1;
	            }
	            if (bookmarkedGenre.equals(genre)) {
	                score += 0.5;
	            }
	            for (String bookmarkedCode : bookmarkedCodeArr) {
	                if (codeArr.contains(bookmarkedCode)) {
	                    score += 2;
	                }	
	            }
	            
	        }
	        br.close();
	            if (score >= 1.5) {
	            	System.out.println(songFile.getName().replace(".txt", ""));
	            	
	            	}
	            
	            	
	        	}
	        }
	}
}
   