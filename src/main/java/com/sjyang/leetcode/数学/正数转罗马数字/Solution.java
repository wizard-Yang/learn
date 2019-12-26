package com.sjyang.leetcode.数学.正数转罗马数字;

/**
 * @author saijun.yang
 * @date Created in 2019/12/11 13:16
 * @description noWrite
 * 罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
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
 * 给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。
 *
 * 示例 1:
 *
 * 输入: 3
 * 输出: "III"
 * 示例 2:
 *
 * 输入: 4
 * 输出: "IV"
 * 示例 3:
 *
 * 输入: 9
 * 输出: "IX"
 * 示例 4:
 *
 * 输入: 58
 * 输出: "LVIII"
 * 解释: L = 50, V = 5, III = 3.
 * 示例 5:
 *
 * 输入: 1994
 * 输出: "MCMXCIV"
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 */
public class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int qian = num/1000;
        int bai = (num%1000)/100;
        int shi = (num%100)/10;
        int ge = num%10;
        if(qian > 0){
            for (int i = 0; i < qian; i++) {
                sb.append("M");
            }
        }
        if(bai > 0){
            if(bai > 0 && bai<4){
                for (int i = 0; i < bai; i++) {
                    sb.append("C");
                }
            }
            if(bai == 4){
                sb.append("CD");
            }
            if(bai == 5){
                sb.append("D");
            }
            if(bai > 5 && bai < 9){
                sb.append("D");
                for (int i = 0; i < bai-5; i++) {
                    sb.append("C");
                }
            }
            if(bai == 9){
                sb.append("CM");
            }
        }
        if(shi > 0){
            if(shi > 0 && shi<4){
                for (int i = 0; i < shi; i++) {
                    sb.append("X");
                }
            }
            if(shi == 4){
                sb.append("XL");
            }
            if(shi == 5){
                sb.append("L");
            }
            if(shi > 5 && shi < 9){
                sb.append("L");
                for (int i = 0; i < shi-5; i++) {
                    sb.append("X");
                }
            }
            if(shi == 9){
                sb.append("XC");
            }
        }
        if(ge > 0){
            if(ge > 0 && ge<4){
                for (int i = 0; i < ge; i++) {
                    sb.append("I");
                }
            }
            if(ge == 4){
                sb.append("IV");
            }
            if(ge == 5){
                sb.append("V");
            }
            if(ge > 5 && ge < 9){
                sb.append("V");
                for (int i = 0; i < ge-5; i++) {
                    sb.append("I");
                }
            }
            if(ge == 9){
                sb.append("IX");
            }
        }
        return sb.toString();
    }

    /**
     * 题解：贪心算法
     * @param num
     * @return
     */
    public String IntToRoman2(int num)
    {
        StringBuilder stringBuilder = new StringBuilder();
        int[] moneys = new int[] {1000,900,500,400,100,90,50,40,10,9,5,4,1 };
        String[] moneyToStr = new String[] {"M", "CM", "D","CD","C","XC","L","XL","X", "IX", "V", "IV", "I" };
        int index = 0;
        while (num > 0)
        {
            if (num >= moneys[index])
            {
                stringBuilder.append(moneyToStr[index]);
                num -= moneys[index];
                index--;
            }
            index++;
        }
        return stringBuilder.toString();
    }
}
