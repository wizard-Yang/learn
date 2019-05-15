package com.sjyang.算法;

/**
 * @author ：saijun.yang
 * @date ：Created in 2019/5/8 10:34
 * @description：递归
 * 1.直接递归：调用本身
 * 2.间接递归：A调用其他方法B，B方法调用A
 * 实例：
 *  1.斐波那契数列。1 1 2 3 5 8 13 21 34
 *  2.求连续自然数之和。1+2+3+4+...+n
 *  3.求一个数的阶乘。例如5！=1*2*3*4*5
 * @modified By：被谁修改
 * @version:1.0
 */
public class Recursion {
    private static int total = 0;//和
    private static int start = 1;//加法起始数
    public static void main(String[] args) {
        //连续自然数求和
        int n = 10;
        getSum1(n);
        System.out.println(getSum2(n));
        total = 0;
        getSum3(n);
        System.out.println(getSum4(n));

        //斐波那契
        int m = 30;
        for (int i = 1; i <=m ; i++) {
            System.out.print(feiBoNaQie(i)+",");
        }
    }

    /***
     * 求连续自然数之和
     * getSum1:简单法
     * getSum2:使用递归
     */
    static void getSum1(int n){
        int result = 0;
        StringBuffer sb = new StringBuffer(20);
        for (int i = 1; i <= n ; i++) {
            sb.append(i);
            if(i == n){
                sb.append("=");
            }else{
                sb.append("+");
            }
            result += i;
        }
        System.out.println(sb.toString()+result);
    }

    /**
     * 递归中需要在外部进行变量定义，否则无法进行
     * @param n
     * @return
     */
    static int getSum2(int n){
        if(start <= n){
            total += start;
            start++;
            getSum2(n);
        }
        return total;
    }
    //递归实现的第二种方式
    static void getSum3(int n){
        total+=n--;
        if(n > 0){
            getSum3(n);
        }else{
            System.out.println("结果为："+total);
        }
    };
    //递归实现的第三种方式-个人认为是最好的
    static int getSum4(int n){
        if(n==1){
            return n;
        }else{
            return n+getSum4(n-1);
        }
    }

    static int feiBoNaQie(int n){
        if(n == 1 || n == 2){
            return 1;
        }else{
            return feiBoNaQie(n-1)+feiBoNaQie(n-2);
        }
    }
}
