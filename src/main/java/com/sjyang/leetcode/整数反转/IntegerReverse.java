package com.sjyang.leetcode.整数反转;

/**
 * @author saijun.yang
 * @date Created in 2019/9/5 11:21
 * @description 整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 * 输入: 123
 * 输出: 321
 *
 * 示例 2:
 * 输入: -123
 * 输出: -321
 *
 * 示例 3:
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。
 * 请根据这个假设，如果反转后整数溢出那么就返回 0。
 */
public class IntegerReverse {
    public static void main(String[] args) {
        int zhengshu = 123456;
        int fushu = -654321;
        System.out.println(reverse(zhengshu));
        System.out.println(reverse(fushu));

    }

    /**
     * 自己做法，转换字符串做法
     * @param x
     * @return
     */
    public static int reverse(int x) {
        if(x > 0){
            char[] c = String.valueOf(x).toCharArray();
            int flag = c.length;
            for (int i = flag-1; i >=0 ; i--) {
                if(Integer.parseInt(String.valueOf(c[i])) > 0){
                    flag = i;
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = flag; i >= 0; i--) {
                sb.append(c[i]);
            }
            if(Long.parseLong(sb.toString()) > Integer.MAX_VALUE){
                return 0;
            }else{
                return Integer.parseInt(sb.toString());
            }

        }else if(x == 0){
            return x;
        }else{
            String ex = String.valueOf(x);
            char[] c = ex.substring(1).toCharArray();
            int flag = ex.length()-1;
            for (int i = flag-1; i >=0 ; i--) {
                if(Integer.parseInt(String.valueOf(c[i])) > 0){
                    flag = i;
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = flag; i >= 0; i--) {
                sb.append(c[i]);
            }
            if(-Long.parseLong(sb.toString()) < Integer.MIN_VALUE){
                return 0;
            }else{
                return Integer.parseInt(sb.toString())*-1;
            }
        }
    }

    public int reverse2(int x){
        //123
        int ans = 0;
        while (x != 0) {
            int pop = x % 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;
            ans = ans * 10 + pop;
            x /= 10;
        }
        return ans;
    }
}
