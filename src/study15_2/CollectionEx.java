package study15_2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CollectionEx {
	public static void main(String[] args) {
		int[]arr= {10,20,30,40,50,60,70,40,30,20};
		Set<Integer> set=new HashSet<>();
		for(int i =0; i<arr.length;i++) {
			if(set.contains(arr[i])) {
				System.out.println(arr[i]+" 중복");
			}
			else {
				System.out.println(arr[i]+" 성공");
				set.add(arr[i]);
			}
		}
		System.out.println(set);
	}
}
