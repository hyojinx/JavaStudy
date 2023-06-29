package study02;

public class Student {

	String studentname;
	int studentid;
	String address;
	String gender;

	Subject korea;
	Subject math;
	Subject english;

	public Student() {
		System.out.println("student constructor");
		korea = new Subject();
		math = new Subject();
		english = new Subject();
	}

	public Student(int studentid, String studentname, String gender) {
		this();
		this.studentid = studentid;
		this.studentname = studentname;
		this.gender = gender;
	}

	public String getStudentname() {
		return studentname;
	}

	public void showStudentInfo() {
		System.out.println(studentid + "," + studentname + "," + address + "," + gender);
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public void setSubjectName(String studentname) {
		this.studentname = studentname;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Subject getKorea() {
		return korea;
	}

	public void setKorea(Subject korea) {
		this.korea = korea;
	}

	public Subject getMath() {
		return math;
	}

	public void setMath(Subject math) {
		this.math = math;
	}

	public Subject getEnglish() {
		return english;
	}

	public void setEnglish(Subject english) {
		this.english = english;
	}

}
