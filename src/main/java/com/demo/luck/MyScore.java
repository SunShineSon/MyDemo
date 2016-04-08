package com.demo.luck;

public class MyScore {
	
	public static void main(String[] args) {
		MyScore score = new MyScore();
		String str = "1/10000";
		score.stringToDouble(str);
	}

	public double stringToDouble(String str){
		
		String strs[] = str.split("/");
		double elememt = Integer.valueOf(strs[0]);
		double denominator = Integer.valueOf(strs[1]);
		double rate = elememt/denominator;
		return rate;
	}
}
