package study10;

public class CalcTest {
	public static void main(String[] args) {
		Calc cal = new CompleteCalc();
		int n1 = 14,n2=7;
		System.out.println(cal.add(n1, n2));
		System.out.println(cal.sub(n1, n2));
		System.out.println(cal.times(n1, n2));
		System.out.println(cal.div(n1, n2));
		n2=0;
		System.out.println(cal.div(n1, n2));
		System.out.println(cal.PI);
		System.out.println(cal.times(n1, (int)cal.PI));
		
		cal.desc();
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));
		
	}
}