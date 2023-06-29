package test1;



public class Exam03 {
	public static void main(String[] args) {
		//A class에 10명의 학생이 성적이 아래와 같다면 평군값은 ?
		int[] scores = {70,60,55,75,95,90,80,80,85,100};
		int sum=0;
		double avg =0;
		//for
		System.out.println("for문");
		for(int i =0; i<scores.length;i++) {
			sum += scores[i];
			
		}
		avg=(double)sum/scores.length;
		System.out.println("총점: "+sum);
		System.out.println("평균: "+avg);
		System.out.println("------------------------");
		//향상된 for 
		System.out.println("향상된 for문"
				+ "");
		sum = 0;
		avg=0;
		for(int i:scores) {
			sum+=i;
		}
		avg=(double)sum/scores.length;
		System.out.println("총점: "+sum);
		System.out.printf("평균: %.1f ",avg);
		System.out.println();
		
	}
	


}


