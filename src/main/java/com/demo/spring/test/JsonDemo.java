package com.demo.spring.test;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.google.gson.Gson;



public class JsonDemo {
	private Logger log = Logger.getLogger(getClass());
	
	public static void main(String[] args) throws Exception {
		JsonDemo jsonDemo = new JsonDemo();
		
		jsonDemo.mothed();
		
		
		
	}

	public void mothed(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("a key", "a value");
		map.put("b key", "b value");
		Gson gson = new Gson();
		log.info(gson);
	}
}
