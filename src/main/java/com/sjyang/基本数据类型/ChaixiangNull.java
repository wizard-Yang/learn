package com.sjyang.基本数据类型;

/**
 * @author saijun.yang
 * @date Created in 2019/12/16 16:23
 * @description 自动拆箱为null
 * 结果是空指针异常：Exception in thread "main" java.lang.NullPointerException
 */
public class ChaixiangNull {
    public static void main(String[] args) {
        new ChaixiangNull().func();
    }
    public Integer integer;
    public int func(){
        return integer;
    }
}
