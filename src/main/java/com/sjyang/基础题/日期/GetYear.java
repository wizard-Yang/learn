package com.sjyang.基础题.日期;

import java.util.Calendar;

/**
 * @author saijun.yang
 * @date Created in 2019/8/1 20:02
 * @description 获取年份
 * @modified By
 */
public class GetYear {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        String year = String.valueOf(calendar.get(Calendar.YEAR));
        System.out.println(year);
    }
}
