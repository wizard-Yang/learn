package com.sjyang.leetcode.数学.罗马数字转整数;

import java.util.HashMap;
import java.util.Map;

/**
 * @author saijun.yang
 * @date Created in 2019/12/11 13:17
 * @description
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 *
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，
 * 所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 *
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 *
 * 示例 1:
 * 输入: "III"
 * 输出: 3
 *
 * 示例 2:
 * 输入: "IV"
 * 输出: 4
 *
 * 示例 3:
 * 输入: "IX"
 * 输出: 9
 *
 * 示例 4:
 * 输入: "LVIII"
 * 输出: 58
 * 解释: L = 50, V= 5, III = 3.
 *
 * 示例 5:
 * 输入: "MCMXCIV"
 * 输出: 1994
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 */
public class Solution {
    /**
     * 自作
     * 时间复杂度：T(n) = n
     * 空间复杂度：S(n) = n
     * @param s
     * @return
     */
    public static int romanToInt(String s) {
        Map<Character,Integer> dictory = new HashMap<Character,Integer>(7);
        dictory.put('I',1);
        dictory.put('V',5);
        dictory.put('X',10);
        dictory.put('L',50);
        dictory.put('C',100);
        dictory.put('D',500);
        dictory.put('M',1000);
        dictory.put('N',0);
        int result = 0;
        char[] charParam = s.toCharArray();
        int len = charParam.length;
        char key2 = ' ';
        char curr = ' ';
        for (int i = 0; i < len; i++) {
            curr = charParam[i];
            key2 = (i == (len-1))?'N':charParam[i+1];

            if(dictory.get(curr) > dictory.get(key2)){//大于
                result = result+dictory.get(curr);
            }else if(dictory.get(curr) < dictory.get(key2)){//小于
                result = result+(dictory.get(key2)-dictory.get(curr));
                i++;
            }else{//等于
                result = result+dictory.get(curr);
            }
        }
        return result;
    }

    /**
     * 好的题解
     * @param s
     * @return
     */
    public int romanToInt2(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for(int i = 1;i < s.length(); i ++) {
            int num = getValue(s.charAt(i));
            if(preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }

    private int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        String param = "VI";
        System.out.println(romanToInt(param));
    }
}
