package com.demo.luck;

import java.util.ResourceBundle;

import org.apache.log4j.Logger;

/**
 * 
 * @author foss
 * @create time	2016年4月7日 上午10:38:44
 * @version 1.0.0
 */
public class LuckServiceV2 {
	
	private static ResourceBundle luckBind = ResourceBundle.getBundle("luck");
	private static ResourceBundle luckData = ResourceBundle.getBundle("luck_data");
	private static Logger log = Logger.getLogger(LuckServiceV2.class);

	Person person = new Person();
	PrizePerson prizePerson = new PrizePerson();
	
	public static void main(String[] args) {
		LuckServiceV2 service = new LuckServiceV2();
		service.initData();
	}
	
	public void initData(){
		log.info("mothed initData ... ");
		person.setId(luckData.getString("person.id"));
		person.setQualifications(Boolean.parseBoolean(luckData.getString("person.qualifications")));
		
		prizePerson.setId(luckData.getString("prize.person.id"));
	}
	
	
	public void prizeService(){
		
		boolean flag = true;
	
		//1、判断是否有资格抽奖.例如：做了活动才有抽奖资格，抽中一次是否还能继续抽取
		hasChance(person);
		
		//2、判断奖池是否一天固定,当天是否抽取完
		prizeIsOver();
		
		//3、判断是否有中间间隔，时间是否到了
		timeToSapaceTime();
		
		//4、尝试随机数
		randomNum();
		
		//5、随机数落点，判断是否中奖
		
		//6、中奖类型
		
	
	}

	
	private void randomNum() {
	}

	/**
	 * 1、资格认证
	 * @param person
	 */
	private boolean hasChance(Person person) {
		
		//1、
		
		return true;
	}
	
	
	private void prizeIsOver() {
		
	}

	private void timeToSapaceTime() {
		
	}

	
}
