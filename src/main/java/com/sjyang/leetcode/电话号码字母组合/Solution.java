package com.sjyang.leetcode.电话号码字母组合;

import java.util.*;

/**
 * @author saijun.yang
 * @date 2020/5/8 9:36
 * @description 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * (按手机上数字键对应字母，例如2-abc  3-def  只有7、9特殊有4个字母)
 * 边界值：
 * 1.是否可以输入重复值？如112，这样排列应该也没有重复的
 * 2.7和9是需要关注的，因为有4个字母
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 *
 * 这里使用回溯算法
 */
public class Solution {
    public static void main(String[] args) {
        String str = "23";
        List<String> list = letterCombinations(str);
        System.out.println(list);
        System.out.println(list.size());

    }
    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        char[] charArr = digits.toCharArray();
        int len = charArr.length;
        if(len == 0){
            return Collections.emptyList();
        }
        char[] char2 = {'a','b','c'};
        char[] char3 = {'d','e','f'};
        char[] char4 = {'g','h','i'};
        char[] char5 = {'j','k','l'};
        char[] char6 = {'m','n','o'};
        char[] char7 = {'p','q','r','s'};
        char[] char8 = {'t','u','v'};
        char[] char9 = {'w','x','y','z'};
        Map<String,char[]> map = new HashMap();
        map.put("char2",char2);
        map.put("char3",char3);
        map.put("char4",char4);
        map.put("char5",char5);
        map.put("char6",char6);
        map.put("char7",char7);
        map.put("char8",char8);
        map.put("char9",char9);
        recycle(map,0,charArr,"",list);
        return list;
    }

    public static void recycle(Map<String,char[]> map,int len,char[] charArr,String appendStr,List<String> list){
        if(charArr.length > len){
            char param = charArr[len];
            char[] base = map.get("char"+param);
            len++;
            for (int i = 0; i < base.length; i++) {
                //appendStr = appendStr + base[i];
                recycle(map,len,charArr,appendStr + base[i],list);
                //appendStr = appendStr.substring(0,appendStr.length()-1);
            }
        }else{
            list.add(appendStr);
        }
    }
}
