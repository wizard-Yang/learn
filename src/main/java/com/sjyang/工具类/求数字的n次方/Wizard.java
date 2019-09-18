package com.sjyang.工具类.求数字的n次方;

/**
 * @author saijun.yang
 * @date Created in 2019/9/5 11:26
 * @description 求一个数的n次方，用工具类
 *   *Math.sqrt()//计算平方根
 *   *Math.cbrt()//计算立方根
 *   *Math.pow(a, b)//计算a的b次方
 *   *Math.max( , );//计算最大值
 *   *Math.min( , );//计算最小值
 * @modified By
 */
public class Wizard {
    public static void main(String[] args) {
        int num = 2;
        int result = (int)Math.pow(-2,31);
        System.out.println(result);
        System.out.println(Integer.MIN_VALUE);

        System.out.println("--------------------");
        int maxOne = 2147483647;
    }
}
