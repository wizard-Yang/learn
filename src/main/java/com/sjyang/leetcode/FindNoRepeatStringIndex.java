package com.sjyang.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：saijun.yang
 * @date ：Created in 2019/3/26 13:48
 * @description：给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * @modified By：
 * @version:
 */
public class FindNoRepeatStringIndex {
    public static void main(String[] args) {
        String str = "abcdefdabcdefg";
        lengthOfLongestLengthsubstring(str);
        System.out.println(lengthOfLongestSubstring(str));
    }

    /**
     * charAt(int index)返回指定索引位置的char值
     * 暴力发解决
     * 时间复杂度：T(n)=n^2;
     * 空间复杂度：S(n)=O(1)
     * @param s
     */
    public static void lengthOfLongestLengthsubstring(String s){
        int lengthStr = s.length();
        String temp = "";
        int result = 0;
        String head = "";
        String second = "";
        for (int i = 0; i < lengthStr; i++) {//循环遍历字符串
            head = String.valueOf(s.charAt(i));//拿到第一个字符
            temp = head;//临时字符串赋值
            int resultTemp = 1;//临时结果值为1，最坏情况都是一样的字符
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
            }
        }
        System.out.println(result);
    }
    /**
     * 使用滑动窗口进行解析
     * 滑动窗口一般条件都是以主字符串为操作对象
     * 通过双指针来获得子字符串，具体子字符串按照题目要求进行操作
     * pwwkew
     */
    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int ans = 0;
        for (int end = 0 ,start = 0;end < s.length(); end++) {
            char alpha = s.charAt(end);
            if(map.containsKey(alpha)){
                start = Math.max(map.get(alpha),start);
            }
            ans = Math.max(ans,end-start+1);
            map.put(alpha,end+1);//加一是为了表示从下一个字符开始重复
        }
        return ans;
    }
}
