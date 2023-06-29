package study11_1;

class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	public String getStudentNum() {
		return studentNum;
	}
	//Object equals() 학번이 같으면 같은 학생 
//			 hashcode() 학생의 학번의 해귀코드 반환
	
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
		Student s = (Student)obj;
		if(studentNum.equals(s.studentNum)) {
			return true;
		}
	}
	return false;
	
}
}


public class StudentExam {

		
	public static void main(String[] args) {
		Student s1 = new Student("100");
		Student s2 = new Student("200");
		Student s3 = new Student("200");
		sameStudent(s1, s2);
		sameStudent(s1, s3);
		sameStudent(s2, s3);
		
	}
	public static void sameStudent(Student a, Student b) {
		if(a.equals(b)) {
			System.out.println("같은 학생이다.");
		}
		else {
			System.out.println("다른 학생이다.");
		}
		System.out.println(a.hashCode()+" "+b.hashCode());
		
	}

}
