package com.demo.jodd.http;

import jodd.http.HttpRequest;
import jodd.http.HttpResponse;

public class HttpDemo {

	public static void main(String[] args) {

		HttpDemo demo = new HttpDemo();
		demo.test();
	}

	public void test(){
		HttpRequest httpRequest = HttpRequest.get("http://jodd.org");
	    HttpResponse response = httpRequest.send();
	    System.out.println(response);
	}
}
