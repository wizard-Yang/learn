package com.sjyang.工具类.字符串金额格式转换;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @author saijun.yang
 * @date 2020/5/22 17:24
 * @description 将数字字符串格式化为金额
 * 例如：千分位表示且保留两位小数
 */
public class FormatMoney {
    public static void main(String[] args) {
        System.out.println(formatMoney("24563453.88877",2));
    }

    public static String formatMoney(String s, int len) {
        if (s == null || s.length() < 1) {
            return "";
        }
        NumberFormat formater = null;
        double num = Double.parseDouble(s);
        if (len == 0) {
            formater = new DecimalFormat("###,###");

        } else {
            StringBuffer buff = new StringBuffer();
            buff.append("###,###.");
            for (int i = 0; i < len; i++) {
                buff.append("#");
            }
            formater = new DecimalFormat(buff.toString());
        }
        String result = formater.format(num);
        if (result.indexOf(".") == -1) {
            result = "￥" + result + ".00";
        } else {
            result = "￥" + result;
        }
        return result;
    }
}
