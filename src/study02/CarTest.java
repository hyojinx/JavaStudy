package study02;

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car();
		// c.carNum 사용불가 // Car에서 private 접근불가
		int speed = c.speed;	// default
		c.getSpeed();	// protected 접근가능
		c.getCarNum();	// public 접근가능
	}
}
