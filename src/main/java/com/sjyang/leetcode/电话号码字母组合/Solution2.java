package com.sjyang.leetcode.电话号码字母组合;

import java.util.*;

/**
 * @author saijun.yang
 * @date 2020/5/8 13:46
 * @description 借助队列实现（很怀疑ArrayList是不是队列）
 */
public class Solution2 {
    public static void main(String[] args) {
        String str = "237";
        List<String> list = letterCombinations(str);
        System.out.println(list);
        System.out.println(list.size());

    }
    public static List<String> letterCombinations(String digits) {
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
        map.put("2",char2);
        map.put("3",char3);
        map.put("4",char4);
        map.put("5",char5);
        map.put("6",char6);
        map.put("7",char7);
        map.put("8",char8);
        map.put("9",char9);

        //创建队列
        List queue = new ArrayList();
        queue.add("");
        for (int x = 0; x < charArr.length; x++) {
            char ele = charArr[x];
            char[] eleArr = map.get(String.valueOf(ele));
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String head = String.valueOf(queue.remove(0));
                for (int y = 0; y < eleArr.length; y++) {
                    queue.add(head+eleArr[y]);
                }
            }
        }
        return queue;
    }
}
