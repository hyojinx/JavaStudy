package study15_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SetCalPrac {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3,4,5,6));
		ArrayList<Integer> intersaction = new ArrayList<>();//교집합
		ArrayList<Integer>union = new ArrayList<>();//합칩합
		ArrayList<Integer>subtraction = new ArrayList<>();//차칩합
		
		//적당한 코드 작성
		for(int i=0;i<list1.size();i++) {
			for(int j =0; j<list2.size();j++) {
				
			if(list1.get(i)==list2.get(j)) {
				intersaction.add(list1.get(i));
				}
			}
		}
//		intersaction.addAll(list1);
//		intersaction.retainAll(list2);
		
	
		//합집합
		HashSet<Integer> temp = new HashSet<>();
		temp.addAll(list1);
		temp.addAll(list2);
		union.addAll(temp);
		
		
		//차집합
//		subtraction.addAll(list1);
//		subtraction.removeAll(list2);
		for(int i:list1) {
			if(!(list2.contains(i))) {
				subtraction.add(i);
			}
		}
		
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println("교집합:"+intersaction);
		System.out.println("합집합:"+union);
		System.out.println("차집합:"+subtraction);
		
		
			
		}
	}
