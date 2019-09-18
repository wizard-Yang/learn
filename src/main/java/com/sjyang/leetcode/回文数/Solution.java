package com.sjyang.leetcode.回文数;

/**
 * @author saijun.yang
 * @date Created in 2019/9/9 11:07
 * @description 整数的最长回文数
 * @modified By
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 * 输入: 121
 * 输出: true
 *
 * 示例 2:
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 *
 * 示例 3:
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 进阶:
 *
 * 你能不将整数转为字符串来解决这个问题吗？
 */
public class Solution {
    public static void main(String[] args) {
        int param = 121;
        Solution solution = new Solution();
        boolean result = solution.isPalindrome2(param);
        System.out.println(result);

    }
    /**
     * 分析：
     * 1.负数一定不是回文整数
     * 2.以0结尾的一定不是回文数
     * 3.第一种解法转化为字符串
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if(x < 0 || (x%10 == 0 && x!=0)){
            return false;
        }
        String str = String.valueOf(x);
        char[] chars = str.toCharArray();
        boolean result = true;
        if(str.length() % 2 != 0){//奇数
            int center = str.length()/2;
            int start = 0;
            int end = str.length()-1;
            while(chars[start] == chars[end]){
                if(start == end){
                    return result;
                }
                start++;
                end--;
            }
            return false;
        }else{//偶数
            int start = 0;
            int end = str.length()-1;
            while(chars[start] == chars[end]){
                if(start == (end-1)){
                    return result;
                }
                start++;
                end--;
            }
            return false;
        }
    }


    /**
     * 第二种解法为不转变为字符串
     * @param x
     * @return
     */
    public boolean isPalindrome2(int x) {
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x == revertedNumber || x == revertedNumber/10;

    }
}
