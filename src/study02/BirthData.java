package study02;

class Birthday {
	// 필드 멤버변수
	private int date;
	private int month;
	private int year;

	// 생성자
	public Birthday() {
//		this.year = 1995;
//		this.month = 7;
//		this.date = 13;
		this(1993, 02, 01);
	}

	public Birthday(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
		
	}
	public int getMonth() {
		return month;
	}
	public int getDate() {
		return date;
	}
	public int getYear() {
		return year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String showBirthday() {
		return year + "년" + month + "월" + date + "일";
	}

}

public class BirthData {
	public static void main(String[] args) {
		Birthday bDay1 = new Birthday();
		
//		bDay1.setYear(2000);
		System.out.println(bDay1.getYear());
		System.out.println(bDay1.getMonth());
		System.out.println(bDay1.getDate());
		
		Birthday bDay2 = new Birthday(1994,04,18);
		System.out.println(bDay2.showBirthday());
	}
}
