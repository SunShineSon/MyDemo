package com.demo.sha256;

public class Demo {

	public static void main(String[] args) {
		String password = "1234567";
		// SHA256加密
		String shaPwd = SHA256.Encrypt(password, "SHA-256");
		System.out.println(shaPwd);

	}

}
