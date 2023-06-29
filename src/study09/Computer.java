package study09;

public abstract class Computer {
	Computer(){ 
		System.out.println("computer");
	}
	public void display() {};		//일반 메서드
	public abstract void typing();   //추상 메서드

	
	public void turnOn() {
		System.out.println("전원켜키");
	}
	public void turnOff() {
		System.out.println("전원끄기");
	}
}
