package com.sjyang.字符串.替换特殊字符;

import java.text.ParseException;
import java.util.Date;

/**
 * @author saijun.yang
 * @date 2021/8/24 14:49
 * @description 替换字符串中的特殊字符
 */
public class RePlaceAllSpecial {
    public static void main(String[] args) {
        String date1 = "2021/5/16";
        String date2 = "2021-08-16";
        date1 = date1.replaceAll("\\/" , "\\-");
        System.out.println(date1);
    }
}
