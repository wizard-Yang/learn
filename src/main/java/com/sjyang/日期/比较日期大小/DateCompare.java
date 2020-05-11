package com.sjyang.日期.比较日期大小;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author saijun.yang
 * @date 2020/5/9 16:53
 * @description 比较两个日期大小
 */
public class DateCompare {
    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String beginTime = "2017-08-08";
        String endTime = "2017-08-09";

        Date sd1=dateFormat.parse(beginTime);
        Date sd2=dateFormat.parse(endTime);
        System.out.println(sd1.before(sd2));
    }
}
