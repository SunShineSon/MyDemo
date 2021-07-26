package com.demo.collection;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {

	public static final Map<String, Object> mapFinal = new HashMap<>();

	public static void main(String[] args) {
		MapDemo demo = new MapDemo();
		demo.hashMethod();

	}

	private void hashMethod(){
		int i = 2;
		System.out.println(i >>> 16);

	}



	private void constructionSynchronizedMap(){
        Map<String, Object> map = new HashMap<>();
        map.put("a", "A");
        map.put(null, null);
        map.get("a");
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(map);
    }

	private void constructionHashMap(){
        Map<String, Object> map = new HashMap<>();
        HashMap<Integer,String> map2 = new HashMap<Integer,String>(2,0.75f);


        MapDemo[] array = new MapDemo[1];


    }

    private void constructionHashTable(){
        Hashtable<String, String> hashTable = new Hashtable<>();
		hashTable.put("key", null);
        System.out.println(hashTable.get("key"));
    }

	private void mapDemo(){
		Map<String, Object> map = new HashMap<>();
		map.put("a", "A");
		map.put("b", "B");
		map.put("c", "C");
		map.size();
		
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
	
	/**
	 * 
	 * 2019年4月19日 上午11:42:13
	 * @Author：郭
	 * @Description：输出结果并不是按照顺序的
	 */
	private void iterator(){
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("c", "age1");
		hashMap.put("f", "josan3");
	    hashMap.put("b", "josan1");
	    hashMap.put("d", "josan2");
	    hashMap.put("aaa", "age3");
	    hashMap.put("a", "age3");
	    hashMap.put("ab", "age3");
	    hashMap.put("aa", "age3");
	    hashMap.put("ac", "age3");
	    hashMap.put("e", "age2");
	    Set<Entry<String, String>> set = hashMap.entrySet();
	    Iterator<Entry<String, String>> iterator = set.iterator();
	    while(iterator.hasNext()) {
	        Entry entry = iterator.next();
	        String key = (String) entry.getKey();
	        String value = (String) entry.getValue();
	        System.out.println("key:" + key + ",value:" + value);
	    }
	}
	
	/**
	 * 顺序插入，顺序输出
	 * 2019年4月19日 上午11:38:56
	 * @Author：郭
	 * @Description：LinkedHashMap是有序的，且默认为插入顺序。
	 */
	private void linkedHashMap(){
		Map<String, String> linkedHashMap = new LinkedHashMap<String, String>();
		linkedHashMap.put("name3", "josan1");
		linkedHashMap.put("name1", "josan1");
        linkedHashMap.put("name2", "josan2");
        linkedHashMap.put("python", "josan3");
        linkedHashMap.put("java", "josan3");
        linkedHashMap.put("elasticSearch", "josan3");
        linkedHashMap.put("PHP", "josan3");
        Set<Entry<String, String>> set = linkedHashMap.entrySet();
        Iterator<Entry<String, String>> iterator = set.iterator();
        while(iterator.hasNext()) {
            Entry entry = iterator.next();
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println("key:" + key + ",value:" + value);
        }
		
		
	}

	private void treeMap(){
		Map<String, String> treeMap = new TreeMap<>();


	}

	private void concurrentHashMapMethod(){
		ConcurrentHashMap hashMap = new ConcurrentHashMap();
		hashMap.put("key", "value");
		hashMap.put(new MapDemo(), "b");
		Set<String> set = hashMap.keySet();
		for (String str : set) {
			System.out.println(hashMap.get(str));
		}
	}
	    
	    
	    
	    
	    
	    
	    
}
