package test1;

public class Account {
	//필드
	 int id;
	 String password;
	 String ownerName;
	 int balance;
	//생성자
	public Account(int id, String password, String ownerName) {
		this.id=id;
		this.password=password;
		this.ownerName=ownerName;
		this.balance = 0;
		System.out.println("계좌 생성 완료");
	}
	public void deposit(int price) {
		balance +=price;
		System.out.println(balance+"원 입금하셨습니다.");
	}
	public int withdraw(int price,String password) {
		if(isCorrectPassword(password)) {
			if(balance<price) {
				return balance;
			}
		
			else{
				return balance -= price;
			 }	
		}
		else {
			return -1;
		}
		
	}
	public int checkBalance(String password) {
		if(isCorrectPassword(password)) {
			return balance;
		}
		else {
			return -1;
		}
	}
	public boolean isCorrectPassword(String password) {
		return this.password.equals(password)?true:false;
//		if(this.password.equals(password)) {
//			return true;
//		}
//		else {
//			return false;
//			
//		}
//
	}
	
	//메소드
	
	
	public static void main(String[] args) {
		//계좌생성
		Account account = new Account(1,"password!@#","park");
		//10만원 입금
		account.deposit(100000);
		//잔액 확인
		System.out.println(account.checkBalance("password!@#"));
		//2만원 출금
		account.withdraw(20000,"password!@#");
		//잔액 확인
		System.out.println(account.checkBalance("password!@#"));
	}
	
	
	
}
