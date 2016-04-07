package com.demo.jodd.beanutil;

public class Foo {
	private String writeOnly;
	private String readOnly;

	public String getWriteOnly() {
		return writeOnly;
	}



	public String getReadOnly() {
		return readOnly;
	}

	public void setReadOnly(String readOnly) {
		this.readOnly = readOnly;
	}

}
