package study10_3;

public class TVRun {
	public static void main(String[] args) {
		ColorTv ctv = new ColorTv(32,1024);//size,resolution
		ctv.printProperty();
		//32인치 1023컬러 
		IPTv iptv = new IPTv("192.1.1.4",64,2048);
		iptv.printProperty();
	}
}
