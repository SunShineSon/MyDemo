package com.demo.spring.impl;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.log4j.Logger;

import com.demo.common.StaticConstants;
import com.demo.enums.AjaxEnum;
import com.demo.spring.inf.UserMangerIntf;
import com.google.gson.Gson;

public class UserMangerImpl implements UserMangerIntf{
	private static Logger log = Logger.getLogger(UserMangerImpl.class);
	
	public String test() {
		log.info("test");
		return "hello";
	}
	
	public void ajax() throws Exception {
		boolean isIn = false;
		Map<String,Object> errorMap = new HashMap<String,Object>();
		if(isIn){
			errorMap.put("error", "error");
			throw new Exception(StaticConstants.gson.toJson(errorMap));
		}
	}

	public String Register(String mail, String name, String password) throws Exception {
		log.info(mail + "--" + name + "--" + password);
		String DBmail = "mail";
		String DBname = "name";
		String DBpassword = "password";
		Map<String, String> errorMap = new HashMap<String, String>();
		if(DBmail.equals(mail) && DBname.equals(name) && DBpassword.equals(password)){
			return AjaxEnum.SUCCESS.toString();
		}else{
			errorMap.put("error", "error");
			Gson gson = new Gson();
			//throw new Exception(StaticConstants.gson.toJson(errorMap));
			throw new Exception("error");
		}
	}
	
	public Response login(String mail, String password) {
		log.info(mail + "---" + password);
		ResponseBuilder responseBuilder = Response.ok();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("A", "Avalue");
		map.put("B", "Bvalue");
		
		responseBuilder.status(200);
		responseBuilder.entity(map);
		return responseBuilder.build();
	}

	public Map mapTest(String value) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("mapA", "mapAvalue");
		map.put("mapB", "mapBvalue");
		log.info("map test");
		return map;
	}

	
}
