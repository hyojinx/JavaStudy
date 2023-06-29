package study06;

public class Professor {
	private String name;
	private String affiliation;
	private int classDfclt;
	
	Professor(){};
	Professor(String name, String affiliation, int classDfclt){
		this.name = name;
		this.affiliation = affiliation;
		this.classDfclt = classDfclt;
	}
	
	void Attendance() {
		System.out.println("출석 부르기");
	}
	void Give_Task() {
		System.out.println("과제 내주기");
	}
	void Give_Grade() {
		System.out.println("학점 내주기");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAffiliation() {
		return affiliation;
	}
	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}
	public int getlassDfclt() {
		return classDfclt;
	}
	public void setClassDfclt(int classDfclt) {
		this.classDfclt = classDfclt;
	}
	
	
}
