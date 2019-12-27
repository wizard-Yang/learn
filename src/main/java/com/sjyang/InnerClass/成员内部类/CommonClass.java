package com.sjyang.InnerClass.成员内部类;

/**
 * @author saijun.yang
 * @date Created in 2019/12/27 14:23
 * @description 成员内部类，也叫一般内部类，就是一般类中定义一个类
 */
public class CommonClass {
    public static void main(String[] args) {
        CommonClass commonClass = new CommonClass();
    }

    private String attr = "私有外部成员属性";
    public String attr2 = "公有外部成员属性";
    public static String attr3 = "公有静态外部成员属性";
    public static final String attr4 = "公有静态不可变外部成员属性";
    public void func(){
        System.out.println();
    }
    /**
     * 成员内部类
     * 依赖外部类的创建
     * 不允许有静态变量
     * 但是可以有静态常量
     */
    class Inner{
        private String attrIn = "私有内部成员属性";
        public String attr2In = "公有内部成员属性";
        //public static String attr3 = "";//这样设置有误
        public static final String attr4In = "公有静态不可变内部成员属性";
        //public static final String attr5In = new String("");这样设置有误
    }

}

