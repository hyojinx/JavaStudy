package study15_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NumberConvert {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(
				Arrays.asList(7,3,2,1,1,2,9,6,4,7,3,5,8,10,4));
		//중복 제거, 오름 차순
		TreeSet<Integer> numbers2 = new TreeSet<>(numbers);			//방법1
		System.out.println(numbers2);
		NavigableSet<Integer> numbers3= new TreeSet<>(numbers).descendingSet();	//역순
		System.out.println(numbers3);
		System.out.println();
		System.out.println();
		ArrayList<Integer> result = new ArrayList<>();				//방법2
		for(Integer a:numbers) {
			if(!result.contains(a)) {
				result.add(a);
			}
		}
		System.out.println(result);
		Collections.sort(result);
		System.out.println(result);
		System.out.println();
		//랜덤으로 1-10사이 20개의 숫자를 list에 저장하고
		//중복제거 오름차순 내림차순으로 출력
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i =0;i<20;i++) {
			list.add((int)(Math.random()*10+1));			
		}
		System.out.println(list);
		System.out.println(new TreeSet<Integer>(list));	//오름차순
		System.out.println(new TreeSet<Integer>(list).descendingSet());//내림차순
		
	}
}
