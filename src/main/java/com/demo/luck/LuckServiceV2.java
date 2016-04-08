package com.demo.luck;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

/**
 * 
 * @author foss
 * @create time	2016年4月7日 上午10:38:44
 * @version 1.0.0
 */
public class LuckServiceV2 {
	
	private static ResourceBundle luck = ResourceBundle.getBundle("luck");
	private static ResourceBundle luckData = ResourceBundle.getBundle("luck_data");
	private static Logger log = Logger.getLogger(LuckServiceV2.class);
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Person person = new Person();
	PrizePerson prizePerson = new PrizePerson();
	MyScore score = new MyScore();
	PrizeEnum prizeType = PrizeEnum.NO;
	
	public static void main(String[] args) {
		LuckServiceV2 service = new LuckServiceV2();
		service.initData();
		service.prizeService();
	}
	
	/**
	 * 初始化数据
	 */
	public void initData(){
		log.info("mothed initData run ... ");
		person.setId(luckData.getString("person.id"));
		person.setQualifications(Boolean.parseBoolean(luckData.getString("person.qualifications")));
		
		prizePerson.setId(luckData.getString("prize.person.id"));
		prizePerson.setPersionId(luckData.getString("prize.person.persionId"));
		
		try {
			prizePerson.setDate(sdf.parse(luckData.getString("prize.person.time")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	
	public void prizeService(){
		
		boolean flag = true;
	
		//1、判断是否有资格抽奖.例如：做了活动才有抽奖资格，抽中一次是否还能继续抽取
		if(flag){
			flag = hasChance(person);
		}
		
		//2、判断奖池是否一天固定,当天是否抽取完
		if(flag){
			flag = prizeIsOver();
		}
		
		//3、判断是否有中间间隔，时间是否到了
		if(flag){
			flag = timeToSapaceTime();
		}
		
		//4、尝试随机数
		int myNum = randomNum();
		
		//5、随机数落点，判断是否中奖、中奖类型
		prizeType = myNumDrop(myNum);
		
		//6、如果中奖必须按顺序，则可能会把中奖类型向下强制转换
		boolean prizeInTurn = Boolean.parseBoolean(luck.getString("prize.in.turn"));
		if(prizeInTurn){
			changePrizeType();
		}
		
		log.info("prize type : "+ prizeType);
		
	}

	/**
	 * 1、资格认证
	 * @param person
	 */
	private boolean hasChance(Person person) {
		log.info("hasChance() mothed run ...."); 
		//1、
		boolean prizeRepeatAward = Boolean.getBoolean(luck.getString("prize.repeat.award"));
		return true;
	}
	
	/**
	 * 2、奖池当天是否存在规定数，是否抽取完成
	 */
	private boolean prizeIsOver() {
		log.info("prizeIsOver() mothed run ...."); 
		boolean prizeNumFixed = Boolean.parseBoolean(luck.getString("prize.num.fixed"));
		return true;
	}

	/**
	 * 3、判断抽奖是否存在时间间隔，间隔时间是否到
	 * @return
	 */
	private boolean timeToSapaceTime() {
		log.info("timeToSapaceTime() mothed run ...."); 
		boolean prizeSpace = Boolean.parseBoolean(luck.getString("prize.space"));
		if(prizeSpace){
			try {
				Date lastPrizeDate = sdf.parse(luckData.getString("prize.person.time"));
				Date now = new Date();
				long diff = now.getTime() - lastPrizeDate.getTime();
				//时间间隔
				int min = (int) (diff / (1000 * 60));
				int prizeSpaceTime = Integer.valueOf(luck.getString("prize.space.time"));
				if(min >= prizeSpaceTime){
					return true;
				}else{
					return false;
				}
			} catch (ParseException e) {
				log.error("抽奖时间间隔异常", e);
				return false;
			}
		}else{
			return true;
		}
	}
	
	/**
	 * 4、产生随机数
	 */
	private int randomNum() {
		log.info("randomNum() mothed run ....");
		Random random = new Random();
		int myNum = 1 + random.nextInt(Integer.valueOf(luck.getString("sum.prize.pool")));
		log.info("random num : " + myNum);
		return myNum;
	}

	/**
	 * 5、随机数落点，判断是否中奖
	 * @param myNum
	 */
	private PrizeEnum myNumDrop(int myNum) {
		log.info("myNumDrop() mothed run .... ");
		
		int sumPrizePool = Integer.valueOf(luck.getString("sum.prize.pool"));
		
		double rateSpecial = score.stringToDouble(luck.getString("rate.special"));
		double rateFirst = score.stringToDouble(luck.getString("rate.first"));
		double rateSecond = score.stringToDouble(luck.getString("rate.second"));
		double rateThird = score.stringToDouble(luck.getString("rate.third"));
		double rateComfort = score.stringToDouble(luck.getString("rate.comfort"));
		
		int specialNumLand = (int) (sumPrizePool * rateSpecial);
		int firstNumLand = (int) (sumPrizePool * rateFirst);
		int secondNumLand = (int) (sumPrizePool * rateSecond);
		int thirdNumLand = (int) (sumPrizePool * rateThird);
		int comfortNumLand = (int) (sumPrizePool * rateComfort);
		
		int specialNumLandEnd = 0 + specialNumLand;
		int firstNumLandEnd = specialNumLandEnd + firstNumLand;
		int secondNumLandEnd = firstNumLandEnd + secondNumLand;
		int thirdNumLandEnd = secondNumLandEnd + thirdNumLand;
		int comfortNumLandEnd = thirdNumLandEnd + comfortNumLand;
		
		if(0 < myNum && myNum <= specialNumLandEnd){
			prizeType = PrizeEnum.SPECIAL;
		}else if(specialNumLandEnd < myNum && myNum <= firstNumLandEnd){
			prizeType = PrizeEnum.FIRST;
		}else if(firstNumLandEnd < myNum && myNum <= secondNumLandEnd){
			prizeType = PrizeEnum.SECOND;
		}else if(secondNumLandEnd < myNum && myNum <= thirdNumLandEnd){
			prizeType = PrizeEnum.THIRD;
		}else if(thirdNumLandEnd < myNum && myNum <= comfortNumLandEnd){
			prizeType = PrizeEnum.COMFORT;
		}
		log.info("prize type : "+ prizeType);
		return prizeType;
	}
	
	/**
	 * 6、
	 * 统计当前中奖数目，并且是第几天，接下来的中奖类型是什么，强制中奖类型转换
	 */
	private void changePrizeType() {
		
	}
	
}
