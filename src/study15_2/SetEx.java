package study15_2;

import java.util.TreeSet;

public class SetEx {
	public static void main(String[] args) {
		TreeSet<Student> tSet = new TreeSet<>();
		tSet.add(new Student("lee",96));
		tSet.add(new Student("hong",86));
		tSet.add(new Student("song",92));
		
		
		
		Student student = tSet.last();
		System.out.println("최고 점수:"+student.score);
		System.out.println("최고 득점자:"+student.name);
	}
}

class Student implements Comparable<Student>{
	String name;
	int score;
	Student(String name,int score){
		this.name =name;
		this.score=score;
	}
	@Override
	public int compareTo(Student o) {
		return this.score-o.score;
//		if(this.score>o.score) {
//			return 1;
//		}
//		else if(this.score==o.score) {
//			return 0;
//		}
//		else {
//			return -1;
//		}
		
	}
	
	
}