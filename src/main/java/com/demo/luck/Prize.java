package com.demo.luck;


/**
 * 
 * @author foss
 * @create time	2016年4月1日 下午5:10:10
 * @version 1.0.0
 */
public class Prize {
	
	//奖品类型为int型，具体数量代表奖品类型个数
	// 1 2 5 8 10
	// 1/10000, 1/5000, 1/1000, 1/500, 1/100
	
	private int special;
	private int first;
	private int second;
	private int third;
	private int comfort;

	public int getSpecial() {
		return special;
	}

	public void setSpecial(int special) {
		this.special = special;
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getThird() {
		return third;
	}

	public void setThird(int third) {
		this.third = third;
	}

	public int getComfort() {
		return comfort;
	}

	public void setComfort(int comfort) {
		this.comfort = comfort;
	}


}
