package com.sjyang.工具类.字符串金额格式转换;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * @author saijun.yang
 * @date 2020/5/25 20:32
 * @description 科学计数法
 * 特殊临界值处理：
 *  0.0
 *  一位小数，例如1.2
 *  整数无小数部分
 */
public class ScienceMarkNumber {
    public static void main(String[] args) {
        Double a = 0.1111145;
        Double b = 0d;
        System.out.println(b == 0);
        Double c = 23d;
        NumberFormat numberFormat = new DecimalFormat("###,###.0#");
        String parse = numberFormat.format(a);
        String[] splitArr = parse.split("\\.");
        if(splitArr.length == 2){
            if(splitArr[1].toCharArray().length != 2){
                parse = parse + "0";
            }
        }
        System.out.println(parse);
        System.out.println("--------------------------------------------");
        xiaoshu();
    }
    public static void xiaoshu(){
        Double rate = 232320.1234567;
        NumberFormat numberFormat = new DecimalFormat("###,###,##0.000000");
        String parse = numberFormat.format(rate);
        System.out.println(parse);
    }
}
