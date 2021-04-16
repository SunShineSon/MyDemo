package com.demo.date;

import com.demo.extend.duotai.D;
import org.joda.time.DateTime;
import org.joda.time.Months;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author : Ada
 * @CreateTime : 8/11/2020 6:02 PM
 * @Description :
 **/
public class DateUtils {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");

    public static void main1(String[] args) throws Exception {
        DateUtils dateUtils = new DateUtils();
        dateUtils.method2();

    }

    private void method1() throws Exception {

        Calendar one = Calendar.getInstance();
        one.setTime(format.parse("2020-08"));

        Calendar two = Calendar.getInstance();
        two.setTime(format.parse("2022-08"));

        int oneYear = one.get(Calendar.MONTH);
        int twoYear = two.get(Calendar.MONTH);
        System.out.println(oneYear);
        System.out.println(twoYear);

        System.out.println(oneYear - twoYear);


    }

    private void method() {
        try {
            Date date = format.parse("2020-08-08 00:00:00");
            Calendar one = Calendar.getInstance();
            one.setTime(date);
            one.add(Calendar.MONTH, -12);
            System.out.println(format.format(one.getTime()));

        }catch (Exception e){

        }
    }

    private void method2(){
        try {
            SimpleDateFormat format = new SimpleDateFormat();
            Date date1 = format.parse("2020-11-01");
            Date date = new Date();
            System.out.println(date1.after(date));
        }catch (Exception e){

        }
    }
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        DateTime start = formatter.parseDateTime("2017-07-11");
        DateTime end = formatter.parseDateTime("2017-11-19");
        int months = Months.monthsBetween(start, end).getMonths();
        System.out.println(months);
    }

}
