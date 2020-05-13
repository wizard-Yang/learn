package com.sjyang.leetcode.有效的括号;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author saijun.yang
 * @date 2020/5/12 16:03
 * @description : 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * 思路：立马想到栈这种结构
 */
public class Solution {
    public static void main(String[] args) {
        String str1 = "[])";
        String str2 = "{({})[]}";
        String str3 = "";
        System.out.println(isValid2(str2));
    }
    public static boolean isValid(String s) {
        boolean result = true;
        if(s == null || s.length() == 0){
            return result;
        }
        Set<String> set = new HashSet<>(3);
        set.add("{}");
        set.add("()");
        set.add("[]");
        char[] charArr = s.toCharArray();
        //栈数据结构
        Stack<Character> stack = new Stack();
        //stack.push(charArr[0]);
        for (int i = 0; i < charArr.length; i++) {
            if(!stack.isEmpty()){
                char head = stack.peek();
                String nearTwo = head+String.valueOf(charArr[i]);
                if(set.contains(nearTwo)){
                    stack.pop();
                }else{
                    stack.push(charArr[i]);
                }
            }else{
                stack.push(charArr[i]);
            }
        }
        result = stack.isEmpty();
        return result;
    }

    /**
     * 执行时间是第一次的20倍左右
     * 空间复杂度与第一次基本一致
     * @param s
     * @return
     */
    public static boolean isValid2(String s) {
        if(s.isEmpty()) return true;
        Stack<Character> stack=new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='(')
                stack.push(')');
            else if(c=='{')
                stack.push('}');
            else if(c=='[')
                stack.push(']');
            else if(stack.empty()||c!=stack.pop())
                return false;
        }
        if(stack.empty())
            return true;
        return false;
    }
}
