package com.sjyang.日期.日期格式化;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author saijun.yang
 * @date 2020/6/19 14:33
 * @description
 */
public class FormatDate {
    public static void main(String[] args) throws ParseException {
        String time = "20200121";
        time = time.replaceAll("-","");
        System.out.println(time);
        SimpleDateFormat format = new SimpleDateFormat("yyyymmdd");
        Date date = format.parse(time);
        System.out.println(date);
        String formatStr = format.format(date);
        System.out.println(formatStr);
    }
}
