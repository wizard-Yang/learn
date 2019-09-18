package com.sjyang.leetcode.最长回文字符串;

/**
 * @author saijun.yang
 * @date Created in 2019/9/2 17:27
 * @description 最长回文字符串解法
 * @modified By
 * 中心扩展算法
 */
public class LongestRepeatString2 {
    public static void main(String[] args) {
        LongestRepeatString2 longestRepeatString2 = new LongestRepeatString2();
        System.out.println(longestRepeatString2.longestPalindrome1("babad"));
    }
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);//奇数对称
            int len2 = expandAroundCenter(s, i, i + 1);//偶数对称
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }



    public String longestPalindrome1(String s) {
        if(s == null || s.length()<1)return "";
        int start = 0;
        int end = 0;
        for(int i = 0;i < s.length();i++){
            int lenOdd = oddAndEvenCenterLength(s,i,i);//奇数
            int lenEven = oddAndEvenCenterLength(s,i,i+1);//偶数
            int len = Math.max(lenOdd,lenEven);
            if(len > end-start){
                start = i - (len-1)/2;
                end = i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
    //找出奇数或者偶数围绕中心对称的长度
    private int oddAndEvenCenterLength(String s,int L,int R){
        int left = L;
        int right = R;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left+1;
    }

}
