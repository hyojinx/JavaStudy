package test2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest2 {
	public static void main(String[] args) {
		 
		 System.out.println(question1());
		 System.out.println(question2());
	}
	private final static List<String> SPELLS = 
			Arrays.asList("Tomas","a","hELLO","B","Korea","X","nutella");
	//list에 저장된 단어에 첫번째 문자가 각각 몇개있는지 
	//Map<String,Integer>로 반환 예)("X",1),("a",1)...
	static Map<String,Integer> question1(){
		return SPELLS.stream().map(spell->spell.substring(0,1)).collect(Collectors.toMap(head->head,head->1,(oldVal,newVal)->oldVal+=newVal));
		
	}
	//list에 저장된 단어들 중에서 단어의 길이가 2이상인 경우에
	//모든 단어를 대문자로 변환하여 구분자를 스페이스로 하는 문자열로 반환
	static String question2(){
		return SPELLS.stream().filter(s -> s.length() >= 2).map(s->s.toUpperCase()).collect(Collectors.joining(" "));

	}
}
