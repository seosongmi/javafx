package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry.Entry;

public class HashMapExample {
	
	public static void getMap(Map<Integer,String> map) {
		Set<Integer> set = map.keySet();
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			Integer num = iter.next();
			if(num>=80) {
			String val = map.get(num);
			System.out.println(val);
		}
	}
	}
	
	public static void main(String[] args) {
		Map<Integer,String> scores = new HashMap<>();
		scores
		
		
	public static void main(String[] args) {
			
		}
		List<String> list = new ArrayList<>();
		list.add("Hong");
		list.get(0);
		
		Set<String> set = new HashSet<>();
		set.add("Hong");
		set.add("Hwang");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str.toString());
		}
		
		Map<String, Integer> map = new HashMap<>(); 
		//key:value -> Map.Entry
		map.put("Hong", 98);
		map.put("Hwang", 90);
		map.put("Hong", 80);
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			Integer value = map.get(key);
			System.out.println("key:" + key + ", value:" + value);
		}
		
		Set<Entry<String, Integer>> entSet = map.entrySet();
		Iterator<Entry<String,Integer>> entIter = entSet.iterator();
		while(entIter.hasNext()) {
			Entry<String,Integer> entry = entIter.next();
			String key = entry.getkey();
			Integer val = entry.getValue();
			System.out.println("key: " + key + ", value:"+value);
		}
	}
}
