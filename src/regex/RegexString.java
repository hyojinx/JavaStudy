package regex;

public class RegexString {
	public static void main(String[] args) {
		//match()
		String txt = "123456";
		boolean result1 = txt.matches("[0-9]+");
		System.out.println(result1);
		
		//replaceAll()
		String txt2 ="study2023*-;";
		String res2 = txt2.replaceAll("[^a-z0-9]", "!");
		System.out.println(res2);
		
		//split()
		String[] txt3 = txt2.split("\\d+");
		for(String tt:txt3) {
			System.out.println(tt);			
		}
		
	}
}
