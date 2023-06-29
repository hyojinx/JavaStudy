package study06;

public class CarMain {
	//필드
	private String carName;
	private String model;
	private int size;
	//생성자
	CarMain(){};
	CarMain(String carName, String model, int size){
		this.carName=carName;
		this.model = model;
		this.size = size;
	}
	//메서드
	void  Accelerate() {
		System.out.println("가속");
	}
	void Gear_Change(){
		System.out.println("기어 변경");
	}
	void Decelerate(){
		System.out.println("감속");
	}
	//getter setter
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
}
