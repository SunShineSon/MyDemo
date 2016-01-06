package com.demo.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapDemo demo = new MapDemo();
		demo.mapDemo();

	}

	private void mapDemo(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("a", "A");
		map.put("b", "B");
		map.put("c", "C");
		
		Set<Entry<String, Object>> maps = map.entrySet();
		for(Entry<String, Object> entry : maps ){
			System.out.println(entry.getKey() + "--->" + entry.getValue());
		}
		
		
		Set<String> keySet = map.keySet();
		for(String key : keySet){
			System.out.println(map.get(key));
		}
		
		Collection<Object> mapValues = map.values();
		for(Object value : mapValues){
			System.out.println(value);
		}
		
	}
}
