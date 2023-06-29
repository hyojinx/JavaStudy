package study15;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapInterfaceRun {
	public static void main(String[] args) {
		HashMap<Integer,String>hmap = new HashMap<>();
		hmap.put(103,"Lee");
		hmap.put(102,"Kim");
		hmap.put(101,"Kim");	
		hmap.put(102,"Hong");
		System.out.println(hmap);
		System.out.println("HashMap의 size:"+hmap.size());
		Hashtable<Integer,String> htable = new Hashtable<>();
		htable.put(103,"Lee");
		htable.put(102,"Kim");
		htable.put(101,"Kim");
		htable.put(102,"Hong");
		System.out.println(htable);
		System.out.println("HashTable의 size:"+htable.size());
		LinkedHashMap<Integer,String> lhmap = new LinkedHashMap<>();
		lhmap.put(103,"Lee");
		lhmap.put(102,"Kim");
		lhmap.put(101,"Kim");
		lhmap.put(102,"Hong");
		System.out.println(lhmap);
		System.out.println("LinkedHashMap의 size:"+lhmap.size());
		TreeMap<Integer,String> tmap = new TreeMap<>();
		tmap.put(103,"Lee");
		tmap.put(102,"Kim");
		tmap.put(101,"Kim");
		tmap.put(102,"Hong");
		System.out.println(tmap);
		System.out.println("TreeMap의 size:"+tmap.size());
		
		
	}
}
