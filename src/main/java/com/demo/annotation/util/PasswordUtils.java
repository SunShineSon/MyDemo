package com.demo.annotation.util;

import java.util.List;

import com.demo.annotation.inter.UserCase;

public class PasswordUtils {

	@UserCase(id = 47, description = "Password must contain at least one numeric")
	public boolean validatePassword(String password){
		return (password.matches("\\w*\\d\\w*"));
	}
	
	@UserCase(id = 48)
	public String encryptPassword(String password){
		return new StringBuilder(password).reverse().toString();
	}
	
	@UserCase(id = 49, description = "new Password can not bu equals the old.")
	public boolean checkNewPassword(List<String> list, String password){
		return !list.contains(password);
	}
}
