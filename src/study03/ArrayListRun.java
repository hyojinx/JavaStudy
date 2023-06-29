package study03;
import java.util.ArrayList;

public class ArrayListRun {

	public static void main(String[] args) {
		//class 객체오 생성
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>(10);
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("안녕하세요");
		strList.add("반가워요");
		System.out.println(strList);
		System.out.println(strList.size());
		System.out.println(list3.size());
		strList.add(1, "종호");       //해당 인덱스에 요소 삽입
		System.out.println(strList);
		System.out.println(strList.size());
		strList.set(2, "아름");       //해당 인덱스의 요소 값 수정
		System.out.println(strList);
		System.out.println(strList.size());
		strList.remove("종호");        //동일객체 삭제
		System.out.println(strList);
		System.out.println(strList.size());
		strList.remove(1);           //해당 인덱스의 값 삭제
		System.out.println(strList);
		System.out.println(strList.size());
		strList.clear();             //해당 내용 삭제
		System.out.println(strList);
		System.out.println(strList.size());
		
		strList.add("이재민");
		strList.add("박민수");
		strList.add("강민정");
		strList.add("공승환");
		System.out.println(strList);
		for(int i=0;i<strList.size();i++) {
			System.out.print(strList.get(i)+" ");
		}
		System.out.println();
		for(String i:strList) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(strList.contains("박민수"));
		if(strList.indexOf("박민수")>=0) {
			System.out.println("있네여");
		}
		else {
			System.out.println("없네여");
		}
		System.out.println(strList.indexOf("박민수"));
		
		
		//복사
		
		//clone()
		ArrayList<String> newStr1 = (ArrayList<String>)strList.clone();
		
		printArrayList(newStr1);
		//addAll()
		ArrayList<String> newStr2 = new ArrayList<>();
		newStr2.addAll(strList);
		printArrayList(newStr2);
		//for
		ArrayList<String> newStr3 = new ArrayList<>();
		for(String str:strList) {
			newStr3.add(str);
		}
		printArrayList(newStr3);
		//isEmpty()
		System.out.println(newStr3.isEmpty());
		newStr3.clear();
		System.out.println(newStr3.isEmpty());
		
		
		
	}
	
	 static void printArrayList(ArrayList<String> arr) {
		for(String str:arr) {
			System.out.print(str+" ");
		}
		System.out.println();
	}
	
}
