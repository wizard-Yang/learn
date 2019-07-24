package com.sjyang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author saijun.yang
 * @date Created in 2019/6/21 17:52
 * @description
 * @modified By
 */
public class AA {


    public static void main(String[] args) throws ParseException {
        String str = "2017-07-24T00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String re = sdf.format(sdf.parse(str));
        System.out.println(re);
    }
}
