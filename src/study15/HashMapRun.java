package study15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapRun {
public static void main(String[] args) {
		HashMap<Integer,String>hmap = new HashMap<>();
		//추가
		hmap.put(2,"홍길동");
		hmap.put(4,"김유신");
		hmap.put(3,"유관순");
		hmap.put(1,"이순신");
		System.out.println(hmap.toString());
		
		HashMap<Integer, String> hmap2 = new HashMap<>();
		hmap2.putAll(hmap);
		System.out.println(hmap2);
		hmap.put(1, "이방원");
		hmap2.putAll(hmap);		
		System.out.println(hmap2);
		
		hmap.putIfAbsent(5,"무지개");		//해당 항목이 없으면 추가
		hmap.putIfAbsent(3,"무지개");
		System.out.println(hmap);
		//수정
		hmap.replace(3, "김구");		//key값만 비교
		hmap.replace(9, "김구");
		System.out.println(hmap);
		//읽기
		System.out.println(hmap.get(3));
		System.out.println(hmap.getOrDefault(100, "기본값"));		//100이 있으면 100의 값 없으면 "기본값"출력
		
		Set<Map.Entry<Integer,String>>entrySet =hmap.entrySet();
		System.out.println(entrySet);
		
		Set<Integer>keyset = hmap.keySet();
		System.out.println(keyset);
		System.out.println(hmap.values());
		//개수
		System.out.println(hmap.size());
		//조회
		System.out.println(hmap.containsKey(4));
		System.out.println(hmap.containsValue("김구"));
		System.out.println(hmap.containsValue("임꺽정"));
		//삭제
		System.out.println(hmap.remove(4));
		System.out.println(hmap.remove(2,"홍길동"));		//value값을 확인
		System.out.println(hmap);
		
		hmap.clear();
		System.out.println(hmap.isEmpty());
		//반복
		Set<Integer> kset = hmap2.keySet();
		for(Integer key:kset) {
			System.out.printf("키:%d 값:%s ",key,hmap2.get(key));	
		}
		System.out.println();
		Iterator<Integer>keys = kset.iterator();
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.printf("키:%d 값:%s ",key,hmap2.get(key));
		}
		System.out.println();
		
		
	}
}
