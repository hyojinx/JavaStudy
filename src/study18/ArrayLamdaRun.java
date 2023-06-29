package study18;

public class ArrayLamdaRun {
	public static void main(String[] args) {
		ArrIF aif = new ArrIF() {
			public int[] sizeOfArray(int length) {
				return new int[length];
			}
		};
		int[] arr1 = aif.sizeOfArray(4);
		System.out.println(arr1.length);
		
		 aif = (int length) -> {return new int[length];};
		 aif = length -> new int[length];
		 int [] arr2 = aif.sizeOfArray(10);
		 aif = int[]::new;
		 System.out.println(aif.sizeOfArray(10).length);
		 
		 ConstLamda c1 = new ConstLamda() {
			 @Override
			 public TwoConst getInstance() {
				 return new TwoConst();
			 }
		 };
		 TwoConst tc = c1.getInstance();
		 
		 	c1 = ()->{return new TwoConst();};
		 	c1 = ()->new TwoConst();
		 	c1 = TwoConst::new;
		 	c1.getInstance();
		 	
		 	ConstLamdaWithParam clp = new ConstLamdaWithParam() {
				
				@Override
				public TwoConst getInstance(String str) {
					return new TwoConst(str);
				}
			};
			clp.getInstance("HI");
			
			clp = (String str)->{return new TwoConst(str);};
			clp = str -> new TwoConst(str);
			clp = TwoConst::new;
			clp.getInstance("HI");
	}
}

interface ArrIF{
	int[] sizeOfArray(int length);
}
class TwoConst{
	TwoConst(){
		System.out.println("기본 생성자");
	}
	TwoConst(String str){
		System.out.println("매게변수 생성자"+str.toString());
	}
}
interface ConstLamda{
	TwoConst getInstance();
}
interface ConstLamdaWithParam{
	TwoConst getInstance(String str);
}
