package study15_2;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		//값 추가
		map.put("lee", 96);
		map.put("hong", 86);
		map.put("song", 92);
		String name = "";
		int maxPoint = 0;
		int totalPoint = 0;
		
		//keyset
//		for(String str : map.keySet()) {
//			totalPoint+=map.get(str);
//			if(maxPoint<map.get(str)) {
//				maxPoint = map.get(str);
//				name = str;
//			}			
//		}
		
		
		//entryset
		for(Map.Entry<String,Integer>entry:map.entrySet()) {
			totalPoint+=entry.getValue();
			if(maxPoint<entry.getValue()) {
				maxPoint=entry.getValue();
				name = entry.getKey();
			}
		}
		
		
		System.out.println("평균점수:"+totalPoint/map.size());
		System.out.println("최고 점수:"+maxPoint);
		System.out.println("최고 득점자:"+name);
	}
}
