package com.sjyang.字符串;

import java.util.ArrayList;
import java.util.List;

/**
 * @author saijun.yang
 * @date 2022/4/25 17:36
 * @description
 */
public class Sub {
    public static void main(String[] args) {
        //String date = "2018-12-15";
        //String ord = "1111222233334444555566667777";
        //System.out.println(date.replace("-","") + ord.substring(ord.length()-16));
        List<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        a.add("3");
        a = a.subList(0,a.size());
        System.out.println(a);
    }
}
