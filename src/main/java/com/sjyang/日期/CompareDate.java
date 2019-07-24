package com.sjyang.日期;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author saijun.yang
 * @date Created in 2019/7/11 20:10
 * @description 比较日期大小
 * @modified By
 */
public class CompareDate {
    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date dt1 = df.parse("2017-07-05");
        Date dt2 = df.parse("2017-07-06");
        System.out.println(dt1.getTime()>dt2.getTime());
    }
}
