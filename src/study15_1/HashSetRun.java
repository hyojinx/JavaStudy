package study15_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetRun {
	public static void main(String[] args) {
		//객체 생성
		Set<String> hset1 = new HashSet<>();
		HashSet<String> hset2 = new HashSet<>();
		//추가
		hset1.add("일식이");
		hset1.addAll(Arrays.asList("이식이","삼식이","사식이","오식이"));
		//다음 객체로 내용 이동
		hset2.addAll(hset1);
		//반복
		for(String str:hset1) {
			System.out.print(str+" ");
		}
		System.out.println();
		Iterator<String> iter = hset1.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		//삼식이 있는지 확인하고 있으면 구식이 추가 없으면 오식이 삭제
		if(hset1.contains("삼식이")) {
			System.out.println("삼식이 있네요 구식이 추가!");
			hset1.add("구식이");
		}
		else {
			System.out.println("삼식이 없네요 오식이 삭제!");
			hset2.remove("오식이");
		}
		System.out.println(hset1);
		
		//배열로 변환해서 반복문으로 출력
		String[] list = hset1.toArray(new String[0]);
		for(String str:list) {
			System.out.print(str+" ");
		}
		
	}
}
