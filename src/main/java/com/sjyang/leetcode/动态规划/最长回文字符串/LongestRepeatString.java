package com.sjyang.leetcode.动态规划.最长回文字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * @author saijun.yang
 * @date Created in 2019/8/30 14:00
 * @description
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * “回文串”是一个正读和反读都一样的字符串，比如“level”或者“noon”等等就是回文串。
 * 示例 1：
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 * 输入: "cbbd"
 * 输出: "bb"
 * @modified By
 */
public class LongestRepeatString {
    public static void main(String[] args) {
        String test = "abbcdiuyyuid";//结果应为abcdefghab或bcdefghab
        System.out.println(longestPalindrome(test));
    }

    /**
     * 暴力法，两层循环全部遍历
     * 时间复杂度：T(n)=n^3;
     * 思路：回文字符串特点-首位字符一致
     * 可以先找到首尾一致的一串，然后根据奇数偶数进行判断中间夹杂的是否也是回文
     * 但是如果输入aaaaaaaaaaaaaaaaaaa
     * 那么比较的时间就太多了，所以这种直白的解法直接超时，无法提交的
     * @param s
     * @return
     */
    public static String longestPalindrome(String s){
        int length = s.length();
        //当一个字符或为空时，直接返回
        if(length == 1 || length == 0){
            return s;
        }
        char[] data = s.toCharArray();
        Map<String,String> result = new HashMap<String,String>();
        result.put("key","0");
        result.put("value","");
        for (int i = 0; i < length; i++) {
            char pre = data[i];
            for (int j = i+1; j < length; j++) {
                char next = data[j];
                //找到首尾一致的
                if(next == pre){
                    int space = j-i-1;//中间相隔元素数
                    int len = j-i+1;//字符长度
                    //判断奇数偶数，然后将字符串翻转比较
                    if(space % 2 == 0){//偶数处理
                        int middle = space/2;
                        String first = s.substring(i,i+middle+1);
                        String second = s.substring(i+middle+1,j+1);
                        //翻转字符串
                        String secondRevert = new StringBuilder(second).reverse().toString();
                        if(first.equals(secondRevert)){
                            if(len >= Integer.parseInt(result.get("key"))){
                                result.put("key",String.valueOf(len));
                                result.put("value",s.substring(i,j+1));
                            }
                        }
                    }else{//奇数
                        int middle = space/2;
                        String first = s.substring(i,i+middle+1);
                        String second = s.substring(i+middle+2,j+1);
                        //翻转字符串
                        String secondRevert = new StringBuilder(second).reverse().toString();
                        if(first.equals(secondRevert)){
                            if(len >= Integer.parseInt(result.get("key"))){
                                result.put("key",String.valueOf(len));
                                result.put("value",s.substring(i,j+1));
                            }
                        }
                    }
                }
            }
        }
        if("".equals(result.get("value"))){
            return s.substring(0,1);
        }
        return result.get("value");
    }

    /**
     *  有一个快速解法
     *  最长公共子串
     *  就是把s直接翻转过来，求两个串最长的公共串，就是答案
     *  因为回文正反读都是一样的，所以先反过来和原来串的公共部分就是回文了，例如abac 翻转 caba,公共子串aba
     *  但是有个问题，就是加入s中字符串有一部分是翻转的就会出现问题，例如abcdefgedcba 翻转abcdegfedcba 公共部分abcde,明显不对
     *  原因就是子串中有了一部分翻转，所以不行。
     */
}
