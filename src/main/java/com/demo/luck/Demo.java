package com.demo.luck;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.ResourceBundle;

/**
 * 
 * @author foss
 * @create time 2016年4月1日 下午5:10:18
 * @version 1.0.0
 */
public class Demo {
	private static ResourceBundle luck = ResourceBundle.getBundle("luck");

	public static void main(String[] args) {

		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println(r.nextInt(10));
		}


	}

	private static void dateDeal() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date = sdf.parse("2016-4-7 12:00:00");
			System.out.println(sdf.format(date));

			Date now = new Date();
			System.out.println(sdf.format(now));

			long diff = now.getTime() - date.getTime();
			long min = diff / (1000 * 60);
			System.out.println(min);

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
