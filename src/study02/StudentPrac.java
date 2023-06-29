package study02;

public class StudentPrac {
	public static void main(String[] args) {
		Student stA = new Student();
		stA.korea.setSubjectname("한국");
		System.out.println(stA.korea.getSubjectname());
		
		Student stB = new Student(100, "이순신", "남성");
		stB.english = new Subject();
		System.out.println(stB.english.getSubjectname());
		
		stA.studentid = 200;
		stA.studentname = "홍길동";
		stA.address = "서울 어딘가";
		stA.gender = "남성";
		
		stA.showStudentInfo();
	}
}
