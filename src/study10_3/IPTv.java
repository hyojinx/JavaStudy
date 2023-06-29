package study10_3;

public class IPTv extends ColorTv{
	private String address;
	public IPTv(String address, int size, int resolution) {
		super(size, resolution);
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public void printProperty() {
		System.out.println("IPTV는 "+address+" 주소의 "+getSize()+"인치 "+getResolution()+"컬러");
	}
}
