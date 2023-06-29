package study14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListRun {
	public static void main(String[] args) {
		//객체 생성
		ArrayList<String> alist = new ArrayList<>();
		List<String> list = new ArrayList<>();
		//요소 추가
		alist.add("태종");
		alist.add("승진");
		alist.add("주환");
		alist.add(1,"소정");
		alist.add(2,"영화");
		System.out.println(alist);
		//요소 읽기
		System.out.println(alist.get(1));
		//요소 삭제
		System.out.println(alist.remove(2));
		System.out.println(alist);
		System.out.println(alist.remove("태종"));
		System.out.println(alist);
		//요소 값 수정
		alist.set(2, "태일");
		System.out.println(alist);
		//요소의 개수
		System.out.println(alist.size());
		//요소의 검색
		System.out.println(alist.contains("승진"));
		System.out.println(alist.indexOf("소정"));
		//반복
		for(int i =0;i<alist.size();i++) {
			System.out.println(alist.get(i));
		}
		System.out.println();
		for(String str:alist) {
			System.out.println(str);
		}
		System.out.println();
		Iterator<String> iter = alist.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		//전체 삭제
		alist.clear();
		System.out.println(alist);
		//배열 정령(sorting)
		alist.add("예진");		
		alist.add("만성");
		alist.add("현우");
		alist.add("시우");
		alist.add("지민");
		alist.add("정기");
		System.out.println(alist);
		Collections.sort(alist);
		System.out.println(alist);
		Collections.sort(alist,Collections.reverseOrder());
		System.out.println(alist);
		
		ArrayList<String> alist2 = new ArrayList<>(Arrays.asList("예진","민성","현우","시우","지민","정기"));
		System.out.println(alist2);
		ArrayList<String> alist3 = new ArrayList<>(List.of("예진","민성","현우","시우","지민","정기"));
		System.out.println(alist3);
		
		
	}
}
