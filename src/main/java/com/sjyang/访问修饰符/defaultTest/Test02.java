package com.sjyang.访问修饰符.defaultTest;

/**
 * @author saijun.yang
 * @date 2020/4/16 9:07
 * @description Test01类中方法是default修饰符，只能本包使用。即使继承也无法使用
 */
public class Test02 {
    public static void main(String[] args) {
        Test01 test = new Test01();
        test.method();
    }
}
