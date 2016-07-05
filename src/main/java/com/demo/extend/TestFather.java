package com.demo.extend;

public class TestFather {

	public static void main(String[] args) {
		Tom.whosme();
		Jock.whosme();
		
		new Tom().whosme();
		new Jock().whosme();
		
		Tom.whosme();
		Jock.whosme();

	}

}
