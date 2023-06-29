package study03;

public class StudentTest {

	public static void main(String[] args) {
		Student Lee = new Student("이순신",3);
		Lee.addSubject("국어", 80);
		Lee.addSubject("영어", 10);
		Lee.addSubject("국사", 100);
		
		Student Kim = new Student("김구",4);
		Kim.addSubject("국어", 100);
		Kim.addSubject("수학", 50);
		Kim.addSubject("과학", 80);
		System.out.println("====================");
		System.out.println("=     성적 출력      =");
		System.out.println("====================");
		Lee.showInfo();
		System.out.println("====================");
		Kim.showInfo();
		Lee.showSequentialNumber();
		Kim.showSequentialNumber();

	}

}
