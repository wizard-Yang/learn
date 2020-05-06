package com.sjyang.leetcode.最长公共前缀;

/**
 * @author saijun.yang
 * @date 2020/4/29 8:57
 * @description 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * 所有输入只包含小写字母 a-z 。
 */
public class Solution {
    public static void main(String[] args) {
        //String[] strs = {"flower","flow","flight"};
        String[] strs = {"aa", "a"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        char[] first = strs[0].toCharArray();
        int len = first.length;
        for (int i = 0; i < len; i++) {
            char head = first[i];
            sb.append(head);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].toCharArray().length >= i + 1 && sb.toString().equals(strs[j].substring(0, i + 1))) {
                    continue;
                } else {
                    sb.deleteCharAt(i);
                    return sb.toString();
                }
            }
        }
        return sb.toString();
    }

    public static String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0)
            return "";
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < ans.length() && j < strs[i].length(); j++) {
                if (ans.charAt(j) != strs[i].charAt(j))
                    break;
            }
            ans = ans.substring(0, j);
            if (ans.equals(""))
                return ans;
        }
        return ans;
    }
}
