package com.sjyang.leetcode.判断子序列;

/**
 * @author saijun.yang
 * @date 2020/7/27 19:19
 * @description 判断子序列
 * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 * 你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），
 * 而 s 是个短字符串（长度 <=100）。
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）
 * 字符而不改变剩余字符相对位置形成的新字符串。
 * （例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 * 示例 1:
 * s = "abc", t = "ahbgdc"
 * 返回 true.
 * 示例 2:
 * s = "axc", t = "ahbgdc"
 * 返回 false.
 * 后续挑战 :
 * 如果有大量输入的 S，称作S1, S2, ... , Sk 其中 k >= 10亿，
 * 你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代码？
 * --------------------------------------------------------------------------------------------------
 * 分析：可以理解在t中找s,即s一个字符匹配后，找到匹配的位置继续查找。
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "aaaaaaaaaaaaaaaaaaa";
        String t = "bbaaaa";
        System.out.println(solution.isSubsequence(s,t));
    }
    public boolean isSubsequence(String s, String t) {
        char[] sCharArr = s.toCharArray();
        for (int i = 0; i < sCharArr.length; i++) {
            char ele = sCharArr[i];
            int index = t.indexOf(String.valueOf(ele));
            if(index != -1){
                if(index+1 <= t.length()){
                    t = t.substring(index+1);
                }else{
                    return false;
                }
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
    public boolean contain(char ele,String next){
        return next.contains(String.valueOf(ele));
    }
}
