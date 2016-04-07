package com.demo.luck;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author foss
 * @create time 2016年4月1日 下午5:10:18
 * @version 1.0.0
 */
public class Demo {

	public static void main(String[] args) {
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
