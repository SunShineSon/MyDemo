package com.demo.luck;

import java.util.Random;

import org.apache.log4j.Logger;

public class LuckService {
	private static Logger log = Logger.getLogger(LuckService.class);;
	private static LuckService service = new LuckService();
	
	public static void main(String[] args) {
		for(int i=0; i<100;i++){
			log.info(service.service());
		}
	}

	

	public PrizeEnum service() {
		Rule rule = new Rule();
		rule.setSpecial(0.00001);
		rule.setFirst(0.0002);
		rule.setSecond(0.001);
		rule.setThird(0.002);
		rule.setComfort(0.01);
		

		int baseNum = (int) (1 / rule.getSpecial());
		int myNum = service.getNum(baseNum);

		int specialNum = (int) (baseNum * rule.getSpecial());
		int firstNum = (int) (baseNum * rule.getFirst());
		int secondNum = (int) (baseNum * rule.getSecond());
		int thirdNum = (int) (baseNum * rule.getThird());
		int comfortNum = (int) (baseNum * rule.getComfort());

		int specialNumEnd = 0 + specialNum;
		int firstNumEnd = specialNum + firstNum;
		int secondNumEnd = firstNumEnd + secondNum;
		int thirdNumEnd = secondNumEnd + thirdNum;
		int comfortNumEnd = thirdNumEnd + comfortNum;
		
//		log.info(baseNum);
		log.info(myNum);
//		log.info(specialNum + "," + firstNum + "," + secondNum + "," + thirdNum +"," + comfortNum);
//		log.info(specialNumEnd + "," + firstNumEnd + "," + secondNumEnd + "," + thirdNumEnd +"," + comfortNumEnd);

		if (0 < myNum && myNum <= specialNumEnd) {
			return PrizeEnum.SPECIAL;
		} else if (specialNum < myNum && myNum <= firstNumEnd) {
			return PrizeEnum.FIRST;
		} else if (firstNumEnd < myNum && myNum <= secondNumEnd) {
			return PrizeEnum.SECOND;
		} else if (secondNumEnd < myNum && myNum <= thirdNumEnd) {
			return PrizeEnum.THIRD;
		} else if (thirdNumEnd < myNum && myNum <= comfortNumEnd) {
			return PrizeEnum.COMFORT;
		} else {
			return PrizeEnum.NO;
		}

	}

	/**
	 * 1-10000
	 */
	public int getNum(int baseNum) {
		Random random = new Random();
		int num = random.nextInt(baseNum);
		return num;
	}

	public boolean hasPrize(int num) {
		boolean has = false;

		return has;

	}

}
