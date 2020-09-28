package com.demo.string;

public class DemoA {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;




	public static void main(String[] args) {
		DemoA demo = null;
		if(!"OK".equalsIgnoreCase(demo.getName())){
			System.out.println("ok");
		}

	}

	public void method(){
		String str = "app_id";
		str = str.replaceAll("app_id", "app_id_value");
		System.out.println(str);
	}

}
