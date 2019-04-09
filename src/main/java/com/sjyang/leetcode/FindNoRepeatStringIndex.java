package com.sjyang.leetcode;

/**
 * @author ：saijun.yang
 * @date ：Created in 2019/3/26 13:48
 * @description：给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * @modified By：
 * @version:
 */
public class FindNoRepeatStringIndex {
    public static void main(String[] args) {
        String str = "pwwkew";
        lengthOfLongestLengthsubstring(str);
    }

    public static void lengthOfLongestLengthsubstring(String s){
        int lengthStr = s.length();
        String temp = "";
        int result = 0;
        String head = "";
        String second = "";
        for (int i = 0; i < lengthStr; i++) {
            head = String.valueOf(s.charAt(i));
            temp = head;
            int resultTemp = 1;
            for (int j = i+1; j < lengthStr; j++) {
                second = String.valueOf(s.charAt(j));
                if(temp.indexOf(second) ==-1){
                    temp=temp+second;
                    resultTemp++;
                }else{
                    break;
                }
            }
            if(resultTemp > result){
                result = resultTemp;
                resultTemp = 0;
            }
        }
        System.out.println(result);
    }
}
