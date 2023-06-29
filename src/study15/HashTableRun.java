package study15;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableRun {
	public static void main(String[] args) {
		Hashtable<Integer,String> htable = new Hashtable<>();
		htable.put(2,"홍길동");
		htable.put(4,"김유신");
		htable.put(3,"유관순");
		htable.put(1,"이순신");
		System.out.println(htable.toString());
		
		Hashtable<Integer, String> htable2 = new Hashtable<>();
		htable2.putAll(htable);
		System.out.println(htable2);
		
		htable.put(1, "이방원");
		htable2.putAll(htable);		
		System.out.println(htable2);
		
		htable.putIfAbsent(5,"무지개");		//해당 항목이 없으면 추가
		htable.putIfAbsent(3,"무지개");
		System.out.println(htable);
		//수정
		htable.replace(3, "김구");		//key값만 비교
		htable.replace(9, "김구");
		System.out.println(htable);
		//읽기
		System.out.println(htable.get(3));
		System.out.println(htable.getOrDefault(100, "기본값"));		//100이 있으면 100의 값 없으면 "기본값"출력
		
		Set<Map.Entry<Integer,String>>entrySet =htable.entrySet();
		System.out.println(entrySet);
		
		Set<Integer>keyset = htable.keySet();
		System.out.println(keyset);
		System.out.println(htable.values());
		//개수
		System.out.println(htable.size());
		//조회
		System.out.println(htable.containsKey(4));
		System.out.println(htable.containsValue("김구"));
		System.out.println(htable.containsValue("임꺽정"));
		//삭제
		System.out.println(htable.remove(4));
		System.out.println(htable.remove(2,"홍길동"));		//value값을 확인
		System.out.println(htable);
		
		htable.clear();
		System.out.println(htable.isEmpty());
		//반복
		Set<Integer> kset = htable2.keySet();
		for(Integer key:kset) {
			System.out.printf("키:%d 값:%s ",key,htable2.get(key));	
		}
		System.out.println();
		Iterator<Integer>keys = kset.iterator();
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.printf("키:%d 값:%s ",key,htable2.get(key));
		}
		System.out.println();
	}
}
