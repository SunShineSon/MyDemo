package com.demo.enumpackage.impl;

import com.demo.enumpackage.inf.SelfEnumInf;


public enum LoginFlag implements SelfEnumInf{
	/**
	 * flag 编号代表意义
	 * "0"----用户未注册
	 * "1"----普通用户
	 * "2"----未激活
	 * "3"----管理员
	 * "4"----用户被禁用
	 * "5"----邮箱不合法
	 * "6"----密码错误
	 */
	NOREGISTER("0"),
	ORDINARY("1"),
	UNACTIVATION("2"),
	ADMIN("3"),
	FORBIDDEN("4"),
	EMAILWRONGFUL("5"),
	ERRORPASSWORD("6");
	

	private String value;
    
    private LoginFlag(String value){
        this.value = value;
    }

	public String getValue() {
		return value;
	}

	public String getName() {
		return toString();
	}


}

