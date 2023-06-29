package test02_10;

import java.util.ArrayList;

public class CalAvg {
		String subject;
		int score;
		CalAvg(String subject, int score){
			this.subject = subject;
			this.score = score;
		}
		public void showInfo() {
			System.out.println(subject+":"+score);
		}
		
		public int getScore() {
			return score;
		}
		public static void main(String[] args) {
			ArrayList<CalAvg>arr = new ArrayList<>();
			int total=0;
			double avg=0;
			CalAvg Kor = new CalAvg("국어",80);
			CalAvg Eng = new CalAvg("영어",75);
			CalAvg Mat = new CalAvg("수학",55);
			arr.add(Kor);
			arr.add(Eng);
			arr.add(Mat);
			
			Kor.showInfo();
			Eng.showInfo();
			Mat.showInfo();
			total=(Kor.getScore()+Eng.getScore()+Mat.getScore());
			avg = (total/arr.size());
			System.out.println("평균: "+avg);
			
	
	
	}
}