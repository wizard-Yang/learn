package com.sjyang.字符串.null值equals;

/**
 * @author saijun.yang
 * @date 2020/1/8 11:30
 * @description null的equals比较
 * 结论：null.equals("string")编译通过，但是会报空指针异常
 *      "字符串".equals(null)可以比较
 */
public class Null {
    public static void main(String[] args) {
        String str = null;
        Double a = null;
        System.out.println(a.toString());
        System.out.println("a".equals(null));
        if(str.equals("ac")){
            System.out.println("不可以比较");
        }
    }
}
